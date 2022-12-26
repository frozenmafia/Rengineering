package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* loaded from: classes4.dex */
final class bll extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        bncVar.i();
        while (bncVar.p()) {
            try {
                arrayList.add(Integer.valueOf(bncVar.b()));
            } catch (NumberFormatException e) {
                throw new biz(e);
            }
        }
        bncVar.k();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bneVar.b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            bneVar.h(atomicIntegerArray.get(i));
        }
        bneVar.d();
    }
}
