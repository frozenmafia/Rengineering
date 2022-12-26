package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes4.dex */
final class bla extends bjf {
    private final bjf a;

    /* renamed from: b  reason: collision with root package name */
    private final bjf f874b;
    private final bkf c;

    public bla(bin binVar, Type type, bjf bjfVar, Type type2, bjf bjfVar2, bkf bkfVar) {
        this.a = new blk(binVar, bjfVar, type);
        this.f874b = new blk(binVar, bjfVar2, type2);
        this.c = bkfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        int r = bncVar.r();
        if (r == 9) {
            bncVar.m();
            return null;
        }
        Map map = (Map) this.c.a();
        if (r == 1) {
            bncVar.i();
            while (bncVar.p()) {
                bncVar.i();
                Object read = this.a.read(bncVar);
                if (map.put(read, this.f874b.read(bncVar)) == null) {
                    bncVar.k();
                } else {
                    Objects.toString(read);
                    throw new biz("duplicate key: ".concat(String.valueOf(read)));
                }
            }
            bncVar.k();
        } else {
            bncVar.j();
            while (bncVar.p()) {
                bjv.a.a(bncVar);
                Object read2 = this.a.read(bncVar);
                if (map.put(read2, this.f874b.read(bncVar)) != null) {
                    Objects.toString(read2);
                    throw new biz("duplicate key: ".concat(String.valueOf(read2)));
                }
            }
            bncVar.l();
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            bneVar.g();
            return;
        }
        bneVar.c();
        for (Map.Entry entry : map.entrySet()) {
            bneVar.f(String.valueOf(entry.getKey()));
            this.f874b.write(bneVar, entry.getValue());
        }
        bneVar.e();
    }
}
