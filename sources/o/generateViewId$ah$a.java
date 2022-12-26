package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.logging.type.LogSeverity;
import o.generateViewId;
/* loaded from: classes3.dex */
public final class generateViewId$ah$a implements generateViewId$HaptikSDK$c, Animator.AnimatorListener {
    public Interpolator ag$a;
    public final /* synthetic */ generateViewId ah$a;
    public float valueOf;
    public float values;

    public generateViewId$ah$a(generateViewId generateviewid, float f) {
        runAnimators.ag$a(generateviewid, "this$0");
        this.ah$a = generateviewid;
        this.ag$a = new DecelerateInterpolator();
        this.valueOf = f;
        this.values = f * 2.0f;
    }

    @Override // o.generateViewId$HaptikSDK$c
    public boolean ag$a(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        return true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        generateViewId generateviewid = this.ah$a;
        generateviewid.toString(generateviewid.values);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.generateViewId$HaptikSDK$c
    public void toString(generateViewId$HaptikSDK$c generateviewid_haptiksdk_c) {
        ObjectAnimator objectAnimator;
        runAnimators.ag$a(generateviewid_haptiksdk_c, "fromState");
        com.appsamurai.storyly.storylypresenter.e eVar = this.ah$a.ag$a;
        generateViewId$ag$a generateviewid_ag_a = generateViewId$ag$a.ag$a;
        runAnimators.ag$a(eVar, Promotion.ACTION_VIEW);
        generateViewId$ag$a.valueOf = eVar.getTranslationX();
        generateViewId$ag$a.ah$a = eVar.getWidth();
        float f = this.ah$a.invoke;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (!(i == 0) && ((i >= 0 || !generateViewId.toString.valueOf) && (f <= 0.0f || generateViewId.toString.valueOf))) {
            float f2 = -f;
            float f3 = f2 / this.valueOf;
            float f4 = f3 >= 0.0f ? f3 : 0.0f;
            float f5 = generateViewId$ag$a.valueOf + ((f2 * f) / this.values);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar, (Property<com.appsamurai.storyly.storylypresenter.e, Float>) generateViewId$ag$a.values, f5);
            ofFloat.setDuration((int) f4);
            ofFloat.setInterpolator(this.ag$a);
            runAnimators.ah$a(ofFloat, "slowdownAnim");
            ObjectAnimator values = values(f5);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, values);
            objectAnimator = animatorSet;
        } else {
            objectAnimator = values(generateViewId$ag$a.valueOf);
        }
        objectAnimator.addListener(this);
        objectAnimator.start();
    }

    @Override // o.generateViewId$HaptikSDK$c
    public boolean values(MotionEvent motionEvent) {
        runAnimators.ag$a(motionEvent, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        return true;
    }

    public final ObjectAnimator values(float f) {
        com.appsamurai.storyly.storylypresenter.e eVar = this.ah$a.ag$a;
        float abs = Math.abs(f);
        generateViewId$ag$a generateviewid_ag_a = generateViewId$ag$a.ag$a;
        float f2 = abs / generateViewId$ag$a.ah$a;
        float f3 = (float) LogSeverity.EMERGENCY_VALUE;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(eVar, (Property<com.appsamurai.storyly.storylypresenter.e, Float>) generateViewId$ag$a.values, generateViewId.toString.values);
        ofFloat.setDuration(Math.max((int) (f2 * f3), 200));
        ofFloat.setInterpolator(this.ag$a);
        runAnimators.ah$a(ofFloat, "bounceBackAnim");
        return ofFloat;
    }
}
