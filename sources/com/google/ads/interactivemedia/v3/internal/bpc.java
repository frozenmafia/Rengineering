package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
enum bpc {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean f;

    bpc(boolean z) {
        this.f = z;
    }
}
