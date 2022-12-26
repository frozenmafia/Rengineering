package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class ByteString$ag$a implements ByteString.valueOf {
    @Override // java.util.Iterator
    /* renamed from: ah$a */
    public final Byte next() {
        return Byte.valueOf(ag$a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
