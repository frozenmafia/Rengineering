package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.internal.bnh;
import com.google.ads.interactivemedia.v3.internal.bni;
/* loaded from: classes4.dex */
public abstract class bnh<MessageType extends bni<MessageType, BuilderType>, BuilderType extends bnh<MessageType, BuilderType>> implements bqp {
    @Override // 
    /* renamed from: aQ */
    public abstract bnh clone();

    protected abstract bnh aR(bni bniVar);

    @Override // com.google.ads.interactivemedia.v3.internal.bqp
    public final /* synthetic */ bqp aS(bqq bqqVar) {
        if (!aZ().getClass().isInstance(bqqVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return aR((bni) bqqVar);
    }

    public void aT(byte[] bArr, int i, boy boyVar) throws bpt {
        throw null;
    }
}
