package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class aem {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f517b;
    public final List c;
    public final byte[] d;

    public aem(int i, String str, List list, byte[] bArr) {
        this.a = i;
        this.f517b = str;
        this.c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.d = bArr;
    }
}
