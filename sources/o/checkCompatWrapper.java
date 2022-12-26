package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class checkCompatWrapper implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ checkCompatWrapper values = new checkCompatWrapper();

    private /* synthetic */ checkCompatWrapper() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Integer valueOf;
        valueOf = getExtraData.valueOf((Boolean) obj);
        return valueOf;
    }
}
