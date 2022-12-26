package o;

import java.util.List;
import o.SplashScreenViewProvider;
import o.readText;
/* loaded from: classes3.dex */
public abstract class writeBytes extends SplashScreenViewProvider.ViewImpl31 implements readText.Cdefault {
    private long toString;
    private readText.Cdefault values;

    public void valueOf(long j, readText.Cdefault cdefault, long j2) {
        this.valueOf = j;
        this.values = cdefault;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.valueOf;
        }
        this.toString = j2;
    }

    @Override // o.readText.Cdefault
    public int ag$a() {
        return ((readText.Cdefault) FingerprintManagerCompat.toString(this.values)).ag$a();
    }

    @Override // o.readText.Cdefault
    public long toString(int i) {
        return ((readText.Cdefault) FingerprintManagerCompat.toString(this.values)).toString(i) + this.toString;
    }

    @Override // o.readText.Cdefault
    public int valueOf(long j) {
        return ((readText.Cdefault) FingerprintManagerCompat.toString(this.values)).valueOf(j - this.toString);
    }

    @Override // o.readText.Cdefault
    public List<isCompatTintEnabled> toString(long j) {
        return ((readText.Cdefault) FingerprintManagerCompat.toString(this.values)).toString(j - this.toString);
    }

    @Override // o.get_splashScreenView
    public void values() {
        super.values();
        this.values = null;
    }
}
