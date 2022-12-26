package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* loaded from: classes4.dex */
final class aeu implements aet {
    private final FileChannel a;

    /* renamed from: b  reason: collision with root package name */
    private final long f521b;
    private final long c;

    public aeu(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.f521b = j;
        this.c = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aet
    public final long a() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aet
    public final void b(MessageDigest[] messageDigestArr, long j, int i) throws IOException {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.f521b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
