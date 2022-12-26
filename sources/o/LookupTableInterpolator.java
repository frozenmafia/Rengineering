package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes4.dex */
public final class LookupTableInterpolator extends Drawable {
    private assumeMaterial ag$a;
    private final Paint ah$a;
    private ValueAnimator ah$b;
    private final Matrix toString;
    private final ValueAnimator.AnimatorUpdateListener valueOf = new ValueAnimator.AnimatorUpdateListener() { // from class: o.LookupTableInterpolator.5
        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LookupTableInterpolator.this.invalidateSelf();
        }
    };
    private final Rect values;

    private float ag$a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public LookupTableInterpolator() {
        Paint paint = new Paint();
        this.ah$a = paint;
        this.values = new Rect();
        this.toString = new Matrix();
        paint.setAntiAlias(true);
    }

    public void values(assumeMaterial assumematerial) {
        this.ag$a = assumematerial;
        if (assumematerial != null) {
            this.ah$a.setXfermode(new PorterDuffXfermode(assumematerial.ag$a ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        invoke();
        ah$b();
        invalidateSelf();
    }

    public void ah$a() {
        if (this.ah$b == null || valueOf() || getCallback() == null) {
            return;
        }
        this.ah$b.start();
    }

    public void ag$a() {
        if (this.ah$b == null || !valueOf()) {
            return;
        }
        this.ah$b.cancel();
    }

    public boolean valueOf() {
        ValueAnimator valueAnimator = this.ah$b;
        return valueAnimator != null && valueAnimator.isStarted();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.values.set(0, 0, rect.width(), rect.height());
        invoke();
        values();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        float ag$a;
        float ag$a2;
        if (this.ag$a == null || this.ah$a.getShader() == null) {
            return;
        }
        float tan = (float) Math.tan(Math.toRadians(this.ag$a.a));
        float height = this.values.height() + (this.values.width() * tan);
        float width = this.values.width() + (tan * this.values.height());
        ValueAnimator valueAnimator = this.ah$b;
        float f = 0.0f;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        int i = this.ag$a.ah$b;
        if (i != 1) {
            if (i == 2) {
                ag$a2 = ag$a(width, -width, animatedFraction);
            } else if (i != 3) {
                ag$a2 = ag$a(-width, width, animatedFraction);
            } else {
                ag$a = ag$a(height, -height, animatedFraction);
            }
            f = ag$a2;
            ag$a = 0.0f;
        } else {
            ag$a = ag$a(-height, height, animatedFraction);
        }
        this.toString.reset();
        this.toString.setRotate(this.ag$a.a, this.values.width() / 2.0f, this.values.height() / 2.0f);
        this.toString.postTranslate(f, ag$a);
        this.ah$a.getShader().setLocalMatrix(this.toString);
        canvas.drawRect(this.values, this.ah$a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        assumeMaterial assumematerial = this.ag$a;
        return (assumematerial == null || !(assumematerial.HaptikSDK$c || this.ag$a.ag$a)) ? -1 : -3;
    }

    private void ah$b() {
        boolean z;
        if (this.ag$a == null) {
            return;
        }
        ValueAnimator valueAnimator = this.ah$b;
        if (valueAnimator != null) {
            z = valueAnimator.isStarted();
            this.ah$b.cancel();
            this.ah$b.removeAllUpdateListeners();
        } else {
            z = false;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (this.ag$a.ak / this.ag$a.ah$a)) + 1.0f);
        this.ah$b = ofFloat;
        ofFloat.setRepeatMode(this.ag$a.isLogoutPending);
        this.ah$b.setRepeatCount(this.ag$a.aj$a);
        this.ah$b.setDuration(this.ag$a.ah$a + this.ag$a.ak);
        this.ah$b.addUpdateListener(this.valueOf);
        if (z) {
            this.ah$b.start();
        }
    }

    public void values() {
        assumeMaterial assumematerial;
        ValueAnimator valueAnimator = this.ah$b;
        if (valueAnimator == null || valueAnimator.isStarted() || (assumematerial = this.ag$a) == null || !assumematerial.toString || getCallback() == null) {
            return;
        }
        this.ah$b.start();
    }

    private void invoke() {
        assumeMaterial assumematerial;
        Shader radialGradient;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (width == 0 || height == 0 || (assumematerial = this.ag$a) == null) {
            return;
        }
        int assumematerial2 = assumematerial.toString(width);
        int ag$a = this.ag$a.ag$a(height);
        boolean z = true;
        if (this.ag$a.onXdkEvent != 1) {
            if (this.ag$a.ah$b != 1 && this.ag$a.ah$b != 3) {
                z = false;
            }
            if (z) {
                assumematerial2 = 0;
            }
            if (!z) {
                ag$a = 0;
            }
            radialGradient = new LinearGradient(0.0f, 0.0f, assumematerial2, ag$a, this.ag$a.HaptikSDK$a, this.ag$a.HaptikSDK$d, Shader.TileMode.CLAMP);
        } else {
            radialGradient = new RadialGradient(assumematerial2 / 2.0f, ag$a / 2.0f, (float) (Math.max(assumematerial2, ag$a) / Math.sqrt(2.0d)), this.ag$a.HaptikSDK$a, this.ag$a.HaptikSDK$d, Shader.TileMode.CLAMP);
        }
        this.ah$a.setShader(radialGradient);
    }
}
