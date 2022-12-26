package o;

import o.FragmentStateAdapter;
import o.inferViewPager;
/* loaded from: classes5.dex */
public final class beginFakeVelocityTracker implements containsItem<Character> {
    public static final beginFakeVelocityTracker valueOf = new beginFakeVelocityTracker();
    private static final FragmentStateAdapter.DataSetChangeObserver ag$a = new onDetachAdapter("kotlin.Char", inferViewPager.valueOf.values);

    private beginFakeVelocityTracker() {
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return ag$a;
    }

    @Override // o.scheduleGracePeriodEnd
    /* renamed from: ag$a */
    public Character ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        return Character.valueOf(animateLayoutChangeDetector.ag$a());
    }
}
