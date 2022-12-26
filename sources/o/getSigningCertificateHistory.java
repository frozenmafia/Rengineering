package o;
/* loaded from: classes3.dex */
public final /* synthetic */ class getSigningCertificateHistory implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ getSigningCertificateHistory ah$a = new getSigningCertificateHistory();

    private /* synthetic */ getSigningCertificateHistory() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Integer ah$a2;
        ah$a2 = computeSHA256Digest.ah$a((Boolean) obj);
        return ah$a2;
    }
}
