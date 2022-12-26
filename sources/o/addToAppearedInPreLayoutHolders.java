package o;

import o.ViewInfoStore;
/* loaded from: classes5.dex */
public class addToAppearedInPreLayoutHolders extends popFromLayoutStep {
    private final ViewInfoStore.InfoRecord valueOf;

    public ViewInfoStore.InfoRecord valueOf() {
        return values(this.valueOf);
    }

    @Override // o.popFromLayoutStep
    public int hashCode() {
        return valueOf().hashCode();
    }

    @Override // o.popFromLayoutStep
    public boolean equals(Object obj) {
        return valueOf().equals(obj);
    }

    public String toString() {
        return valueOf().toString();
    }
}
