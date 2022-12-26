package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
public class avd {
    Object[] a;

    /* renamed from: b  reason: collision with root package name */
    int f735b;
    avc c;

    public avd() {
        this(4);
    }

    private final void e(int i) {
        int i2 = i + i;
        Object[] objArr = this.a;
        int length = objArr.length;
        if (i2 > length) {
            this.a = Arrays.copyOf(objArr, auu.e(length, i2));
        }
    }

    public avd a(Object obj, Object obj2) {
        e(this.f735b + 1);
        axb.I(obj, obj2);
        Object[] objArr = this.a;
        int i = this.f735b;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.f735b = i + 1;
        return this;
    }

    public avf b() {
        avc avcVar = this.c;
        if (avcVar == null) {
            awr k = awr.k(this.f735b, this.a, this);
            avc avcVar2 = this.c;
            if (avcVar2 == null) {
                return k;
            }
            throw avcVar2.a();
        }
        throw avcVar.a();
    }

    public void c(Map.Entry entry) {
        a(entry.getKey(), entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(Iterable iterable) {
        if (iterable instanceof Collection) {
            e(this.f735b + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c((Map.Entry) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public avd(int i) {
        this.a = new Object[i + i];
        this.f735b = 0;
    }
}
