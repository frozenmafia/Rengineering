package com.theartofdev.edmodo.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.Arrays;
import o.decryptKey;
import o.encryptKey;
/* loaded from: classes5.dex */
public class CropOverlayView extends View {
    private final RectF HaptikSDK$a;
    private Paint HaptikSDK$b;
    private float HaptikSDK$c;
    private CropImageView.CropShape HaptikSDK$d;
    private toString HaptikSDK$e;
    private final RectF HaptikWebView;
    private ScaleGestureDetector ICustomTabsCallback;
    private Paint a;
    private Paint ag$a;
    private int ah$a;
    private final float[] ah$b;
    private CropWindowMoveHandler aj$a;
    private float ak;
    private Integer ak$a;
    private float ak$b;
    private boolean extraCallback;
    private Path extraCallbackWithResult;
    private boolean getInitSettings;
    private final decryptKey getSignupData;
    private Paint invoke;
    private final Rect isLogoutPending;
    private float onMessageChannelReady;
    private int onNavigationEvent;
    private int onPostMessage;
    private float onRelationshipValidationResult;
    private CropImageView.Guidelines onXdkEvent;
    private boolean toString;
    private float valueOf;
    private int values;

    /* loaded from: classes5.dex */
    public interface toString {
        void valueOf(boolean z);
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getSignupData = new decryptKey();
        this.HaptikWebView = new RectF();
        this.extraCallbackWithResult = new Path();
        this.ah$b = new float[8];
        this.HaptikSDK$a = new RectF();
        this.onMessageChannelReady = this.ah$a / this.values;
        this.isLogoutPending = new Rect();
    }

    public void setCropWindowChangeListener(toString tostring) {
        this.HaptikSDK$e = tostring;
    }

    public RectF HaptikSDK$c() {
        return this.getSignupData.HaptikSDK$c();
    }

    public void setCropWindowRect(RectF rectF) {
        this.getSignupData.ah$a(rectF);
    }

    public void values() {
        RectF HaptikSDK$c = HaptikSDK$c();
        toString(HaptikSDK$c);
        this.getSignupData.ah$a(HaptikSDK$c);
    }

