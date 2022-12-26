package o;

import o.FragmentStateAdapter;
import o.inferViewPager;
/* loaded from: classes5.dex */
public final class CompositePageTransformer implements containsItem<Byte> {
    public static final CompositePageTransformer values = new CompositePageTransformer();
    private static final FragmentStateAdapter.DataSetChangeObserver valueOf = new onDetachAdapter("kotlin.Byte", inferViewPager.values.valueOf);

    private CompositePageTransformer() {
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return valueOf;
    }

    @Override // o.scheduleGracePeriodEnd
    /* renamed from: valueOf */
    public Byte ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        return Byte.valueOf(animateLayoutChangeDetector.valueOf());
    }
}
