package com.BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.PixelUtil;
/* loaded from: classes.dex */
public class LinearGradientView extends View {
    private int[] HaptikSDK$a;
    private LinearGradient HaptikSDK$b;
    private Path HaptikSDK$c;
    private boolean HaptikWebView;
    private float ag$a;
    private float[] ah$a;
    private float[] ah$b;
    private float[] getInitSettings;
    private RectF getSignupData;
    private final Paint invoke;
    private float[] toString;
    private float[] valueOf;
    private int[] values;

    public LinearGradientView(Context context) {
        super(context);
        this.invoke = new Paint(1);
        this.getInitSettings = new float[]{0.0f, 0.0f};
        this.valueOf = new float[]{0.0f, 1.0f};
        this.HaptikWebView = false;
        this.toString = new float[]{0.5f, 0.5f};
        this.ag$a = 45.0f;
        this.HaptikSDK$a = new int[]{0, 0};
        this.ah$a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    public void setStartPosition(ReadableArray readableArray) {
        this.getInitSettings = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        values();
    }

    public void setEndPosition(ReadableArray readableArray) {
        this.valueOf = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        values();
    }

    public void setColors(ReadableArray readableArray) {
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = readableArray.getInt(i);
        }
        this.values = iArr;
        values();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = (float) readableArray.getDouble(i);
        }
        this.ah$b = fArr;
        values();
    }

    public void setUseAngle(boolean z) {
        this.HaptikWebView = z;
        values();
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.toString = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        values();
    }

    public void setAngle(float f) {
        this.ag$a = f;
        values();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i));
        }
        this.ah$a = fArr;
        valueOf();
        values();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.HaptikSDK$a = new int[]{i, i2};
        valueOf();
        values();
    }

    private float[] toString(float f) {
        float sqrt = (float) Math.sqrt(2.0d);
        double d = (f - 90.0f) * 0.017453292f;
        return new float[]{((float) Math.cos(d)) * sqrt, ((float) Math.sin(d)) * sqrt};
    }

    private void values() {
        int[] iArr = this.values;
        if (iArr != null) {
            float[] fArr = this.ah$b;
            if (fArr == null || iArr.length == fArr.length) {
                float[] fArr2 = this.getInitSettings;
                float[] fArr3 = this.valueOf;
                if (this.HaptikWebView && this.toString != null) {
                    float[] linearGradientView = toString(this.ag$a);
                    float[] fArr4 = this.toString;
                    float[] fArr5 = {fArr4[0] - (linearGradientView[0] / 2.0f), fArr4[1] - (linearGradientView[1] / 2.0f)};
                    fArr3 = new float[]{fArr4[0] + (linearGradientView[0] / 2.0f), fArr4[1] + (linearGradientView[1] / 2.0f)};
                    fArr2 = fArr5;
                }
                float f = fArr2[0];
                int[] iArr2 = this.HaptikSDK$a;
                LinearGradient linearGradient = new LinearGradient(iArr2[0] * f, fArr2[1] * iArr2[1], fArr3[0] * iArr2[0], fArr3[1] * iArr2[1], this.values, this.ah$b, Shader.TileMode.CLAMP);
                this.HaptikSDK$b = linearGradient;
                this.invoke.setShader(linearGradient);
                invalidate();
            }
        }
    }

    private void valueOf() {
        if (this.HaptikSDK$c == null) {
            this.HaptikSDK$c = new Path();
            this.getSignupData = new RectF();
        }
        this.HaptikSDK$c.reset();
        RectF rectF = this.getSignupData;
        int[] iArr = this.HaptikSDK$a;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.HaptikSDK$c.addRoundRect(this.getSignupData, this.ah$a, Path.Direction.CW);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.HaptikSDK$c;
        if (path == null) {
            canvas.drawPaint(this.invoke);
        } else {
            canvas.drawPath(path, this.invoke);
        }
    }
}
