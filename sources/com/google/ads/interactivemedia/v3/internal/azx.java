package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
final class azx extends aza {
    private final String a;

    /* renamed from: b  reason: collision with root package name */
    private final int f780b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ azx(String str, int i) {
        this.a = str;
        this.f780b = i;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        int i = this.f780b;
        int i2 = i - 2;
        int i3 = bgy.a;
        if (i == 0) {
            throw null;
        }
        objArr[1] = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
