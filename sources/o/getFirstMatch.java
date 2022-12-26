package o;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
class getFirstMatch {
    private final AtomicReference<RuntimeException> HaptikSDK$a;
    private boolean HaptikSDK$b;
    private Handler ah$a;
    private final HandlerThread invoke;
    private final onAuthenticationSucceeded toString;
    private final MediaCodec valueOf;
    private static final ArrayDeque<valueOf> values = new ArrayDeque<>();
    private static final Object ag$a = new Object();

    public getFirstMatch(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new onAuthenticationSucceeded());
    }

    getFirstMatch(MediaCodec mediaCodec, HandlerThread handlerThread, onAuthenticationSucceeded onauthenticationsucceeded) {
        this.valueOf = mediaCodec;
        this.invoke = handlerThread;
        this.toString = onauthenticationsucceeded;
        this.HaptikSDK$a = new AtomicReference<>();
    }

    public void valueOf() {
        if (this.HaptikSDK$b) {
            return;
        }
        this.invoke.start();
        this.ah$a = new Handler(this.invoke.getLooper()) { // from class: o.getFirstMatch.2
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                getFirstMatch.this.ah$a(message);
            }
        };
        this.HaptikSDK$b = true;
    }

    public void values(int i, int i2, int i3, long j, int i4) {
        HaptikSDK$c();
        valueOf HaptikSDK$b = HaptikSDK$b();
        HaptikSDK$b.values(i, i2, i3, j, i4);
        ((Handler) getElevationDegrees.ah$a(this.ah$a)).obtainMessage(0, HaptikSDK$b).sendToTarget();
    }

    public void toString(int i, int i2, getIconView geticonview, long j, int i3) {
        HaptikSDK$c();
        valueOf HaptikSDK$b = HaptikSDK$b();
        HaptikSDK$b.values(i, i2, 0, j, i3);
        ah$a(geticonview, HaptikSDK$b.ah$a);
        ((Handler) getElevationDegrees.ah$a(this.ah$a)).obtainMessage(1, HaptikSDK$b).sendToTarget();
    }

    public void ag$a() {
        if (this.HaptikSDK$b) {
            try {
                ah$b();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void ah$a() {
        if (this.HaptikSDK$b) {
            ag$a();
            this.invoke.quit();
        }
        this.HaptikSDK$b = false;
    }

    public void values() throws InterruptedException {
        invoke();
    }

    private void HaptikSDK$c() {
        RuntimeException andSet = this.HaptikSDK$a.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void ah$b() throws InterruptedException {
        ((Handler) FingerprintManagerCompat.toString(this.ah$a)).removeCallbacksAndMessages(null);
        invoke();
    }

    private void invoke() throws InterruptedException {
        this.toString.ah$a();
        ((Handler) FingerprintManagerCompat.toString(this.ah$a)).obtainMessage(2).sendToTarget();
        this.toString.ag$a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah$a(Message message) {
        int i = message.what;
        valueOf valueof = null;
        if (i == 0) {
            valueof = (valueOf) message.obj;
            ag$a(valueof.values, valueof.valueOf, valueof.ah$b, valueof.toString, valueof.ag$a);
        } else if (i == 1) {
            valueof = (valueOf) message.obj;
            ah$a(valueof.values, valueof.valueOf, valueof.ah$a, valueof.toString, valueof.ag$a);
        } else if (i == 2) {
            this.toString.HaptikSDK$a();
        } else {
            this.HaptikSDK$a.compareAndSet(null, new IllegalStateException(String.valueOf(message.what)));
        }
        if (valueof != null) {
            ah$a(valueof);
        }
    }

    private void ag$a(int i, int i2, int i3, long j, int i4) {
        try {
            this.valueOf.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            this.HaptikSDK$a.compareAndSet(null, e);
        }
    }

    private void ah$a(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (ag$a) {
                this.valueOf.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            this.HaptikSDK$a.compareAndSet(null, e);
        }
    }

    private static valueOf HaptikSDK$b() {
        ArrayDeque<valueOf> arrayDeque = values;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new valueOf();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void ah$a(valueOf valueof) {
        ArrayDeque<valueOf> arrayDeque = values;
        synchronized (arrayDeque) {
            arrayDeque.add(valueof);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class valueOf {
        public int ag$a;
        public final MediaCodec.CryptoInfo ah$a = new MediaCodec.CryptoInfo();
        public int ah$b;
        public long toString;
        public int valueOf;
        public int values;

        valueOf() {
        }

        public void values(int i, int i2, int i3, long j, int i4) {
            this.values = i;
            this.valueOf = i2;
            this.ah$b = i3;
            this.toString = j;
            this.ag$a = i4;
        }
    }

    private static void ah$a(getIconView geticonview, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = geticonview.ah$b;
        cryptoInfo.numBytesOfClearData = ag$a(geticonview.invoke, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = ag$a(geticonview.HaptikSDK$a, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) FingerprintManagerCompat.toString(ah$a(geticonview.valueOf, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) FingerprintManagerCompat.toString(ah$a(geticonview.ag$a, cryptoInfo.iv));
        cryptoInfo.mode = geticonview.values;
        if (getElevationDegrees.HaptikSDK$b >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(geticonview.toString, geticonview.ah$a));
        }
    }

    private static int[] ag$a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private static byte[] ah$a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
