package o;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes5.dex */
public class putBoolean {
    private long ag$a;
    private int ah$a;
    private int toString;
    private TimeInterpolator valueOf;
    private long values;

    public putBoolean(long j, long j2) {
        this.ag$a = 0L;
        this.values = 300L;
        this.valueOf = null;
        this.ah$a = 0;
        this.toString = 1;
        this.ag$a = j;
        this.values = j2;
    }

    public putBoolean(long j, long j2, TimeInterpolator timeInterpolator) {
        this.ag$a = 0L;
        this.values = 300L;
        this.valueOf = null;
        this.ah$a = 0;
        this.toString = 1;
        this.ag$a = j;
        this.values = j2;
        this.valueOf = timeInterpolator;
    }

    public void values(Animator animator) {
        animator.setStartDelay(valueOf());
        animator.setDuration(ah$a());
        animator.setInterpolator(ag$a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(values());
            valueAnimator.setRepeatMode(HaptikSDK$c());
        }
    }

    public long valueOf() {
        return this.ag$a;
    }

    public long ah$a() {
        return this.values;
    }

    public TimeInterpolator ag$a() {
        TimeInterpolator timeInterpolator = this.valueOf;
        return timeInterpolator != null ? timeInterpolator : onPreferenceChange.values;
    }

    public int values() {
        return this.ah$a;
    }

    public int HaptikSDK$c() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static putBoolean ag$a(ValueAnimator valueAnimator) {
        putBoolean putboolean = new putBoolean(valueAnimator.getStartDelay(), valueAnimator.getDuration(), ah$a(valueAnimator));
        putboolean.ah$a = valueAnimator.getRepeatCount();
        putboolean.toString = valueAnimator.getRepeatMode();
        return putboolean;
    }

    private static TimeInterpolator ah$a(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return onPreferenceChange.values;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return onPreferenceChange.ah$a;
        }
        return interpolator instanceof DecelerateInterpolator ? onPreferenceChange.ag$a : interpolator;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof putBoolean) {
            putBoolean putboolean = (putBoolean) obj;
            if (valueOf() == putboolean.valueOf() && ah$a() == putboolean.ah$a() && values() == putboolean.values() && HaptikSDK$c() == putboolean.HaptikSDK$c()) {
                return ag$a().getClass().equals(putboolean.ag$a().getClass());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int valueOf = (int) (valueOf() ^ (valueOf() >>> 32));
        int ah$a = (int) (ah$a() ^ (ah$a() >>> 32));
        return (((((((valueOf * 31) + ah$a) * 31) + ag$a().getClass().hashCode()) * 31) + values()) * 31) + HaptikSDK$c();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + valueOf() + " duration: " + ah$a() + " interpolator: " + ag$a().getClass() + " repeatCount: " + values() + " repeatMode: " + HaptikSDK$c() + "}\n";
    }
}
