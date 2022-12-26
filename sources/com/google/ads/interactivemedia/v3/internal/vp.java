package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
/* loaded from: classes4.dex */
public final class vp extends bi {
    public static final vp B = new vo().v();
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    private final SparseArray P;
    private final SparseBooleanArray Q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ vp(vo voVar) {
        super(voVar);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        z = voVar.a;
        this.C = z;
        this.D = false;
        z2 = voVar.f1318b;
        this.E = z2;
        this.F = false;
        z3 = voVar.c;
        this.G = z3;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = false;
        z4 = voVar.d;
        this.L = z4;
        z5 = voVar.e;
        this.M = z5;
        this.N = false;
        z6 = voVar.f;
        this.O = z6;
        sparseArray = voVar.g;
        this.P = sparseArray;
        sparseBooleanArray = voVar.h;
        this.Q = sparseBooleanArray;
    }

    public static vp a(Context context) {
        return new vo(context).v();
    }

    @Deprecated
    public final vq b(int i, ui uiVar) {
        Map map = (Map) this.P.get(i);
        if (map != null) {
            return (vq) map.get(uiVar);
        }
        return null;
    }

    public final boolean c(int i) {
        return this.Q.get(i);
    }

    @Deprecated
    public final boolean d(int i, ui uiVar) {
        Map map = (Map) this.P.get(i);
        return map != null && map.containsKey(uiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bi
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vp vpVar = (vp) obj;
            if (super.equals(vpVar) && this.C == vpVar.C && this.E == vpVar.E && this.G == vpVar.G && this.L == vpVar.L && this.M == vpVar.M && this.O == vpVar.O) {
                SparseBooleanArray sparseBooleanArray = this.Q;
                SparseBooleanArray sparseBooleanArray2 = vpVar.Q;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.P;
                            SparseArray sparseArray2 = vpVar.P;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                ui uiVar = (ui) entry.getKey();
                                                if (map2.containsKey(uiVar)) {
                                                    if (!cp.V(entry.getValue(), map2.get(uiVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bi
    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 961) + (this.E ? 1 : 0)) * 961) + (this.G ? 1 : 0)) * 28629151) + (this.L ? 1 : 0)) * 31) + (this.M ? 1 : 0)) * 961) + (this.O ? 1 : 0);
    }
}
