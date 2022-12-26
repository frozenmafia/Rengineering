package com.google.ads.interactivemedia.v3.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bqz implements bqn {
    private final bqq a;

    /* renamed from: b  reason: collision with root package name */
    private final String f953b;
    private final Object[] c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqz(bqq bqqVar, String str, Object[] objArr) {
        this.a = bqqVar;
        this.f953b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i3);
                return;
            }
            i |= (charAt2 & 8191) << i3;
            i3 += 13;
            i2++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final bqq a() {
        return this.a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final int c() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.f953b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] e() {
        return this.c;
    }
}
