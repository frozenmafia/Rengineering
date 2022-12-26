package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class MimeTypeFilter implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ MimeTypeFilter values = new MimeTypeFilter();

    private /* synthetic */ MimeTypeFilter() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String initSettings;
        initSettings = toLocusIdCompat.getInitSettings((IntentCompat) obj);
        return initSettings;
    }
}
