package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes7.dex */
public final class avq extends avi {
    private final Comparator d;

    public avq(Comparator comparator) {
        atc.k(comparator);
        this.d = comparator;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi, com.google.ads.interactivemedia.v3.internal.aut, com.google.ads.interactivemedia.v3.internal.auu
    public final /* synthetic */ void b(Object obj) {
        super.b(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avi
    public final /* synthetic */ avi f(Object obj) {
        super.b(obj);
        return this;
    }

    public final avs h() {
        awt awtVar;
        Object[] objArr = this.a;
        Comparator comparator = this.d;
        int i = this.f731b;
        if (i == 0) {
            awtVar = avs.w(comparator);
        } else {
            axb.l(objArr, i);
            Arrays.sort(objArr, 0, i, comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                    objArr[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, i, (Object) null);
            if (i2 < (objArr.length >> 1)) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            awtVar = new awt(avb.l(objArr, i2), comparator);
        }
        this.f731b = awtVar.size();
        this.c = true;
        return awtVar;
    }

    public final void i(Object... objArr) {
        super.g(objArr);
    }
}
