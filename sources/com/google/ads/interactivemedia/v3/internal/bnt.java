package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class bnt extends bnx {
    private static final long serialVersionUID = 1;
    private final int c;
    private final int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bnt(byte[] bArr, int i, int i2) {
        super(bArr);
        q(i, i + i2, bArr.length);
        this.c = i;
        this.d = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnx, com.google.ads.interactivemedia.v3.internal.bnz
    public final byte a(int i) {
        A(i, this.d);
        return this.a[this.c + i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.ads.interactivemedia.v3.internal.bnx, com.google.ads.interactivemedia.v3.internal.bnz
    public final byte b(int i) {
        return this.a[this.c + i];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnx
    protected final int c() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnx, com.google.ads.interactivemedia.v3.internal.bnz
    public final int d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.bnx, com.google.ads.interactivemedia.v3.internal.bnz
    public final void e(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, this.c + i, bArr, i2, i3);
    }

    Object writeReplace() {
        return bnz.x(C());
    }
}
