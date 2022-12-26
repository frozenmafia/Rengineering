package o;

import o.FrameworkSQLiteOpenHelper;
/* loaded from: classes3.dex */
public final /* synthetic */ class hasSigningCertificate implements FrameworkSQLiteOpenHelper.OpenHelper.AnonymousClass1 {
    public static final /* synthetic */ hasSigningCertificate valueOf = new hasSigningCertificate();

    private /* synthetic */ hasSigningCertificate() {
    }

    @Override // o.FrameworkSQLiteOpenHelper.OpenHelper.AnonymousClass1
    public final Object apply(Object obj, Object obj2, Object obj3) {
        Boolean ag$a;
        ag$a = computeSHA256Digest.ag$a((Boolean) obj, (Boolean) obj2, (Boolean) obj3);
        return ag$a;
    }
}
