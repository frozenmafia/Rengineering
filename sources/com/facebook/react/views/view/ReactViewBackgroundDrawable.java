package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.Spacing;
import com.facebook.yoga.YogaConstants;
import java.util.Arrays;
import java.util.Locale;
import o.enqueueRemove;
import o.setNonConfig;
/* loaded from: classes4.dex */
public class ReactViewBackgroundDrawable extends Drawable {
    private final Context HaptikSDK$a;
    private Spacing HaptikSDK$b;
    private Path HaptikSDK$c;
    private PointF HaptikSDK$d;
    private Path HaptikSDK$e;
    private PointF HaptikWebView;
    private PointF a;
    private float[] ag$a;
    private Spacing ah$a;
    private BorderStyle ah$b;
    private Path aj$a;
    private Path ak$b;
    private RectF extraCallback;
    private Path extraCallbackWithResult;
    private PointF getInitSettings;
    private RectF getSignupData;
    private RectF isLogoutPending;
    private RectF onPostMessage;
    private int onXdkEvent;
    private Spacing valueOf;
    private Path ICustomTabsCallback = new Path();
    private boolean ak = false;
    private float values = Float.NaN;
    private final Paint ak$a = new Paint(1);
    private int invoke = 0;
    private int toString = 255;

    /* loaded from: classes4.dex */
    public enum BorderRadiusLocation {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    private static int ah$a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i > 0 ? i5 : -1;
        int i10 = i2 > 0 ? i6 : -1;
        int i11 = (i4 > 0 ? i8 : -1) & i9 & i10 & (i3 > 0 ? i7 : -1);
        if (i <= 0) {
            i5 = 0;
        }
        if (i2 <= 0) {
            i6 = 0;
        }
        if (i3 <= 0) {
            i7 = 0;
        }
        if (i4 <= 0) {
            i8 = 0;
        }
        if (i11 == (i5 | i6 | i7 | i8)) {
            return i11;
        }
        return 0;
    }

    private static int valueOf(float f, float f2) {
        return ((((int) f) << 24) & ViewCompat.MEASURED_STATE_MASK) | (((int) f2) & ViewCompat.MEASURED_SIZE_MASK);
    }

