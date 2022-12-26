package o;

import o.RecyclerView;
/* loaded from: classes5.dex */
public class offsetPositionRecordsForRemove {
    private final getDecoratedLeft ag$a;
    private final onEnterLayoutOrScroll toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public offsetPositionRecordsForRemove(onEnterLayoutOrScroll onenterlayoutorscroll, getDecoratedLeft getdecoratedleft) {
        this.ag$a = getdecoratedleft;
        this.toString = onenterlayoutorscroll;
    }

    public Object ag$a(boolean z) {
        return this.ag$a.valueOf().toString(z);
    }

    public <T> T values(Class<T> cls) {
        return (T) RecyclerView.ItemAnimator.ItemHolderInfo.values(this.ag$a.valueOf().ah$a(), cls);
    }

    public onEnterLayoutOrScroll ah$a() {
        return this.toString;
    }

    public String values() {
        return this.toString.ag$a();
    }

    public String toString() {
        return "DataSnapshot { key = " + this.toString.ag$a() + ", value = " + this.ag$a.valueOf().toString(true) + " }";
    }
}
