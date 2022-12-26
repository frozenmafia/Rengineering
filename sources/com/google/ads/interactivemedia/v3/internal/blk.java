package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
/* loaded from: classes4.dex */
final class blk<T> extends bjf<T> {
    private final bin a;

    /* renamed from: b  reason: collision with root package name */
    private final bjf f883b;
    private final Type c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public blk(bin binVar, bjf bjfVar, Type type) {
        this.a = binVar;
        this.f883b = bjfVar;
        this.c = type;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final T read(bnc bncVar) throws IOException {
        return (T) this.f883b.read(bncVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.reflect.Type] */
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, T t) throws IOException {
        bjf bjfVar = this.f883b;
        ?? r1 = this.c;
        Class<?> cls = (t == null || !(r1 == Object.class || (r1 instanceof TypeVariable) || (r1 instanceof Class))) ? r1 : t.getClass();
        if (cls != r1) {
            bjfVar = this.a.a(bna.b(cls));
            if (bjfVar instanceof ble) {
                bjf bjfVar2 = this.f883b;
                if (!(bjfVar2 instanceof ble)) {
                    bjfVar = bjfVar2;
                }
            }
        }
        bjfVar.write(bneVar, t);
    }
}
