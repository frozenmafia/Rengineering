package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class makeMainSelectorActivity implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ makeMainSelectorActivity values = new makeMainSelectorActivity();

    private /* synthetic */ makeMainSelectorActivity() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String signupData;
        signupData = toLocusIdCompat.getSignupData((IntentCompat) obj);
        return signupData;
    }
}
