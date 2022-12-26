package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
/* loaded from: classes7.dex */
final class avg implements Serializable {
    private static final long serialVersionUID = 0;
    final avf a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avg(avf avfVar) {
        this.a = avfVar;
    }

    Object readResolve() {
        return this.a.entrySet();
    }
}
