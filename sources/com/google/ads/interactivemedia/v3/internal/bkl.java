package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;
/* loaded from: classes4.dex */
final class bkl extends bko {
    final /* synthetic */ Method a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f865b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkl(Method method, int i) {
        this.a = method;
        this.f865b = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bko
    public final Object a(Class cls) throws Exception {
        bko.c(cls);
        return this.a.invoke(null, cls, Integer.valueOf(this.f865b));
    }
}
