package o;

import java.util.List;
/* loaded from: classes3.dex */
public final class focusSearch extends getCollectionItemInfo {
    private getLabeledBy ag$a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public focusSearch(getLabeledBy getlabeledby) {
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
        setAction<? extends Object> setaction = ag$a().get("PT_THREE_DEEPLINK_LIST");
        runAnimators.toString(setaction);
        setAction<? extends Object> setaction2 = ag$a().get("PT_BIG_TEXT_LIST");
        runAnimators.toString(setaction2);
        setAction<? extends Object> setaction3 = ag$a().get("PT_SMALL_TEXT_LIST");
        runAnimators.toString(setaction3);
        setAction<? extends Object> setaction4 = ag$a().get("PT_PRODUCT_DISPLAY_ACTION");
        runAnimators.toString(setaction4);
        setAction<? extends Object> setaction5 = ag$a().get("PT_PRODUCT_DISPLAY_ACTION_CLR");
        runAnimators.toString(setaction5);
        setAction<? extends Object> setaction6 = ag$a().get("PT_PRODUCT_THREE_IMAGE_LIST");
        runAnimators.toString(setaction6);
        return reserveEndViewTransition.valueOf(setaction, setaction2, setaction3, setaction4, setaction5, setaction6);
    }
}
