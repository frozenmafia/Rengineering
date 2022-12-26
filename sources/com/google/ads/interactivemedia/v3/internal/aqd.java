package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class aqd {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f675b;
    private final int c = 1;

    protected aqd(String str, Object obj, int i) {
        this.a = str;
        this.f675b = obj;
    }

    public static aqd a(String str, boolean z) {
        return new aqd(str, Boolean.valueOf(z), 1);
    }

    public final Object b() {
        aqg a = aqi.a();
        if (a == null) {
            if (aqi.b() != null) {
                aqi.b().a();
            }
            return this.f675b;
        }
        return a.a(this.a, ((Boolean) this.f675b).booleanValue());
    }
}
