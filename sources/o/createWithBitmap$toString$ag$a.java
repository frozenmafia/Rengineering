package o;

import o.createWithBitmap;
/* loaded from: classes3.dex */
public final class createWithBitmap$toString$ag$a {
    private boolean ag$a;
    private long ah$a;
    private boolean toString;
    private long valueOf;
    private boolean values;

    public createWithBitmap$toString$ag$a() {
        this.valueOf = Long.MIN_VALUE;
    }

    private createWithBitmap$toString$ag$a(createWithBitmap.toString tostring) {
        this.ah$a = tostring.HaptikSDK$c;
        this.valueOf = tostring.toString;
        this.values = tostring.valueOf;
        this.toString = tostring.ag$a;
        this.ag$a = tostring.HaptikSDK$a;
    }

    public createWithBitmap$toString$ag$a toString(long j) {
        FingerprintManagerCompat.toString(j >= 0);
        this.ah$a = j;
        return this;
    }

    public createWithBitmap$toString$ag$a valueOf(long j) {
        FingerprintManagerCompat.toString(j == Long.MIN_VALUE || j >= 0);
        this.valueOf = j;
        return this;
    }

    public createWithBitmap$toString$ag$a toString(boolean z) {
        this.values = z;
        return this;
    }

    public createWithBitmap$toString$ag$a ag$a(boolean z) {
        this.toString = z;
        return this;
    }

    public createWithBitmap$toString$ag$a values(boolean z) {
        this.ag$a = z;
        return this;
    }

    public createWithBitmap.toString values() {
        return ah$a();
    }

    @Deprecated
    public createWithBitmap.valueOf ah$a() {
        return new createWithBitmap.valueOf(this);
    }
}
