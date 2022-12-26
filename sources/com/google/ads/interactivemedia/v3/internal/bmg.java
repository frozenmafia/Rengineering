package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bmg extends bjf {
    final /* synthetic */ Class a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ bmh f886b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bmg(bmh bmhVar, Class cls) {
        this.f886b = bmhVar;
        this.a = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final Object read(bnc bncVar) throws IOException {
        Object read = this.f886b.f887b.read(bncVar);
        if (read == null || this.a.isInstance(read)) {
            return read;
        }
        throw new biz("Expected a " + this.a.getName() + " but was " + read.getClass().getName() + "; at path " + bncVar.f());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, Object obj) throws IOException {
        this.f886b.f887b.write(bneVar, obj);
    }
}
