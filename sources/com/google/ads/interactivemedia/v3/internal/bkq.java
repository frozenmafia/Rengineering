package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes4.dex */
final class bkq extends bjf {
    private final bjf a;

    /* renamed from: b  reason: collision with root package name */
    private final bkf f867b;

    public bkq(bin binVar, Type type, bjf bjfVar, bkf bkfVar) {
        this.a = new blk(binVar, bjfVar, type);
        this.f867b = bkfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        Collection collection = (Collection) this.f867b.a();
        bncVar.i();
        while (bncVar.p()) {
            collection.add(this.a.read(bncVar));
        }
        bncVar.k();
        return collection;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Collection<Object> collection = (Collection) obj;
        if (collection == null) {
            bneVar.g();
            return;
        }
        bneVar.b();
        for (Object obj2 : collection) {
            this.a.write(bneVar, obj2);
        }
        bneVar.d();
    }
}
