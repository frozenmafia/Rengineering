package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
/* loaded from: classes7.dex */
public final class avm extends avd {
    private transient Object[] d;
    private transient Object[] e;
    private final Comparator f;

    public avm(Comparator comparator) {
        atc.k(comparator);
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avd
    public final /* synthetic */ avd a(Object obj, Object obj2) {
        int i = this.f735b + 1;
        int length = this.d.length;
        if (i > length) {
            int e = auu.e(length, i);
            this.d = Arrays.copyOf(this.d, e);
            this.e = Arrays.copyOf(this.e, e);
        }
        axb.I(obj, obj2);
        Object[] objArr = this.d;
        int i2 = this.f735b;
        objArr[i2] = obj;
        this.e[i2] = obj2;
        this.f735b = i2 + 1;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avd
    public final /* synthetic */ void c(Map.Entry entry) {
        super.c(entry);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avd
    public final /* synthetic */ avf b() {
        int i;
        int i2 = this.f735b;
        if (i2 != 0) {
            if (i2 == 1) {
                Comparator comparator = this.f;
                Object obj = this.d[0];
                obj.getClass();
                Object obj2 = this.e[0];
                obj2.getClass();
                avb p = avb.p(obj);
                atc.k(comparator);
                return new avo(new awt(p, comparator), avb.p(obj2));
            }
            Object[] copyOf = Arrays.copyOf(this.d, i2);
            Arrays.sort(copyOf, this.f);
            Object[] objArr = new Object[this.f735b];
            for (int i3 = 0; i3 < this.f735b; i3++) {
                if (i3 > 0) {
                    if (this.f.compare(copyOf[i3 - 1], copyOf[i3]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + copyOf[i] + " and " + copyOf[i3]);
                    }
                }
                Object obj3 = this.d[i3];
                obj3.getClass();
                int binarySearch = Arrays.binarySearch(copyOf, obj3, this.f);
                Object obj4 = this.e[i3];
                obj4.getClass();
                objArr[binarySearch] = obj4;
            }
            return new avo(new awt(avb.k(copyOf), this.f), avb.k(objArr));
        }
        return avo.l(this.f);
    }
}
