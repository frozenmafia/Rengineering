package o;

import kotlinx.coroutines.scheduling.CoroutineScheduler;
import o.ViewPager;
/* loaded from: classes5.dex */
public class setOffscreenPageLimit extends setTrimPathEnd {
    private final int HaptikSDK$b;
    private final long ah$a;
    private final String invoke;
    private final int toString;
    private CoroutineScheduler valueOf;

    public setOffscreenPageLimit() {
        this(0, 0, 0L, null, 15, null);
    }

    public /* synthetic */ setOffscreenPageLimit(int i, int i2, long j, String str, int i3, getTargetTypes gettargettypes) {
        this((i3 & 1) != 0 ? ViewPager.AnonymousClass3.ag$a : i, (i3 & 2) != 0 ? ViewPager.AnonymousClass3.values : i2, (i3 & 4) != 0 ? ViewPager.AnonymousClass3.ah$a : j, (i3 & 8) != 0 ? "CoroutineScheduler" : str);
    }

    public setOffscreenPageLimit(int i, int i2, long j, String str) {
        this.toString = i;
        this.HaptikSDK$b = i2;
        this.ah$a = j;
        this.invoke = str;
        this.valueOf = valueOf();
    }

    private final CoroutineScheduler valueOf() {
        return new CoroutineScheduler(this.toString, this.HaptikSDK$b, this.ah$a, this.invoke);
    }

    @Override // o.parseInterpolatorFromTypeArray
    public void dispatch(PropertyValuesHolderUtils propertyValuesHolderUtils, Runnable runnable) {
        CoroutineScheduler.values(this.valueOf, runnable, null, false, 6, null);
    }

    @Override // o.parseInterpolatorFromTypeArray
    public void dispatchYield(PropertyValuesHolderUtils propertyValuesHolderUtils, Runnable runnable) {
        CoroutineScheduler.values(this.valueOf, runnable, null, true, 2, null);
    }

    public final void valueOf(Runnable runnable, setPageMarginDrawable setpagemargindrawable, boolean z) {
        this.valueOf.ah$a(runnable, setpagemargindrawable, z);
    }

    public void close() {
        this.valueOf.close();
    }
}
