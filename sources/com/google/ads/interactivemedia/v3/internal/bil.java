package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes4.dex */
final class bil extends bjf {
    final /* synthetic */ bjf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bil(bjf bjfVar) {
        this.a = bjfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bncVar.i();
        while (bncVar.p()) {
            arrayList.add(Long.valueOf(((Number) this.a.read(bncVar)).longValue()));
        }
        bncVar.k();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        bneVar.b();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.a.write(bneVar, Long.valueOf(atomicLongArray.get(i)));
        }
        bneVar.d();
    }
}
