package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes4.dex */
public final class aah extends aae {
    public static final aag c(ci ciVar) {
        String s = ciVar.s();
        af.s(s);
        String s2 = ciVar.s();
        af.s(s2);
        return new aag(s, s2, ciVar.o(), ciVar.o(), Arrays.copyOfRange(ciVar.H(), ciVar.c(), ciVar.d()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aae
    protected final ao b(ByteBuffer byteBuffer) {
        return new ao(c(new ci(byteBuffer.array(), byteBuffer.limit())));
    }
}
