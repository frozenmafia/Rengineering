package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import o.Fragment;
import o.loadClass;
import o.onStartActivityFromFragment;
/* loaded from: classes4.dex */
public class RoundedCornersDrawable extends loadClass implements onStartActivityFromFragment {
    private Matrix HaptikSDK$a;
    private final Path HaptikSDK$b;
    private RectF HaptikSDK$c;
    private final Path HaptikSDK$d;
    private float HaptikSDK$e;
    private boolean HaptikWebView;
    private final RectF a;
    final float[] ah$a;
    private float ah$b;
    private boolean ak;
    private int getInitSettings;
    private boolean getSignupData;
    private final RectF invoke;
    private final float[] onXdkEvent;
    Type toString;
    final Paint valueOf;
    private int values;

    /* loaded from: classes4.dex */
    public enum Type {
        OVERLAY_COLOR,
        CLIPPING
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) drawable.getClass());
        this.toString = Type.OVERLAY_COLOR;
        this.invoke = new RectF();
        this.onXdkEvent = new float[8];
        this.ah$a = new float[8];
        this.valueOf = new Paint(1);
        this.getSignupData = false;
        this.ah$b = 0.0f;
        this.values = 0;
        this.getInitSettings = 0;
        this.HaptikSDK$e = 0.0f;
        this.ak = false;
        this.HaptikWebView = false;
        this.HaptikSDK$d = new Path();
        this.HaptikSDK$b = new Path();
        this.a = new RectF();
    }

    @Override // o.onStartActivityFromFragment
    public void toString(boolean z) {
        this.getSignupData = z;
        values();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void toString(float f) {
        Arrays.fill(this.onXdkEvent, f);
        values();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.onXdkEvent, 0.0f);
        } else {
            Fragment.AnonymousClass8.valueOf(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.onXdkEvent, 0, 8);
        }
        values();
        invalidateSelf();
    }

    public void valueOf(int i) {
        this.getInitSettings = i;
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(int i, float f) {
        this.values = i;
        this.ah$b = f;
        values();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ag$a(float f) {
        this.HaptikSDK$e = f;
        values();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void ah$a(boolean z) {
        this.ak = z;
        values();
        invalidateSelf();
    }

    @Override // o.onStartActivityFromFragment
    public void values(boolean z) {
        if (this.HaptikWebView != z) {
            this.HaptikWebView = z;
            invalidateSelf();
        }
    }

    public boolean valueOf() {
        return this.HaptikWebView;
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        values();
    }

    private void values() {
        float[] fArr;
        this.HaptikSDK$d.reset();
        this.HaptikSDK$b.reset();
        this.a.set(getBounds());
        RectF rectF = this.a;
        float f = this.HaptikSDK$e;
        rectF.inset(f, f);
        if (this.toString == Type.OVERLAY_COLOR) {
            this.HaptikSDK$d.addRect(this.a, Path.Direction.CW);
        }
        if (this.getSignupData) {
            this.HaptikSDK$d.addCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, Path.Direction.CW);
        } else {
            this.HaptikSDK$d.addRoundRect(this.a, this.onXdkEvent, Path.Direction.CW);
        }
        RectF rectF2 = this.a;
        float f2 = -this.HaptikSDK$e;
        rectF2.inset(f2, f2);
        RectF rectF3 = this.a;
        float f3 = this.ah$b / 2.0f;
        rectF3.inset(f3, f3);
        if (this.getSignupData) {
            this.HaptikSDK$b.addCircle(this.a.centerX(), this.a.centerY(), Math.min(this.a.width(), this.a.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.ah$a;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.onXdkEvent[i] + this.HaptikSDK$e) - (this.ah$b / 2.0f);
                i++;
            }
            this.HaptikSDK$b.addRoundRect(this.a, fArr, Path.Direction.CW);
        }
        RectF rectF4 = this.a;
        float f4 = (-this.ah$b) / 2.0f;
        rectF4.inset(f4, f4);
    }

    /* renamed from: com.facebook.drawee.drawable.RoundedCornersDrawable$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[Type.values().length];
            toString = iArr;
            try {
                iArr[Type.CLIPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[Type.OVERLAY_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.loadClass, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.invoke.set(getBounds());
        int i = AnonymousClass1.toString[this.toString.ordinal()];
        if (i == 1) {
            int save = canvas.save();
            canvas.clipPath(this.HaptikSDK$d);
            super.draw(canvas);
            canvas.restoreToCount(save);
        } else if (i == 2) {
            if (this.ak) {
                RectF rectF = this.HaptikSDK$c;
                if (rectF == null) {
                    this.HaptikSDK$c = new RectF(this.invoke);
                    this.HaptikSDK$a = new Matrix();
                } else {
                    rectF.set(this.invoke);
                }
                RectF rectF2 = this.HaptikSDK$c;
                float f = this.ah$b;
                rectF2.inset(f, f);
                this.HaptikSDK$a.setRectToRect(this.invoke, this.HaptikSDK$c, Matrix.ScaleToFit.FILL);
                int save2 = canvas.save();
                canvas.clipRect(this.invoke);
                canvas.concat(this.HaptikSDK$a);
                super.draw(canvas);
                canvas.restoreToCount(save2);
            } else {
                super.draw(canvas);
            }
            this.valueOf.setStyle(Paint.Style.FILL);
            this.valueOf.setColor(this.getInitSettings);
            this.valueOf.setStrokeWidth(0.0f);
            this.valueOf.setFilterBitmap(valueOf());
            this.HaptikSDK$d.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.HaptikSDK$d, this.valueOf);
            if (this.getSignupData) {
                float width = ((this.invoke.width() - this.invoke.height()) + this.ah$b) / 2.0f;
                float height = ((this.invoke.height() - this.invoke.width()) + this.ah$b) / 2.0f;
                if (width > 0.0f) {
                    canvas.drawRect(this.invoke.left, this.invoke.top, this.invoke.left + width, this.invoke.bottom, this.valueOf);
                    canvas.drawRect(this.invoke.right - width, this.invoke.top, this.invoke.right, this.invoke.bottom, this.valueOf);
                }
                if (height > 0.0f) {
                    canvas.drawRect(this.invoke.left, this.invoke.top, this.invoke.right, this.invoke.top + height, this.valueOf);
                    canvas.drawRect(this.invoke.left, this.invoke.bottom - height, this.invoke.right, this.invoke.bottom, this.valueOf);
                }
            }
        }
        if (this.values != 0) {
            this.valueOf.setStyle(Paint.Style.STROKE);
            this.valueOf.setColor(this.values);
            this.valueOf.setStrokeWidth(this.ah$b);
            this.HaptikSDK$d.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(this.HaptikSDK$b, this.valueOf);
        }
    }
}
