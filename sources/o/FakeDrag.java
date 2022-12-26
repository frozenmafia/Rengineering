package o;

import o.FragmentStateAdapter;
import o.inferViewPager;
/* loaded from: classes5.dex */
public final class FakeDrag implements containsItem<Boolean> {
    public static final FakeDrag valueOf = new FakeDrag();
    private static final FragmentStateAdapter.DataSetChangeObserver toString = new onDetachAdapter("kotlin.Boolean", inferViewPager.toString.ah$a);

    private FakeDrag() {
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return toString;
    }

    @Override // o.scheduleGracePeriodEnd
    /* renamed from: ag$a */
    public Boolean ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        return Boolean.valueOf(animateLayoutChangeDetector.values());
    }
}
