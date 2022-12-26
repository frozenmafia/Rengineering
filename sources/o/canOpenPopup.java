package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class canOpenPopup extends getCollectionItemInfo {
    private getLabeledBy values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public canOpenPopup(getLabeledBy getlabeledby) {
        super(getlabeledby.ag$a());
        runAnimators.ag$a(getlabeledby, "validator");
        this.values = getlabeledby;
    }

    @Override // o.getLabeledBy
    public boolean ah$a() {
        return this.values.ah$a() & super.valueOf();
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_BG");
        runAnimators.toString(setaction);
        return reserveEndViewTransition.ag$a(setaction);
    }
}
