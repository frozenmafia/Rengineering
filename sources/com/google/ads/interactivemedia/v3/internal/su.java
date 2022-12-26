package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class su extends sp {
    public static final Object c = new Object();
    private final Object d;
    private final Object e;

    private su(be beVar, Object obj, Object obj2) {
        super(beVar);
        this.d = obj;
        this.e = obj2;
    }

    public static su s(ai aiVar) {
        return new su(new sv(aiVar), bd.a, c);
    }

    public static su t(be beVar, Object obj, Object obj2) {
        return new su(beVar, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Object u(su suVar) {
        return suVar.e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sp, com.google.ads.interactivemedia.v3.internal.be
    public final int a(Object obj) {
        Object obj2;
        be beVar = this.f1271b;
        if (c.equals(obj) && (obj2 = this.e) != null) {
            obj = obj2;
        }
        return beVar.a(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sp, com.google.ads.interactivemedia.v3.internal.be
    public final bc d(int i, bc bcVar, boolean z) {
        this.f1271b.d(i, bcVar, z);
        if (cp.V(bcVar.f793b, this.e) && z) {
            bcVar.f793b = c;
        }
        return bcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sp, com.google.ads.interactivemedia.v3.internal.be
    public final bd e(int i, bd bdVar, long j) {
        this.f1271b.e(i, bdVar, j);
        if (cp.V(bdVar.f798b, this.d)) {
            bdVar.f798b = bd.a;
        }
        return bdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sp, com.google.ads.interactivemedia.v3.internal.be
    public final Object f(int i) {
        Object f = this.f1271b.f(i);
        return cp.V(f, this.e) ? c : f;
    }

    public final su r(be beVar) {
        return new su(beVar, this.d, this.e);
    }
}