    public boolean ag$a(int i) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.views.view.ReactViewBackgroundDrawable$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] toString;

        static {
            int[] iArr = new int[BorderStyle.values().length];
            toString = iArr;
            try {
                iArr[BorderStyle.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                toString[BorderStyle.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                toString[BorderStyle.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public enum BorderStyle {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect getPathEffect(BorderStyle borderStyle, float f) {
            int i = AnonymousClass3.toString[borderStyle.ordinal()];
            if (i == 2) {
                float f2 = f * 3.0f;
                return new DashPathEffect(new float[]{f2, f2, f2, f2}, 0.0f);
            } else if (i != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f, f, f, f}, 0.0f);
            }
        }
    }

    public ReactViewBackgroundDrawable(Context context) {
        this.HaptikSDK$a = context;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        HaptikSDK$c();
        if (!ah$b()) {
            ah$a(canvas);
        } else {
            ag$a(canvas);
        }
    }

    public boolean ah$b() {
        if (YogaConstants.isUndefined(this.values) || this.values <= 0.0f) {
            float[] fArr = this.ag$a;
            if (fArr != null) {
                for (float f : fArr) {
                    if (!YogaConstants.isUndefined(f) && f > 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.ak = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.toString) {
            this.toString = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.toString;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return enqueueRemove.toString(enqueueRemove.ag$a(this.invoke, this.toString));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((!YogaConstants.isUndefined(this.values) && this.values > 0.0f) || this.ag$a != null) {
            HaptikSDK$a();
            outline.setConvexPath(this.extraCallbackWithResult);
            return;
        }
        outline.setRect(getBounds());
    }

    public void valueOf(int i, float f) {
        if (this.HaptikSDK$b == null) {
            this.HaptikSDK$b = new Spacing();
        }
        if (FloatUtil.floatsEqual(this.HaptikSDK$b.getRaw(i), f)) {
            return;
        }
        this.HaptikSDK$b.set(i, f);
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 8) {
            this.ak = true;
        }
        invalidateSelf();
    }

    public void ag$a(int i, float f, float f2) {
        ag$a(i, f);
        ah$a(i, f2);
    }

    private void ag$a(int i, float f) {
        if (this.ah$a == null) {
            this.ah$a = new Spacing(0.0f);
        }
        if (FloatUtil.floatsEqual(this.ah$a.getRaw(i), f)) {
            return;
        }
        this.ah$a.set(i, f);
        invalidateSelf();
    }

    private void ah$a(int i, float f) {
        if (this.valueOf == null) {
            this.valueOf = new Spacing(255.0f);
        }
        if (FloatUtil.floatsEqual(this.valueOf.getRaw(i), f)) {
            return;
        }
        this.valueOf.set(i, f);
        invalidateSelf();
    }

    public void toString(String str) {
        BorderStyle valueOf = str == null ? null : BorderStyle.valueOf(str.toUpperCase(Locale.US));
        if (this.ah$b != valueOf) {
            this.ah$b = valueOf;
            this.ak = true;
            invalidateSelf();
        }
    }

    public void valueOf(float f) {
        if (FloatUtil.floatsEqual(this.values, f)) {
            return;
        }
        this.values = f;
        this.ak = true;
        invalidateSelf();
    }

    public void ag$a(float f, int i) {
        if (this.ag$a == null) {
            float[] fArr = new float[8];
            this.ag$a = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (FloatUtil.floatsEqual(this.ag$a[i], f)) {
            return;
        }
        this.ag$a[i] = f;
        this.ak = true;
        invalidateSelf();
    }

    public float valueOf() {
        if (YogaConstants.isUndefined(this.values)) {
            return 0.0f;
        }
        return this.values;
    }

    public float valueOf(BorderRadiusLocation borderRadiusLocation) {
        return toString(Float.NaN, borderRadiusLocation);
    }

    public float toString(float f, BorderRadiusLocation borderRadiusLocation) {
        float[] fArr = this.ag$a;
        if (fArr == null) {
            return f;
        }
        float f2 = fArr[borderRadiusLocation.ordinal()];
        return YogaConstants.isUndefined(f2) ? f : f2;
    }

    public void ah$a(int i) {
        this.invoke = i;
        invalidateSelf();
    }

    public int invoke() {
        return this.onXdkEvent;
    }

    public boolean valueOf(int i) {
        if (this.onXdkEvent != i) {
            this.onXdkEvent = i;
            return ag$a(i);
        }
        return false;
    }

    public int ah$a() {
        return this.invoke;
    }

    private void ag$a(Canvas canvas) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        HaptikSDK$a();
        canvas.save();
        int ag$a = enqueueRemove.ag$a(this.invoke, this.toString);
        if (Color.alpha(ag$a) != 0) {
            this.ak$a.setColor(ag$a);
            this.ak$a.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.HaptikSDK$e, this.ak$a);
        }
        RectF ag$a2 = ag$a();
        int values = values(0);
        int values2 = values(1);
        int values3 = values(2);
        int values4 = values(3);
        if (ag$a2.top > 0.0f || ag$a2.bottom > 0.0f || ag$a2.left > 0.0f || ag$a2.right > 0.0f) {
            float values5 = values();
            int values6 = values(8);
            if (ag$a2.top != values5 || ag$a2.bottom != values5 || ag$a2.left != values5 || ag$a2.right != values5 || values != values6 || values2 != values6 || values3 != values6 || values4 != values6) {
                this.ak$a.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.aj$a, Region.Op.INTERSECT);
                canvas.clipPath(this.HaptikSDK$e, Region.Op.DIFFERENCE);
                boolean z = invoke() == 1;
                int values7 = values(4);
                int values8 = values(5);
                if (setNonConfig.ah$a().valueOf(this.HaptikSDK$a)) {
                    if (toString(4)) {
                        values = values7;
                    }
                    if (toString(5)) {
                        values3 = values8;
                    }
                    i = z ? values3 : values;
                    if (!z) {
                        values = values3;
                    }
                    i2 = values;
                } else {
                    int i3 = z ? values8 : values7;
                    if (!z) {
                        values7 = values8;
                    }
                    boolean reactViewBackgroundDrawable = toString(4);
                    boolean reactViewBackgroundDrawable2 = toString(5);
                    boolean z2 = z ? reactViewBackgroundDrawable2 : reactViewBackgroundDrawable;
                    if (!z) {
                        reactViewBackgroundDrawable = reactViewBackgroundDrawable2;
                    }
                    if (z2) {
                        values = i3;
                    }
                    if (reactViewBackgroundDrawable) {
                        i = values;
                        i2 = values7;
                    } else {
                        i = values;
                        i2 = values3;
                    }
                }
                float f5 = this.isLogoutPending.left;
                float f6 = this.isLogoutPending.right;
                float f7 = this.isLogoutPending.top;
                float f8 = this.isLogoutPending.bottom;
                if (ag$a2.left > 0.0f) {
                    f = f8;
                    f2 = f7;
                    f3 = f6;
                    f4 = f5;
                    ag$a(canvas, i, f5, f7, this.getInitSettings.x, this.getInitSettings.y, this.HaptikWebView.x, this.HaptikWebView.y, f5, f);
                } else {
                    f = f8;
                    f2 = f7;
                    f3 = f6;
                    f4 = f5;
                }
                if (ag$a2.top > 0.0f) {
                    ag$a(canvas, values2, f4, f2, this.getInitSettings.x, this.getInitSettings.y, this.a.x, this.a.y, f3, f2);
                }
                if (ag$a2.right > 0.0f) {
                    ag$a(canvas, i2, f3, f2, this.a.x, this.a.y, this.HaptikSDK$d.x, this.HaptikSDK$d.y, f3, f);
                }
                if (ag$a2.bottom > 0.0f) {
                    ag$a(canvas, values4, f4, f, this.HaptikWebView.x, this.HaptikWebView.y, this.HaptikSDK$d.x, this.HaptikSDK$d.y, f3, f);
                }
            } else if (values5 > 0.0f) {
                this.ak$a.setColor(enqueueRemove.ag$a(values6, this.toString));
                this.ak$a.setStyle(Paint.Style.STROKE);
                this.ak$a.setStrokeWidth(values5);
                canvas.drawPath(this.HaptikSDK$c, this.ak$a);
            }
        }
        canvas.restore();
    }

    private void HaptikSDK$a() {
        float f;
        float f2;
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        int i;
        float f3;
        float f4;
        float f5;
        if (this.ak) {
            this.ak = false;
            if (this.HaptikSDK$e == null) {
                this.HaptikSDK$e = new Path();
            }
            if (this.aj$a == null) {
                this.aj$a = new Path();
            }
            if (this.extraCallbackWithResult == null) {
                this.extraCallbackWithResult = new Path();
            }
            if (this.HaptikSDK$c == null) {
                this.HaptikSDK$c = new Path();
            }
            if (this.getSignupData == null) {
                this.getSignupData = new RectF();
            }
            if (this.isLogoutPending == null) {
                this.isLogoutPending = new RectF();
            }
            if (this.extraCallback == null) {
                this.extraCallback = new RectF();
            }
            if (this.onPostMessage == null) {
                this.onPostMessage = new RectF();
            }
            this.HaptikSDK$e.reset();
            this.aj$a.reset();
            this.extraCallbackWithResult.reset();
            this.HaptikSDK$c.reset();
            this.getSignupData.set(getBounds());
            this.isLogoutPending.set(getBounds());
            this.extraCallback.set(getBounds());
            this.onPostMessage.set(getBounds());
            RectF ag$a = ag$a();
            this.getSignupData.top += ag$a.top;
            this.getSignupData.bottom -= ag$a.bottom;
            this.getSignupData.left += ag$a.left;
            this.getSignupData.right -= ag$a.right;
            this.onPostMessage.top += ag$a.top * 0.5f;
            this.onPostMessage.bottom -= ag$a.bottom * 0.5f;
            this.onPostMessage.left += ag$a.left * 0.5f;
            this.onPostMessage.right -= ag$a.right * 0.5f;
            float valueOf = valueOf();
            float reactViewBackgroundDrawable = toString(valueOf, BorderRadiusLocation.TOP_LEFT);
            float reactViewBackgroundDrawable2 = toString(valueOf, BorderRadiusLocation.TOP_RIGHT);
            float reactViewBackgroundDrawable3 = toString(valueOf, BorderRadiusLocation.BOTTOM_LEFT);
            float reactViewBackgroundDrawable4 = toString(valueOf, BorderRadiusLocation.BOTTOM_RIGHT);
            boolean z = invoke() == 1;
            float valueOf2 = valueOf(BorderRadiusLocation.TOP_START);
            float valueOf3 = valueOf(BorderRadiusLocation.TOP_END);
            float valueOf4 = valueOf(BorderRadiusLocation.BOTTOM_START);
            float valueOf5 = valueOf(BorderRadiusLocation.BOTTOM_END);
            if (setNonConfig.ah$a().valueOf(this.HaptikSDK$a)) {
                if (!YogaConstants.isUndefined(valueOf2)) {
                    reactViewBackgroundDrawable = valueOf2;
                }
                if (!YogaConstants.isUndefined(valueOf3)) {
                    reactViewBackgroundDrawable2 = valueOf3;
                }
                if (!YogaConstants.isUndefined(valueOf4)) {
                    reactViewBackgroundDrawable3 = valueOf4;
                }
                if (!YogaConstants.isUndefined(valueOf5)) {
                    reactViewBackgroundDrawable4 = valueOf5;
                }
                f = z ? reactViewBackgroundDrawable2 : reactViewBackgroundDrawable;
                if (!z) {
                    reactViewBackgroundDrawable = reactViewBackgroundDrawable2;
                }
                f2 = z ? reactViewBackgroundDrawable4 : reactViewBackgroundDrawable3;
                if (z) {
                    reactViewBackgroundDrawable4 = reactViewBackgroundDrawable3;
                }
            } else {
                float f6 = z ? valueOf3 : valueOf2;
                if (!z) {
                    valueOf2 = valueOf3;
                }
                float f7 = z ? valueOf5 : valueOf4;
                if (!z) {
                    valueOf4 = valueOf5;
                }
                if (!YogaConstants.isUndefined(f6)) {
                    reactViewBackgroundDrawable = f6;
                }
                if (!YogaConstants.isUndefined(valueOf2)) {
                    reactViewBackgroundDrawable2 = valueOf2;
                }
                if (!YogaConstants.isUndefined(f7)) {
                    reactViewBackgroundDrawable3 = f7;
                }
                f = reactViewBackgroundDrawable;
                reactViewBackgroundDrawable = reactViewBackgroundDrawable2;
                f2 = reactViewBackgroundDrawable3;
                if (!YogaConstants.isUndefined(valueOf4)) {
                    reactViewBackgroundDrawable4 = valueOf4;
                }
            }
            float f8 = f2;
            this.HaptikSDK$e.addRoundRect(this.getSignupData, new float[]{Math.max(f - ag$a.left, 0.0f), Math.max(f - ag$a.top, 0.0f), Math.max(reactViewBackgroundDrawable - ag$a.right, 0.0f), Math.max(reactViewBackgroundDrawable - ag$a.top, 0.0f), Math.max(reactViewBackgroundDrawable4 - ag$a.right, 0.0f), Math.max(reactViewBackgroundDrawable4 - ag$a.bottom, 0.0f), Math.max(f2 - ag$a.left, 0.0f), Math.max(f2 - ag$a.bottom, 0.0f)}, Path.Direction.CW);
            this.aj$a.addRoundRect(this.isLogoutPending, new float[]{f, f, reactViewBackgroundDrawable, reactViewBackgroundDrawable, reactViewBackgroundDrawable4, reactViewBackgroundDrawable4, f8, f8}, Path.Direction.CW);
            Spacing spacing = this.HaptikSDK$b;
            if (spacing != null) {
                i = 8;
                f3 = spacing.get(8) / 2.0f;
            } else {
                i = 8;
                f3 = 0.0f;
            }
            Path path = this.extraCallbackWithResult;
            RectF rectF = this.extraCallback;
            float[] fArr = new float[i];
            float f9 = f + f3;
            fArr[0] = f9;
            fArr[1] = f9;
            float f10 = reactViewBackgroundDrawable + f3;
            fArr[2] = f10;
            fArr[3] = f10;
            float f11 = reactViewBackgroundDrawable4 + f3;
            fArr[4] = f11;
            fArr[5] = f11;
            float f12 = f8 + f3;
            fArr[6] = f12;
            fArr[7] = f12;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            Path path2 = this.HaptikSDK$c;
            RectF rectF2 = this.onPostMessage;
            float[] fArr2 = new float[8];
            fArr2[0] = Math.max(f - (ag$a.left * 0.5f), ag$a.left > 0.0f ? f / ag$a.left : 0.0f);
            fArr2[1] = Math.max(f - (ag$a.top * 0.5f), ag$a.top > 0.0f ? f / ag$a.top : 0.0f);
            fArr2[2] = Math.max(reactViewBackgroundDrawable - (ag$a.right * 0.5f), ag$a.right > 0.0f ? reactViewBackgroundDrawable / ag$a.right : 0.0f);
            fArr2[3] = Math.max(reactViewBackgroundDrawable - (ag$a.top * 0.5f), ag$a.top > 0.0f ? reactViewBackgroundDrawable / ag$a.top : 0.0f);
            fArr2[4] = Math.max(reactViewBackgroundDrawable4 - (ag$a.right * 0.5f), ag$a.right > 0.0f ? reactViewBackgroundDrawable4 / ag$a.right : 0.0f);
            fArr2[5] = Math.max(reactViewBackgroundDrawable4 - (ag$a.bottom * 0.5f), ag$a.bottom > 0.0f ? reactViewBackgroundDrawable4 / ag$a.bottom : 0.0f);
            fArr2[6] = Math.max(f8 - (ag$a.left * 0.5f), ag$a.left > 0.0f ? f8 / ag$a.left : 0.0f);
            float f13 = ag$a.bottom;
            if (ag$a.bottom > 0.0f) {
                f5 = f8 / ag$a.bottom;
                f4 = 0.5f;
            } else {
                f4 = 0.5f;
                f5 = 0.0f;
            }
            fArr2[7] = Math.max(f8 - (f13 * f4), f5);
            path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
            if (this.getInitSettings == null) {
                this.getInitSettings = new PointF();
            }
            this.getInitSettings.x = this.getSignupData.left;
            this.getInitSettings.y = this.getSignupData.top;
            ag$a(this.getSignupData.left, this.getSignupData.top, this.getSignupData.left + (max * 2.0f), this.getSignupData.top + (max2 * 2.0f), this.isLogoutPending.left, this.isLogoutPending.top, this.getSignupData.left, this.getSignupData.top, this.getInitSettings);
            if (this.HaptikWebView == null) {
                this.HaptikWebView = new PointF();
            }
            this.HaptikWebView.x = this.getSignupData.left;
            this.HaptikWebView.y = this.getSignupData.bottom;
            ag$a(this.getSignupData.left, this.getSignupData.bottom - (max8 * 2.0f), this.getSignupData.left + (max7 * 2.0f), this.getSignupData.bottom, this.isLogoutPending.left, this.isLogoutPending.bottom, this.getSignupData.left, this.getSignupData.bottom, this.HaptikWebView);
            if (this.a == null) {
                this.a = new PointF();
            }
            this.a.x = this.getSignupData.right;
            this.a.y = this.getSignupData.top;
            ag$a(this.getSignupData.right - (max3 * 2.0f), this.getSignupData.top, this.getSignupData.right, this.getSignupData.top + (max4 * 2.0f), this.isLogoutPending.right, this.isLogoutPending.top, this.getSignupData.right, this.getSignupData.top, this.a);
            if (this.HaptikSDK$d == null) {
                this.HaptikSDK$d = new PointF();
            }
            this.HaptikSDK$d.x = this.getSignupData.right;
            this.HaptikSDK$d.y = this.getSignupData.bottom;
            ag$a(this.getSignupData.right - (max5 * 2.0f), this.getSignupData.bottom - (max6 * 2.0f), this.getSignupData.right, this.getSignupData.bottom, this.isLogoutPending.right, this.isLogoutPending.bottom, this.getSignupData.right, this.getSignupData.bottom, this.HaptikSDK$d);
        }
    }

    private static void ag$a(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, PointF pointF) {
        double d9 = (d + d3) / 2.0d;
        double d10 = (d2 + d4) / 2.0d;
        double d11 = d5 - d9;
        double d12 = d6 - d10;
        double abs = Math.abs(d3 - d) / 2.0d;
        double abs2 = Math.abs(d4 - d2) / 2.0d;
        double d13 = ((d8 - d10) - d12) / ((d7 - d9) - d11);
        double d14 = d12 - (d11 * d13);
        double d15 = abs2 * abs2;
        double d16 = abs * abs;
        double d17 = d15 + (d16 * d13 * d13);
        double d18 = abs * 2.0d * abs * d14 * d13;
        double d19 = (-(d16 * ((d14 * d14) - d15))) / d17;
        double d20 = d17 * 2.0d;
        double sqrt = ((-d18) / d20) - Math.sqrt(d19 + Math.pow(d18 / d20, 2.0d));
        double d21 = d9 + sqrt;
        double d22 = (d13 * sqrt) + d14 + d10;
        if (Double.isNaN(d21) || Double.isNaN(d22)) {
            return;
        }
        pointF.x = (float) d21;
        pointF.y = (float) d22;
    }

    public float ah$a(float f, int i) {
        Spacing spacing = this.HaptikSDK$b;
        if (spacing == null) {
            return f;
        }
        float raw = spacing.getRaw(i);
        return YogaConstants.isUndefined(raw) ? f : raw;
    }

    private void HaptikSDK$c() {
        BorderStyle borderStyle = this.ah$b;
        this.ak$a.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, values()) : null);
    }

    private void invoke(int i) {
        BorderStyle borderStyle = this.ah$b;
        this.ak$a.setPathEffect(borderStyle != null ? BorderStyle.getPathEffect(borderStyle, i) : null);
    }

    public float values() {
        Spacing spacing = this.HaptikSDK$b;
        if (spacing == null || YogaConstants.isUndefined(spacing.getRaw(8))) {
            return 0.0f;
        }
        return this.HaptikSDK$b.getRaw(8);
    }

    private void ah$a(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.ak$a.setStyle(Paint.Style.FILL);
        int ag$a = enqueueRemove.ag$a(this.invoke, this.toString);
        if (Color.alpha(ag$a) != 0) {
            this.ak$a.setColor(ag$a);
            canvas.drawRect(getBounds(), this.ak$a);
        }
        RectF ag$a2 = ag$a();
        int round = Math.round(ag$a2.left);
        int round2 = Math.round(ag$a2.top);
        int round3 = Math.round(ag$a2.right);
        int round4 = Math.round(ag$a2.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int values = values(0);
            int values2 = values(1);
            int values3 = values(2);
            int values4 = values(3);
            boolean z = invoke() == 1;
            int values5 = values(4);
            int values6 = values(5);
            if (setNonConfig.ah$a().valueOf(this.HaptikSDK$a)) {
                if (toString(4)) {
                    values = values5;
                }
                if (toString(5)) {
                    values3 = values6;
                }
                int i8 = z ? values3 : values;
                if (!z) {
                    values = values3;
                }
                i2 = values;
                i = i8;
            } else {
                int i9 = z ? values6 : values5;
                if (!z) {
                    values5 = values6;
                }
                boolean reactViewBackgroundDrawable = toString(4);
                boolean reactViewBackgroundDrawable2 = toString(5);
                boolean z2 = z ? reactViewBackgroundDrawable2 : reactViewBackgroundDrawable;
                if (!z) {
                    reactViewBackgroundDrawable = reactViewBackgroundDrawable2;
                }
                if (z2) {
                    values = i9;
                }
                i = values;
                i2 = reactViewBackgroundDrawable ? values5 : values3;
            }
            int i10 = bounds.left;
            int i11 = bounds.top;
            int ah$a = ah$a(round, round2, round3, round4, i, values2, i2, values4);
            if (ah$a != 0) {
                if (Color.alpha(ah$a) != 0) {
                    int i12 = bounds.right;
                    int i13 = bounds.bottom;
                    this.ak$a.setColor(ah$a);
                    this.ak$a.setStyle(Paint.Style.STROKE);
                    if (round > 0) {
                        this.ICustomTabsCallback.reset();
                        int round5 = Math.round(ag$a2.left);
                        invoke(round5);
                        this.ak$a.setStrokeWidth(round5);
                        float f = i10 + (round5 / 2);
                        this.ICustomTabsCallback.moveTo(f, i11);
                        this.ICustomTabsCallback.lineTo(f, i13);
                        canvas.drawPath(this.ICustomTabsCallback, this.ak$a);
                    }
                    if (round2 > 0) {
                        this.ICustomTabsCallback.reset();
                        int round6 = Math.round(ag$a2.top);
                        invoke(round6);
                        this.ak$a.setStrokeWidth(round6);
                        float f2 = i11 + (round6 / 2);
                        this.ICustomTabsCallback.moveTo(i10, f2);
                        this.ICustomTabsCallback.lineTo(i12, f2);
                        canvas.drawPath(this.ICustomTabsCallback, this.ak$a);
                    }
                    if (round3 > 0) {
                        this.ICustomTabsCallback.reset();
                        int round7 = Math.round(ag$a2.right);
                        invoke(round7);
                        this.ak$a.setStrokeWidth(round7);
                        float f3 = i12 - (round7 / 2);
                        this.ICustomTabsCallback.moveTo(f3, i11);
                        this.ICustomTabsCallback.lineTo(f3, i13);
                        canvas.drawPath(this.ICustomTabsCallback, this.ak$a);
                    }
                    if (round4 > 0) {
                        this.ICustomTabsCallback.reset();
                        int round8 = Math.round(ag$a2.bottom);
                        invoke(round8);
                        this.ak$a.setStrokeWidth(round8);
                        float f4 = i13 - (round8 / 2);
                        this.ICustomTabsCallback.moveTo(i10, f4);
                        this.ICustomTabsCallback.lineTo(i12, f4);
                        canvas.drawPath(this.ICustomTabsCallback, this.ak$a);
                        return;
                    }
                    return;
                }
                return;
            }
            this.ak$a.setAntiAlias(false);
            int width = bounds.width();
            int height = bounds.height();
            if (round > 0) {
                float f5 = i10;
                float f6 = i10 + round;
                i3 = i11;
                ag$a(canvas, i, f5, i11, f6, i11 + round2, f6, i7 - round4, f5, i11 + height);
            } else {
                i3 = i11;
            }
            if (round2 > 0) {
                float f7 = i3;
                float f8 = i3 + round2;
                ag$a(canvas, values2, i10, f7, i10 + round, f8, i6 - round3, f8, i10 + width, f7);
            }
            if (round3 > 0) {
                int i14 = i10 + width;
                float f9 = i14;
                float f10 = i14 - round3;
                ag$a(canvas, i2, f9, i3, f9, i3 + height, f10, i5 - round4, f10, i3 + round2);
            }
            if (round4 > 0) {
                int i15 = i3 + height;
                float f11 = i15;
                float f12 = i15 - round4;
                ag$a(canvas, values4, i10, f11, i10 + width, f11, i4 - round3, f12, i10 + round, f12);
            }
            this.ak$a.setAntiAlias(true);
        }
    }

    private void ag$a(Canvas canvas, int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (i == 0) {
            return;
        }
        if (this.ak$b == null) {
            this.ak$b = new Path();
        }
        this.ak$a.setColor(i);
        this.ak$b.reset();
        this.ak$b.moveTo(f, f2);
        this.ak$b.lineTo(f3, f4);
        this.ak$b.lineTo(f5, f6);
        this.ak$b.lineTo(f7, f8);
        this.ak$b.lineTo(f, f2);
        canvas.drawPath(this.ak$b, this.ak$a);
    }

    private boolean toString(int i) {
        Spacing spacing = this.ah$a;
        float f = spacing != null ? spacing.get(i) : Float.NaN;
        Spacing spacing2 = this.valueOf;
        return (YogaConstants.isUndefined(f) || YogaConstants.isUndefined(spacing2 != null ? spacing2.get(i) : Float.NaN)) ? false : true;
    }

    public int values(int i) {
        Spacing spacing = this.ah$a;
        float f = spacing != null ? spacing.get(i) : 0.0f;
        Spacing spacing2 = this.valueOf;
        return valueOf(spacing2 != null ? spacing2.get(i) : 255.0f, f);
    }

    public RectF ag$a() {
        float ah$a = ah$a(0.0f, 8);
        float ah$a2 = ah$a(ah$a, 1);
        float ah$a3 = ah$a(ah$a, 3);
        float ah$a4 = ah$a(ah$a, 0);
        float ah$a5 = ah$a(ah$a, 2);
        if (this.HaptikSDK$b != null) {
            boolean z = invoke() == 1;
            float raw = this.HaptikSDK$b.getRaw(4);
            float raw2 = this.HaptikSDK$b.getRaw(5);
            if (setNonConfig.ah$a().valueOf(this.HaptikSDK$a)) {
                if (!YogaConstants.isUndefined(raw)) {
                    ah$a4 = raw;
                }
                if (!YogaConstants.isUndefined(raw2)) {
                    ah$a5 = raw2;
                }
                float f = z ? ah$a5 : ah$a4;
                if (z) {
                    ah$a5 = ah$a4;
                }
                ah$a4 = f;
            } else {
                float f2 = z ? raw2 : raw;
                if (!z) {
                    raw = raw2;
                }
                if (!YogaConstants.isUndefined(f2)) {
                    ah$a4 = f2;
                }
                if (!YogaConstants.isUndefined(raw)) {
                    ah$a5 = raw;
                }
            }
        }
        return new RectF(ah$a4, ah$a2, ah$a5, ah$a3);
    }
}
