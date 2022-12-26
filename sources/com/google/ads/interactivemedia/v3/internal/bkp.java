package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public final class bkp extends bjf {
    public static final bjg a = new bkr(1);

    /* renamed from: b  reason: collision with root package name */
    private final Class f866b;
    private final bjf c;

    public bkp(bin binVar, bjf bjfVar, Class cls) {
        this.c = new blk(binVar, bjfVar, cls);
        this.f866b = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bncVar.i();
        while (bncVar.p()) {
            arrayList.add(this.c.read(bncVar));
        }
        bncVar.k();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f866b, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final void write(bne bneVar, Object obj) throws IOException {
        if (obj == null) {
            bneVar.g();
            return;
        }
        bneVar.b();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.c.write(bneVar, Array.get(obj, i));
        }
        bneVar.d();
    }
}
