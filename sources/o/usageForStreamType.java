package o;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.Objects;
/* loaded from: classes7.dex */
public final class usageForStreamType {
    private final int HaptikSDK$b;
    private final Context ag$a;
    private final Drawable ah$a;
    private Rect toString;
    private ValueAnimator valueOf;
    private final int values;

    public usageForStreamType(Context context) {
        runAnimators.ag$a(context, "context");
        this.ag$a = context;
        this.valueOf = ValueAnimator.ofInt(255, 0);
        this.HaptikSDK$b = getStreamMinVolume.valueOf(10);
        this.values = getStreamMinVolume.valueOf(12);
        this.toString = new Rect();
        Drawable drawable = androidx.core.content.ContextCompat.getDrawable(context, getRawLegacyStreamType$ag$a.gph_gif_branding);
        runAnimators.toString(drawable);
        Drawable mutate = drawable.mutate();
        runAnimators.ah$a(mutate, "ContextCompat.getDrawabl…_gif_branding)!!.mutate()");
        this.ah$a = mutate;
        mutate.setAlpha(0);
        ValueAnimator valueAnimator = this.valueOf;
        runAnimators.ah$a(valueAnimator, "alphaAnimator");
        valueAnimator.setDuration(800L);
        ValueAnimator valueAnimator2 = this.valueOf;
        runAnimators.ah$a(valueAnimator2, "alphaAnimator");
        valueAnimator2.setStartDelay(1000L);
    }

    public final void ag$a() {
        WindowMetricsCalculatorDecorator.valueOf.valueOf("startAnimation", new Object[0]);
        this.ah$a.setAlpha(255);
        ValueAnimator valueAnimator = this.valueOf;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.valueOf.addUpdateListener(new values());
        this.valueOf.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class values implements ValueAnimator.AnimatorUpdateListener {
        values() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            Drawable drawable = usageForStreamType.this.ah$a;
            runAnimators.ah$a(valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            drawable.setAlpha(((Integer) animatedValue).intValue());
        }
    }

    public final void valueOf(Canvas canvas) {
        runAnimators.ag$a(canvas, "canvas");
        this.toString.left = (canvas.getClipBounds().right - this.HaptikSDK$b) - ((this.ah$a.getIntrinsicWidth() / this.ah$a.getIntrinsicHeight()) * this.values);
        this.toString.top = (canvas.getClipBounds().bottom - this.values) - this.HaptikSDK$b;
        this.toString.right = canvas.getClipBounds().right - this.HaptikSDK$b;
        this.toString.bottom = canvas.getClipBounds().bottom - this.HaptikSDK$b;
        this.ah$a.setBounds(this.toString);
        this.ah$a.draw(canvas);
    }
}
