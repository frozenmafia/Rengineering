package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getInfo extends getCollectionItemInfo {
    private getLabeledBy toString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getInfo(getLabeledBy getlabeledby) {
        super(getlabeledby.ag$a());
        runAnimators.ag$a(getlabeledby, "validator");
        this.toString = getlabeledby;
    }

    @Override // o.getLabeledBy
    public boolean ah$a() {
        return this.toString.ah$a() && super.ah$b();
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_TIMER_THRESHOLD");
        runAnimators.toString(setaction);
        setAction<? extends Object> setaction2 = ag$a().get("PT_TIMER_END");
        runAnimators.toString(setaction2);
        return reserveEndViewTransition.valueOf(setaction, setaction2);
    }
}
