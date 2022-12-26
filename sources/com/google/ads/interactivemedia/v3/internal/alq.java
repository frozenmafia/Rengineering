package com.google.ads.interactivemedia.v3.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes4.dex */
final class alq implements Runnable {
    private alq() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ alq(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            alr.b(MessageDigest.getInstance(MessageDigestAlgorithms.MD5));
            countDownLatch = alr.f629b;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = alr.f629b;
        } catch (Throwable th) {
            alr.f629b.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