    public void setBounds(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.ah$b, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.ah$b, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.ah$b, 0, fArr.length);
            }
            this.onNavigationEvent = i;
            this.onPostMessage = i2;
            RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
            if (HaptikSDK$c.width() == 0.0f || HaptikSDK$c.height() == 0.0f) {
                ah$b();
            }
        }
    }

    public void HaptikSDK$a() {
        if (this.toString) {
            setCropWindowRect(encryptKey.valueOf);
            ah$b();
            invalidate();
        }
    }

    public CropImageView.CropShape ag$a() {
        return this.HaptikSDK$d;
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.HaptikSDK$d != cropShape) {
            this.HaptikSDK$d = cropShape;
            if (Build.VERSION.SDK_INT <= 17) {
                if (this.HaptikSDK$d == CropImageView.CropShape.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.ak$a = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.ak$a = null;
                    }
                } else {
                    Integer num = this.ak$a;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.ak$a = null;
                    }
                }
            }
            invalidate();
        }
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.onXdkEvent != guidelines) {
            this.onXdkEvent = guidelines;
            if (this.toString) {
                invalidate();
            }
        }
    }

    public boolean invoke() {
        return this.getInitSettings;
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.getInitSettings != z) {
            this.getInitSettings = z;
            if (this.toString) {
                ah$b();
                invalidate();
            }
        }
    }

    public int valueOf() {
        return this.ah$a;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.ah$a != i) {
            this.ah$a = i;
            this.onMessageChannelReady = i / this.values;
            if (this.toString) {
                ah$b();
                invalidate();
            }
        }
    }

    public int ah$a() {
        return this.values;
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        }
        if (this.values != i) {
            this.values = i;
            this.onMessageChannelReady = this.ah$a / i;
            if (this.toString) {
                ah$b();
                invalidate();
            }
        }
    }

    public void setSnapRadius(float f) {
        this.ak$b = f;
    }

    public boolean ah$a(boolean z) {
        if (this.extraCallback != z) {
            this.extraCallback = z;
            if (z && this.ICustomTabsCallback == null) {
                this.ICustomTabsCallback = new ScaleGestureDetector(getContext(), new CropOverlayView$ah$a(this));
                return true;
            }
            return true;
        }
        return false;
    }

    public void setMinCropResultSize(int i, int i2) {
        this.getSignupData.ag$a(i, i2);
    }

    public void setMaxCropResultSize(int i, int i2) {
        this.getSignupData.toString(i, i2);
    }

    public void setCropWindowLimits(float f, float f2, float f3, float f4) {
        this.getSignupData.toString(f, f2, f3, f4);
    }

    public Rect HaptikSDK$b() {
        return this.isLogoutPending;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.isLogoutPending;
        if (rect == null) {
            rect = encryptKey.ag$a;
        }
        rect2.set(rect);
        if (this.toString) {
            ah$b();
            invalidate();
            ag$a(false);
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.getSignupData.ag$a(cropImageOptions);
        setCropShape(cropImageOptions.isLogoutPending);
        setSnapRadius(cropImageOptions.updateVisuals);
        setGuidelines(cropImageOptions.ICustomTabsCallback);
        setFixedAspectRatio(cropImageOptions.aj$a);
        setAspectRatioX(cropImageOptions.ah$b);
        setAspectRatioY(cropImageOptions.HaptikSDK$b);
        ah$a(cropImageOptions.getDefaultImpl);
        this.onRelationshipValidationResult = cropImageOptions.warmup;
        this.ak = cropImageOptions.extraCallback;
        this.HaptikSDK$b = values(cropImageOptions.getSignupData, cropImageOptions.HaptikSDK$d);
        this.HaptikSDK$c = cropImageOptions.HaptikWebView;
        this.valueOf = cropImageOptions.getInitSettings;
        this.invoke = values(cropImageOptions.HaptikSDK$e, cropImageOptions.HaptikSDK$c);
        this.a = values(cropImageOptions.ak$a, cropImageOptions.ak$b);
        this.ag$a = valueOf(cropImageOptions.HaptikSDK$a);
    }

    private void ah$b() {
        float max = Math.max(encryptKey.values(this.ah$b), 0.0f);
        float max2 = Math.max(encryptKey.HaptikSDK$b(this.ah$b), 0.0f);
        float min = Math.min(encryptKey.HaptikSDK$a(this.ah$b), getWidth());
        float min2 = Math.min(encryptKey.toString(this.ah$b), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        RectF rectF = new RectF();
        this.toString = true;
        float f = this.ak;
        float f2 = min - max;
        float f3 = f * f2;
        float f4 = min2 - max2;
        float f5 = f * f4;
        if (this.isLogoutPending.width() > 0 && this.isLogoutPending.height() > 0) {
            rectF.left = (this.isLogoutPending.left / this.getSignupData.invoke()) + max;
            rectF.top = (this.isLogoutPending.top / this.getSignupData.ah$b()) + max2;
            rectF.right = rectF.left + (this.isLogoutPending.width() / this.getSignupData.invoke());
            rectF.bottom = rectF.top + (this.isLogoutPending.height() / this.getSignupData.ah$b());
            rectF.left = Math.max(max, rectF.left);
            rectF.top = Math.max(max2, rectF.top);
            rectF.right = Math.min(min, rectF.right);
            rectF.bottom = Math.min(min2, rectF.bottom);
        } else if (this.getInitSettings && min > max && min2 > max2) {
            if (f2 / f4 > this.onMessageChannelReady) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = getWidth() / 2.0f;
                this.onMessageChannelReady = this.ah$a / this.values;
                float max3 = Math.max(this.getSignupData.ag$a(), rectF.height() * this.onMessageChannelReady) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = getHeight() / 2.0f;
                float max4 = Math.max(this.getSignupData.values(), rectF.width() / this.onMessageChannelReady) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
        } else {
            rectF.left = max + f3;
            rectF.top = max2 + f5;
            rectF.right = min - f3;
            rectF.bottom = min2 - f5;
        }
        toString(rectF);
        this.getSignupData.ah$a(rectF);
    }

    private void toString(RectF rectF) {
        if (rectF.width() < this.getSignupData.ag$a()) {
            float ag$a = (this.getSignupData.ag$a() - rectF.width()) / 2.0f;
            rectF.left -= ag$a;
            rectF.right += ag$a;
        }
        if (rectF.height() < this.getSignupData.values()) {
            float values = (this.getSignupData.values() - rectF.height()) / 2.0f;
            rectF.top -= values;
            rectF.bottom += values;
        }
        if (rectF.width() > this.getSignupData.ah$a()) {
            float width = (rectF.width() - this.getSignupData.ah$a()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.getSignupData.valueOf()) {
            float height = (rectF.height() - this.getSignupData.valueOf()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        values(rectF);
        if (this.HaptikSDK$a.width() > 0.0f && this.HaptikSDK$a.height() > 0.0f) {
            float max = Math.max(this.HaptikSDK$a.left, 0.0f);
            float max2 = Math.max(this.HaptikSDK$a.top, 0.0f);
            float min = Math.min(this.HaptikSDK$a.right, getWidth());
            float min2 = Math.min(this.HaptikSDK$a.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (!this.getInitSettings || Math.abs(rectF.width() - (rectF.height() * this.onMessageChannelReady)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.onMessageChannelReady) {
            float abs = Math.abs((rectF.height() * this.onMessageChannelReady) - rectF.width()) / 2.0f;
            rectF.left += abs;
            rectF.right -= abs;
            return;
        }
        float abs2 = Math.abs((rectF.width() / this.onMessageChannelReady) - rectF.height()) / 2.0f;
        rectF.top += abs2;
        rectF.bottom -= abs2;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        valueOf(canvas);
        if (this.getSignupData.HaptikSDK$a()) {
            if (this.onXdkEvent == CropImageView.Guidelines.ON) {
                values(canvas);
            } else if (this.onXdkEvent == CropImageView.Guidelines.ON_TOUCH && this.aj$a != null) {
                values(canvas);
            }
        }
        ag$a(canvas);
        ah$a(canvas);
    }

    private void valueOf(Canvas canvas) {
        RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
        float max = Math.max(encryptKey.values(this.ah$b), 0.0f);
        float max2 = Math.max(encryptKey.HaptikSDK$b(this.ah$b), 0.0f);
        float min = Math.min(encryptKey.HaptikSDK$a(this.ah$b), getWidth());
        float min2 = Math.min(encryptKey.toString(this.ah$b), getHeight());
        if (this.HaptikSDK$d == CropImageView.CropShape.RECTANGLE) {
            if (!HaptikSDK$e() || Build.VERSION.SDK_INT <= 17) {
                canvas.drawRect(max, max2, min, HaptikSDK$c.top, this.ag$a);
                canvas.drawRect(max, HaptikSDK$c.bottom, min, min2, this.ag$a);
                canvas.drawRect(max, HaptikSDK$c.top, HaptikSDK$c.left, HaptikSDK$c.bottom, this.ag$a);
                canvas.drawRect(HaptikSDK$c.right, HaptikSDK$c.top, min, HaptikSDK$c.bottom, this.ag$a);
                return;
            }
            this.extraCallbackWithResult.reset();
            Path path = this.extraCallbackWithResult;
            float[] fArr = this.ah$b;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.extraCallbackWithResult;
            float[] fArr2 = this.ah$b;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.extraCallbackWithResult;
            float[] fArr3 = this.ah$b;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.extraCallbackWithResult;
            float[] fArr4 = this.ah$b;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.extraCallbackWithResult.close();
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.extraCallbackWithResult);
            } else {
                canvas.clipPath(this.extraCallbackWithResult, Region.Op.INTERSECT);
            }
            canvas.clipRect(HaptikSDK$c, Region.Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.ag$a);
            canvas.restore();
            return;
        }
        this.extraCallbackWithResult.reset();
        if (Build.VERSION.SDK_INT <= 17 && this.HaptikSDK$d == CropImageView.CropShape.OVAL) {
            this.HaptikWebView.set(HaptikSDK$c.left + 2.0f, HaptikSDK$c.top + 2.0f, HaptikSDK$c.right - 2.0f, HaptikSDK$c.bottom - 2.0f);
        } else {
            this.HaptikWebView.set(HaptikSDK$c.left, HaptikSDK$c.top, HaptikSDK$c.right, HaptikSDK$c.bottom);
        }
        this.extraCallbackWithResult.addOval(this.HaptikWebView, Path.Direction.CW);
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(this.extraCallbackWithResult);
        } else {
            canvas.clipPath(this.extraCallbackWithResult, Region.Op.XOR);
        }
        canvas.drawRect(max, max2, min, min2, this.ag$a);
        canvas.restore();
    }

    private void values(Canvas canvas) {
        if (this.a != null) {
            Paint paint = this.HaptikSDK$b;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
            HaptikSDK$c.inset(strokeWidth, strokeWidth);
            float width = HaptikSDK$c.width() / 3.0f;
            float height = HaptikSDK$c.height() / 3.0f;
            if (this.HaptikSDK$d == CropImageView.CropShape.OVAL) {
                float width2 = (HaptikSDK$c.width() / 2.0f) - strokeWidth;
                float height2 = (HaptikSDK$c.height() / 2.0f) - strokeWidth;
                float f = HaptikSDK$c.left + width;
                float f2 = HaptikSDK$c.right - width;
                float sin = (float) (height2 * Math.sin(Math.acos((width2 - width) / width2)));
                canvas.drawLine(f, (HaptikSDK$c.top + height2) - sin, f, (HaptikSDK$c.bottom - height2) + sin, this.a);
                canvas.drawLine(f2, (HaptikSDK$c.top + height2) - sin, f2, (HaptikSDK$c.bottom - height2) + sin, this.a);
                float f3 = HaptikSDK$c.top + height;
                float f4 = HaptikSDK$c.bottom - height;
                float cos = (float) (width2 * Math.cos(Math.asin((height2 - height) / height2)));
                canvas.drawLine((HaptikSDK$c.left + width2) - cos, f3, (HaptikSDK$c.right - width2) + cos, f3, this.a);
                canvas.drawLine((HaptikSDK$c.left + width2) - cos, f4, (HaptikSDK$c.right - width2) + cos, f4, this.a);
                return;
            }
            float f5 = HaptikSDK$c.left + width;
            float f6 = HaptikSDK$c.right - width;
            canvas.drawLine(f5, HaptikSDK$c.top, f5, HaptikSDK$c.bottom, this.a);
            canvas.drawLine(f6, HaptikSDK$c.top, f6, HaptikSDK$c.bottom, this.a);
            float f7 = HaptikSDK$c.top + height;
            float f8 = HaptikSDK$c.bottom - height;
            canvas.drawLine(HaptikSDK$c.left, f7, HaptikSDK$c.right, f7, this.a);
            canvas.drawLine(HaptikSDK$c.left, f8, HaptikSDK$c.right, f8, this.a);
        }
    }

    private void ag$a(Canvas canvas) {
        Paint paint = this.HaptikSDK$b;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
            float f = strokeWidth / 2.0f;
            HaptikSDK$c.inset(f, f);
            if (this.HaptikSDK$d == CropImageView.CropShape.RECTANGLE) {
                canvas.drawRect(HaptikSDK$c, this.HaptikSDK$b);
            } else {
                canvas.drawOval(HaptikSDK$c, this.HaptikSDK$b);
            }
        }
    }

    private void ah$a(Canvas canvas) {
        if (this.invoke != null) {
            Paint paint = this.HaptikSDK$b;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.invoke.getStrokeWidth();
            float f = strokeWidth2 / 2.0f;
            float f2 = (this.HaptikSDK$d == CropImageView.CropShape.RECTANGLE ? this.HaptikSDK$c : 0.0f) + f;
            RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
            HaptikSDK$c.inset(f2, f2);
            float f3 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f4 = f + f3;
            canvas.drawLine(HaptikSDK$c.left - f3, HaptikSDK$c.top - f4, HaptikSDK$c.left - f3, HaptikSDK$c.top + this.valueOf, this.invoke);
            canvas.drawLine(HaptikSDK$c.left - f4, HaptikSDK$c.top - f3, HaptikSDK$c.left + this.valueOf, HaptikSDK$c.top - f3, this.invoke);
            canvas.drawLine(HaptikSDK$c.right + f3, HaptikSDK$c.top - f4, HaptikSDK$c.right + f3, HaptikSDK$c.top + this.valueOf, this.invoke);
            canvas.drawLine(HaptikSDK$c.right + f4, HaptikSDK$c.top - f3, HaptikSDK$c.right - this.valueOf, HaptikSDK$c.top - f3, this.invoke);
            canvas.drawLine(HaptikSDK$c.left - f3, HaptikSDK$c.bottom + f4, HaptikSDK$c.left - f3, HaptikSDK$c.bottom - this.valueOf, this.invoke);
            canvas.drawLine(HaptikSDK$c.left - f4, HaptikSDK$c.bottom + f3, HaptikSDK$c.left + this.valueOf, HaptikSDK$c.bottom + f3, this.invoke);
            canvas.drawLine(HaptikSDK$c.right + f3, HaptikSDK$c.bottom + f4, HaptikSDK$c.right + f3, HaptikSDK$c.bottom - this.valueOf, this.invoke);
            canvas.drawLine(HaptikSDK$c.right + f4, HaptikSDK$c.bottom + f3, HaptikSDK$c.right - this.valueOf, HaptikSDK$c.bottom + f3, this.invoke);
        }
    }

    private static Paint valueOf(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    private static Paint values(float f, int i) {
        if (f > 0.0f) {
            Paint paint = new Paint();
            paint.setColor(i);
            paint.setStrokeWidth(f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.extraCallback) {
                this.ICustomTabsCallback.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                values(motionEvent.getX(), motionEvent.getY());
                return true;
            }
            if (action != 1) {
                if (action == 2) {
                    ag$a(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            getInitSettings();
            return true;
        }
        return false;
    }

    private void values(float f, float f2) {
        CropWindowMoveHandler values = this.getSignupData.values(f, f2, this.onRelationshipValidationResult, this.HaptikSDK$d);
        this.aj$a = values;
        if (values != null) {
            invalidate();
        }
    }

    private void getInitSettings() {
        if (this.aj$a != null) {
            this.aj$a = null;
            ag$a(false);
            invalidate();
        }
    }

    private void ag$a(float f, float f2) {
        if (this.aj$a != null) {
            float f3 = this.ak$b;
            RectF HaptikSDK$c = this.getSignupData.HaptikSDK$c();
            this.aj$a.ah$a(HaptikSDK$c, f, f2, this.HaptikSDK$a, this.onNavigationEvent, this.onPostMessage, values(HaptikSDK$c) ? 0.0f : f3, this.getInitSettings, this.onMessageChannelReady);
            this.getSignupData.ah$a(HaptikSDK$c);
            ag$a(true);
            invalidate();
        }
    }

    private boolean values(RectF rectF) {
        float values = encryptKey.values(this.ah$b);
        float HaptikSDK$b = encryptKey.HaptikSDK$b(this.ah$b);
        float HaptikSDK$a = encryptKey.HaptikSDK$a(this.ah$b);
        float encryptkey = encryptKey.toString(this.ah$b);
        if (!HaptikSDK$e()) {
            this.HaptikSDK$a.set(values, HaptikSDK$b, HaptikSDK$a, encryptkey);
            return false;
        }
        float[] fArr = this.ah$b;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[4];
        float f4 = fArr[5];
        float f5 = fArr[6];
        float f6 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f2 = fArr[7];
                f3 = fArr[2];
                f4 = fArr[3];
                f5 = fArr[4];
                f6 = fArr[5];
            } else {
                f = fArr[4];
                f2 = fArr[5];
                f3 = fArr[0];
                f4 = fArr[1];
                f5 = fArr[2];
                f6 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f2 = fArr[3];
            f3 = fArr[6];
            f4 = fArr[7];
            f5 = fArr[0];
            f6 = fArr[1];
        }
        float f7 = (f6 - f2) / (f5 - f);
        float f8 = (-1.0f) / f7;
        float f9 = f2 - (f7 * f);
        float f10 = f2 - (f * f8);
        float f11 = f4 - (f7 * f3);
        float f12 = f4 - (f3 * f8);
        float centerY = (rectF.centerY() - rectF.top) / (rectF.centerX() - rectF.left);
        float f13 = -centerY;
        float f14 = rectF.top - (rectF.left * centerY);
        float f15 = rectF.top - (rectF.right * f13);
        float f16 = f7 - centerY;
        float f17 = (f14 - f9) / f16;
        float max = Math.max(values, f17 < rectF.right ? f17 : values);
        float f18 = (f14 - f10) / (f8 - centerY);
        if (f18 >= rectF.right) {
            f18 = max;
        }
        float max2 = Math.max(max, f18);
        float f19 = f8 - f13;
        float f20 = (f15 - f12) / f19;
        if (f20 >= rectF.right) {
            f20 = max2;
        }
        float max3 = Math.max(max2, f20);
        float f21 = (f15 - f10) / f19;
        if (f21 <= rectF.left) {
            f21 = HaptikSDK$a;
        }
        float min = Math.min(HaptikSDK$a, f21);
        float f22 = (f15 - f11) / (f7 - f13);
        if (f22 <= rectF.left) {
            f22 = min;
        }
        float min2 = Math.min(min, f22);
        float f23 = (f14 - f11) / f16;
        if (f23 <= rectF.left) {
            f23 = min2;
        }
        float min3 = Math.min(min2, f23);
        float max4 = Math.max(HaptikSDK$b, Math.max((f7 * max3) + f9, (f8 * min3) + f10));
        float min4 = Math.min(encryptkey, Math.min((f8 * max3) + f12, (f7 * min3) + f11));
        this.HaptikSDK$a.left = max3;
        this.HaptikSDK$a.top = max4;
        this.HaptikSDK$a.right = min3;
        this.HaptikSDK$a.bottom = min4;
        return true;
    }

    private boolean HaptikSDK$e() {
        float[] fArr = this.ah$b;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private void ag$a(boolean z) {
        try {
            toString tostring = this.HaptikSDK$e;
            if (tostring != null) {
                tostring.valueOf(z);
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }
}
