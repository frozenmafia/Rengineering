package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class bkm extends bko {
    final /* synthetic */ Method a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkm(Method method) {
        this.a = method;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bko
    public final Object a(Class cls) throws Exception {
        bko.c(cls);
        return this.a.invoke(null, cls, Object.class);
    }
}
