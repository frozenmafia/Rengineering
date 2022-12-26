package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class bkk extends bko {
    final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f864b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkk(Method method, Object obj) {
        this.a = method;
        this.f864b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bko
    public final Object a(Class cls) throws Exception {
        bko.c(cls);
        return this.a.invoke(this.f864b, cls);
    }
}
