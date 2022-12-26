package o;

import android.media.MediaCodec;
/* loaded from: classes3.dex */
public final class getIconView {
    public int[] HaptikSDK$a;
    private final values HaptikSDK$b;
    private final MediaCodec.CryptoInfo HaptikSDK$c;
    public byte[] ag$a;
    public int ah$a;
    public int ah$b;
    public int[] invoke;
    public int toString;
    public byte[] valueOf;
    public int values;

    public getIconView() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.HaptikSDK$c = cryptoInfo;
        this.HaptikSDK$b = getElevationDegrees.HaptikSDK$b >= 24 ? new values(cryptoInfo) : null;
    }

    public void toString(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.ah$b = i;
        this.invoke = iArr;
        this.HaptikSDK$a = iArr2;
        this.valueOf = bArr;
        this.ag$a = bArr2;
        this.values = i2;
        this.toString = i3;
        this.ah$a = i4;
        this.HaptikSDK$c.numSubSamples = i;
        this.HaptikSDK$c.numBytesOfClearData = iArr;
        this.HaptikSDK$c.numBytesOfEncryptedData = iArr2;
        this.HaptikSDK$c.key = bArr;
        this.HaptikSDK$c.iv = bArr2;
        this.HaptikSDK$c.mode = i2;
        if (getElevationDegrees.HaptikSDK$b >= 24) {
            ((values) FingerprintManagerCompat.toString(this.HaptikSDK$b)).valueOf(i3, i4);
        }
    }

    public MediaCodec.CryptoInfo values() {
        return this.HaptikSDK$c;
    }

    public void toString(int i) {
        if (i == 0) {
            return;
        }
        if (this.invoke == null) {
            int[] iArr = new int[1];
            this.invoke = iArr;
            this.HaptikSDK$c.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.invoke;
        iArr2[0] = iArr2[0] + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class values {
        private final MediaCodec.CryptoInfo.Pattern ah$a;
        private final MediaCodec.CryptoInfo values;

        private values(MediaCodec.CryptoInfo cryptoInfo) {
            this.values = cryptoInfo;
            this.ah$a = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void valueOf(int i, int i2) {
            this.ah$a.set(i, i2);
            this.values.setPattern(this.ah$a);
        }
    }
}
