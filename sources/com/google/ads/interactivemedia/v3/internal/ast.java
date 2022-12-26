package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class ast implements bjg {
    @Override // com.google.ads.interactivemedia.v3.internal.bjg
    public final bjf a(bin binVar, bna bnaVar) {
        Class c = bnaVar.c();
        ass assVar = (ass) c.getAnnotation(ass.class);
        if (assVar == null || c == assVar.a()) {
            return null;
        }
        return binVar.b(assVar.a());
    }
}
