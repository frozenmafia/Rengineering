package o;

import android.view.animation.Animation;
import o.JobIntentService;
/* loaded from: classes3.dex */
public final class navigateUpFromSameTask {
    public static final Animation.AnimationListener values(final Runnable runnable, final Runnable runnable2) {
        return new Animation.AnimationListener() { // from class: o.navigateUpFromSameTask$ah$a
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                Runnable runnable3 = runnable;
                if (runnable3 == null) {
                    return;
                }
                runnable3.run();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                Runnable runnable3 = runnable2;
                if (runnable3 == null) {
                    return;
                }
                runnable3.run();
            }
        };
    }

    public static /* synthetic */ Animation.AnimationListener values(Runnable runnable, Runnable runnable2, int i, Object obj) {
        if ((i & 1) != 0) {
            runnable = null;
        }
        if ((i & 2) != 0) {
            runnable2 = null;
        }
        return values(runnable, runnable2);
    }

    public static final String values(JobIntentService.WorkEnqueuer workEnqueuer) {
        JobIntentService.GenericWorkItem valueOf;
        JobIntentService.JobWorkEnqueuer values;
        JobIntentService.JobWorkEnqueuer values2;
        String str = "";
        if (((workEnqueuer == null || (values2 = workEnqueuer.values()) == null) ? 0 : values2.ag$a()) > ((workEnqueuer == null || (values = workEnqueuer.values()) == null) ? 0 : values.valueOf())) {
            str = "DR";
        }
        if (((workEnqueuer == null || (valueOf = workEnqueuer.valueOf()) == null) ? 0 : valueOf.ah$a()) > 0) {
            if (str.length() > 0) {
                str = str + ",";
            }
            return str + "DreamBox";
        }
        return str;
    }
}
