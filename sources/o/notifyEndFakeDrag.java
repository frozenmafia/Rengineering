package o;

import o.FragmentStateAdapter;
import o.inferViewPager;
/* loaded from: classes5.dex */
public final class notifyEndFakeDrag implements containsItem<Integer> {
    public static final notifyEndFakeDrag ag$a = new notifyEndFakeDrag();
    private static final FragmentStateAdapter.DataSetChangeObserver ah$a = new onDetachAdapter("kotlin.Int", inferViewPager.invoke.toString);

    private notifyEndFakeDrag() {
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return ah$a;
    }

    @Override // o.scheduleGracePeriodEnd
    /* renamed from: values */
    public Integer ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        return Integer.valueOf(animateLayoutChangeDetector.HaptikSDK$a());
    }
}
