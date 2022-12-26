package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class boz {
    private static final bpw a = new bpw((byte[]) null);

    /* renamed from: b  reason: collision with root package name */
    private static final bpw f923b;

    static {
        bpw bpwVar = null;
        try {
            bpwVar = (bpw) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f923b = bpwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpw a() {
        bpw bpwVar = f923b;
        if (bpwVar != null) {
            return bpwVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bpw b() {
        return a;
    }
}
