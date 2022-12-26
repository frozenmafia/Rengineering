package com.google.ads.interactivemedia.v3.internal;

import java.util.Map;
/* loaded from: classes4.dex */
public final /* synthetic */ class dg implements asz {
    private final /* synthetic */ int c;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ dg f1013b = new dg(1);
    public static final /* synthetic */ dg a = new dg(0);

    private /* synthetic */ dg(int i) {
        this.c = i;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asz
    public final boolean a(Object obj) {
        return this.c != 0 ? ((Map.Entry) obj).getKey() != null : ((String) obj) != null;
    }
}
