package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
final class bim<T> extends bjf<T> {
    private bjf a;

    public final void a(bjf bjfVar) {
        if (this.a != null) {
            throw new AssertionError();
        }
        this.a = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final T read(bnc bncVar) throws IOException {
        bjf bjfVar = this.a;
        if (bjfVar == null) {
            throw new IllegalStateException();
        }
        return (T) bjfVar.read(bncVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, T t) throws IOException {
        bjf bjfVar = this.a;
        if (bjfVar == null) {
            throw new IllegalStateException();
        }
        bjfVar.write(bneVar, t);
    }
}
