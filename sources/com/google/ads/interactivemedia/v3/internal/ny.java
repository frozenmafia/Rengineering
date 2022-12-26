package com.google.ads.interactivemedia.v3.internal;

import java.util.UUID;
/* loaded from: classes4.dex */
public final class ny implements dz {
    public static final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final UUID f1188b;
    public final byte[] c;
    public final boolean d;

    static {
        a = "Amazon".equals(cp.c) && ("AFTM".equals(cp.d) || "AFTB".equals(cp.d));
    }

    public ny(UUID uuid, byte[] bArr, boolean z) {
        this.f1188b = uuid;
        this.c = bArr;
        this.d = z;
    }
}
