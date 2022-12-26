package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class arj {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f686b;
    private final boolean c;

    public arj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ arj(String str, boolean z, boolean z2) {
        this();
        this.a = str;
        this.f686b = z;
        this.c = z2;
    }

    public static ari a() {
        ari ariVar = new ari(null);
        ariVar.d(false);
        ariVar.c();
        return ariVar;
    }

    public final String b() {
        return this.a;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.f686b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof arj) {
            arj arjVar = (arj) obj;
            return this.a.equals(arjVar.b()) && this.f686b == arjVar.d() && this.c == arjVar.c();
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return ((((hashCode ^ 1000003) * 1000003) ^ (true != this.f686b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.f686b;
        boolean z2 = this.c;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }
}
