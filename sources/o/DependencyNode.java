package o;

import com.app.dream11.payment.amountSelection.offers.SingleItemModel;
/* loaded from: classes3.dex */
public final /* synthetic */ class DependencyNode implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ DependencyNode valueOf = new DependencyNode();

    /* loaded from: classes3.dex */
    public final /* synthetic */ class Type implements FrameworkSQLiteOpenHelperFactory {
        public static final /* synthetic */ Type ag$a = new Type();

        private /* synthetic */ Type() {
        }

        @Override // o.FrameworkSQLiteOpenHelperFactory
        public final Object apply(Object obj) {
            return computeWrap.aj$a((SingleItemModel) obj);
        }
    }

    private /* synthetic */ DependencyNode() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        return computeWrap.ak((SingleItemModel) obj);
    }
}
