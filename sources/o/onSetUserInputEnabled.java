package o;

import o.FragmentStateAdapter;
import o.ViewPager2;
/* loaded from: classes5.dex */
public final class onSetUserInputEnabled implements containsItem<setAnimationMatrix> {
    public static final onSetUserInputEnabled ah$a = new onSetUserInputEnabled();
    private final /* synthetic */ ViewPager2.AnonymousClass2<setAnimationMatrix> toString = new ViewPager2.AnonymousClass2<>("kotlin.Unit", setAnimationMatrix.ag$a);

    public void ag$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        runAnimators.ag$a(animateLayoutChangeDetector, "decoder");
        this.toString.ah$a(animateLayoutChangeDetector);
    }

    @Override // o.containsItem, o.scheduleGracePeriodEnd
    public FragmentStateAdapter.DataSetChangeObserver values() {
        return this.toString.values();
    }

    private onSetUserInputEnabled() {
    }

    @Override // o.scheduleGracePeriodEnd
    public /* synthetic */ Object ah$a(AnimateLayoutChangeDetector animateLayoutChangeDetector) {
        ag$a(animateLayoutChangeDetector);
        return setAnimationMatrix.ag$a;
    }
}
