package o;

import o.FragmentStateAdapter;
/* loaded from: classes5.dex */
public final class handlesLmPerformAccessibilityAction extends enforceChildFillListener {
    private final String toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handlesLmPerformAccessibilityAction(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
        super(dataSetChangeObserver, null);
        runAnimators.ag$a(dataSetChangeObserver, "primitive");
        this.toString = runAnimators.values(dataSetChangeObserver.ah$a(), (Object) "Array");
    }

    @Override // o.FragmentStateAdapter.DataSetChangeObserver
    public String ah$a() {
        return this.toString;
    }
}
