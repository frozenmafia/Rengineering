package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public final class vf {
    private final Object a;

    public vf() {
        this.a = bm.a;
    }

    public vf(byte[] bArr) {
        this.a = new SparseArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.ads.interactivemedia.v3.internal.bm, java.lang.Object] */
    public final vg a(bf bfVar, int[] iArr, wl wlVar, avb avbVar) {
        return new vg(bfVar, iArr, wlVar, avbVar, this.a);
    }

    public final cn b(int i) {
        cn cnVar = (cn) ((SparseArray) this.a).get(i);
        if (cnVar == null) {
            cn cnVar2 = new cn(TimestampAdjuster.MODE_SHARED);
            ((SparseArray) this.a).put(i, cnVar2);
            return cnVar2;
        }
        return cnVar;
    }

    public final void c() {
        ((SparseArray) this.a).clear();
    }

    public final Class d() {
        return ((Field) this.a).getDeclaringClass();
    }

    public final String e() {
        return ((Field) this.a).getName();
    }

    public vf(Field field) {
        bic.g(field);
        this.a = field;
    }
}
