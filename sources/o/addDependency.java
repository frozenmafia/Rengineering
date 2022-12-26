package o;

import com.app.dream11.payment.amountSelection.offers.SingleItemModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class addDependency implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ addDependency ah$a = new addDependency();

    private /* synthetic */ addDependency() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return computeWrap.getInitSettings((SingleItemModel) obj);
    }
}
