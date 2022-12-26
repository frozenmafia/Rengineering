package o;
/* loaded from: classes.dex */
public final /* synthetic */ class ResourcesFlusher implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ ResourcesFlusher valueOf = new ResourcesFlusher();

    private /* synthetic */ ResourcesFlusher() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String extraCallback;
        extraCallback = onItemSelected.extraCallback((popOutdatedAttrHolders) obj);
        return extraCallback;
    }
}
