package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bnh;
import com.google.ads.interactivemedia.v3.internal.bni;
import java.io.IOException;
/* loaded from: classes4.dex */
public abstract class bni<MessageType extends bni<MessageType, BuilderType>, BuilderType extends bnh<MessageType, BuilderType>> implements bqq {

    /* renamed from: b  reason: collision with root package name */
    protected int f901b = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public int at() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqq
    public final bnz au() {
        try {
            int ax = ax();
            bnz bnzVar = bnz.f907b;
            byte[] bArr = new byte[ax];
            boh B = boh.B(bArr);
            bp(bpw.ax(B));
            return bpw.aw(B, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void av(int i) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqq
    public final byte[] aw() {
        try {
            byte[] bArr = new byte[ax()];
            boh B = boh.B(bArr);
            bp(B);
            B.C();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
