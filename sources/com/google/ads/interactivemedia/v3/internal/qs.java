package com.google.ads.interactivemedia.v3.internal;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class qs {
    private static final ArrayDeque a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f1236b = new Object();
    private final MediaCodec c;
    private final HandlerThread d;
    private Handler e;
    private final AtomicReference f;
    private boolean g;
    private final agi h;

    public qs(MediaCodec mediaCodec, HandlerThread handlerThread) {
        agi agiVar = new agi();
        this.c = mediaCodec;
        this.d = handlerThread;
        this.h = agiVar;
        this.f = new AtomicReference();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.google.ads.interactivemedia.v3.internal.qs r8, android.os.Message r9) {
        /*
            int r0 = r9.what
            if (r0 == 0) goto L45
            r1 = 1
            if (r0 == r1) goto L22
            r1 = 2
            if (r0 == r1) goto L1b
            java.util.concurrent.atomic.AtomicReference r8 = r8.f
            int r9 = r9.what
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r0.<init>(r9)
            com.google.ads.interactivemedia.v3.internal.pe.b(r8, r0)
            goto L20
        L1b:
            com.google.ads.interactivemedia.v3.internal.agi r8 = r8.h
            r8.f()
        L20:
            r8 = 0
            goto L61
        L22:
            java.lang.Object r9 = r9.obj
            com.google.ads.interactivemedia.v3.internal.qr r9 = (com.google.ads.interactivemedia.v3.internal.qr) r9
            int r1 = r9.a
            int r0 = r9.f1235b
            android.media.MediaCodec$CryptoInfo r3 = r9.d
            long r4 = r9.e
            int r6 = r9.f
            java.lang.Object r7 = com.google.ads.interactivemedia.v3.internal.qs.f1236b     // Catch: java.lang.RuntimeException -> L3e
            monitor-enter(r7)     // Catch: java.lang.RuntimeException -> L3e
            android.media.MediaCodec r0 = r8.c     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r0.queueSecureInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            goto L60
        L3b:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.RuntimeException -> L3e
        L3e:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r8 = r8.f
            com.google.ads.interactivemedia.v3.internal.pe.b(r8, r0)
            goto L60
        L45:
            java.lang.Object r9 = r9.obj
            com.google.ads.interactivemedia.v3.internal.qr r9 = (com.google.ads.interactivemedia.v3.internal.qr) r9
            int r1 = r9.a
            int r0 = r9.f1235b
            int r3 = r9.c
            long r4 = r9.e
            int r6 = r9.f
            android.media.MediaCodec r0 = r8.c     // Catch: java.lang.RuntimeException -> L5a
            r2 = 0
            r0.queueInputBuffer(r1, r2, r3, r4, r6)     // Catch: java.lang.RuntimeException -> L5a
            goto L60
        L5a:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicReference r8 = r8.f
            com.google.ads.interactivemedia.v3.internal.pe.b(r8, r0)
        L60:
            r8 = r9
        L61:
            if (r8 == 0) goto L6e
            java.util.ArrayDeque r9 = com.google.ads.interactivemedia.v3.internal.qs.a
            monitor-enter(r9)
            r9.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6b
            return
        L6b:
            r8 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L6b
            throw r8
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.qs.a(com.google.ads.interactivemedia.v3.internal.qs, android.os.Message):void");
    }

    private static qr g() {
        ArrayDeque arrayDeque = a;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new qr();
            }
            return (qr) arrayDeque.removeFirst();
        }
    }

    private final void h() {
        RuntimeException runtimeException = (RuntimeException) this.f.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void b() {
        if (this.g) {
            try {
                Handler handler = this.e;
                af.s(handler);
                handler.removeCallbacksAndMessages(null);
                this.h.g();
                Handler handler2 = this.e;
                af.s(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.h.c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void c() {
        if (this.g) {
            b();
            this.d.quit();
        }
        this.g = false;
    }

    public final void d() {
        if (this.g) {
            return;
        }
        this.d.start();
        this.e = new qq(this, this.d.getLooper());
        this.g = true;
    }

    public final void e(int i, int i2, long j, int i3) {
        h();
        qr g = g();
        g.a(i, i2, j, i3);
        Handler handler = this.e;
        int i4 = cp.a;
        handler.obtainMessage(0, g).sendToTarget();
    }

    public final void f(int i, eb ebVar, long j) {
        h();
        qr g = g();
        g.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = g.d;
        cryptoInfo.numSubSamples = ebVar.f;
        cryptoInfo.numBytesOfClearData = j(ebVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = j(ebVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) af.s(i(ebVar.f1023b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) af.s(i(ebVar.a, cryptoInfo.iv));
        cryptoInfo.mode = ebVar.c;
        if (cp.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ebVar.g, ebVar.h));
        }
        this.e.obtainMessage(1, g).sendToTarget();
    }

    private static byte[] i(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] j(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }
}
