package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class getCollectionInfo extends getCollectionItemInfo {
    private getLabeledBy values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getCollectionInfo(getLabeledBy getlabeledby) {
        super(getlabeledby.ag$a());
        runAnimators.ag$a(getlabeledby, "validator");
        this.values = getlabeledby;
    }

    @Override // o.getLabeledBy
    public boolean ah$a() {
        return this.values.ah$a() && super.valueOf();
    }

    @Override // o.getLabeledBy
    public List<setAction<? extends Object>> values() {
        setAction<? extends Object> setaction = ag$a().get("PT_INPUT_FEEDBACK");
        runAnimators.toString(setaction);
        setAction<? extends Object> setaction2 = ag$a().get("PT_ACTIONS");
        runAnimators.toString(setaction2);
        return reserveEndViewTransition.valueOf(setaction, setaction2);
    }
}
