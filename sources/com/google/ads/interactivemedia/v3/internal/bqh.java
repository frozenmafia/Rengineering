package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class bqh implements bqo {

    /* renamed from: b  reason: collision with root package name */
    private static final bqh f942b = new bqh(1, null);
    private final /* synthetic */ int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqh(int i) {
        this.a = i;
    }

    private bqh(int i, byte[] bArr) {
        this.a = i;
    }

    public static bqh c() {
        return f942b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqo
    public final boolean b(Class cls) {
        if (this.a != 0) {
            return bpk.class.isAssignableFrom(cls);
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqo
    public final bqn a(Class cls) {
        if (this.a != 0) {
            if (!bpk.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
            }
            try {
                return (bqn) bpk.az(cls.asSubclass(bpk.class)).aK(3);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        }
        throw new IllegalStateException("This should never be called.");
    }
}
