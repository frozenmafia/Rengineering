package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* loaded from: classes7.dex */
final class avj implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avj(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return avk.m(this.a);
    }
}
