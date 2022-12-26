package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class onCancelled implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ onCancelled valueOf = new onCancelled();

    private /* synthetic */ onCancelled() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Integer initSettings;
        initSettings = compatGetBinder.getInitSettings((dequeueWork) obj);
        return initSettings;
    }
}
