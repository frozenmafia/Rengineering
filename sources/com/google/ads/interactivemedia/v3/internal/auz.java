package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* loaded from: classes7.dex */
final class auz implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public auz(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return avb.n(this.a);
    }
}
