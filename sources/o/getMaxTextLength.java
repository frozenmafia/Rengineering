package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getMaxTextLength extends getCollectionItemInfo {
    private getLabeledBy ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getMaxTextLength(getLabeledBy getlabeledby) {
        super(getlabeledby.ag$a());
        runAnimators.ag$a(getlabeledby, "validator");
        this.ag$a = getlabeledby;
    }

    @Override // o.getLabeledBy
    public boolean ah$a() {
        return this.ag$a.ah$a() && super.valueOf();
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_BIG_IMG");
        runAnimators.toString(setaction);
        return reserveEndViewTransition.ag$a(setaction);
    }
}
