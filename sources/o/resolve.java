package o;

import com.app.dream11.payment.amountSelection.offers.SingleItemModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class resolve implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ resolve valueOf = new resolve();

    private /* synthetic */ resolve() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return computeWrap.isLogoutPending((SingleItemModel) obj);
    }
}
