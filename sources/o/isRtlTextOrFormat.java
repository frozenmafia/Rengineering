package o;

import com.appsamurai.storyly.exoplayer2.common.ParserException;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class isRtlTextOrFormat {
    public int HaptikSDK$a;
    public int HaptikSDK$b;
    public int HaptikSDK$c;
    public long ah$a;
    public long ah$b;
    public long invoke;
    public int toString;
    public int valueOf;
    public long values;
    public final int[] ag$a = new int[255];
    private final C$default$setContentDescription HaptikSDK$e = new C$default$setContentDescription(255);

    public void values() {
        this.HaptikSDK$a = 0;
        this.HaptikSDK$b = 0;
        this.values = 0L;
        this.ah$b = 0L;
        this.invoke = 0L;
        this.ah$a = 0L;
        this.HaptikSDK$c = 0;
        this.valueOf = 0;
        this.toString = 0;
    }

    public boolean toString(getExitDir getexitdir) throws IOException {
        return ag$a(getexitdir, -1L);
    }

    public boolean ag$a(getExitDir getexitdir, long j) throws IOException {
        int i;
        FingerprintManagerCompat.toString(getexitdir.values() == getexitdir.ag$a());
        this.HaptikSDK$e.valueOf(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || getexitdir.values() + 4 < j) && isRtlLocale.valueOf(getexitdir, this.HaptikSDK$e.ah$a(), 0, 4, true)) {
                this.HaptikSDK$e.HaptikSDK$b(0);
                if (this.HaptikSDK$e.onPostMessage() == 1332176723) {
                    getexitdir.valueOf();
                    return true;
                }
                getexitdir.values(1);
            }
        }
        do {
            if (i != 0 && getexitdir.values() >= j) {
                break;
            }
        } while (getexitdir.ag$a(1) != -1);
        return false;
    }

    public boolean values(getExitDir getexitdir, boolean z) throws IOException {
        values();
        this.HaptikSDK$e.valueOf(27);
        if (isRtlLocale.valueOf(getexitdir, this.HaptikSDK$e.ah$a(), 0, 27, z) && this.HaptikSDK$e.onPostMessage() == 1332176723) {
            int extraCallbackWithResult = this.HaptikSDK$e.extraCallbackWithResult();
            this.HaptikSDK$a = extraCallbackWithResult;
            if (extraCallbackWithResult != 0) {
                if (z) {
                    return false;
                }
                throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
            }
            this.HaptikSDK$b = this.HaptikSDK$e.extraCallbackWithResult();
            this.values = this.HaptikSDK$e.HaptikSDK$e();
            this.ah$b = this.HaptikSDK$e.onXdkEvent();
            this.invoke = this.HaptikSDK$e.onXdkEvent();
            this.ah$a = this.HaptikSDK$e.onXdkEvent();
            int extraCallbackWithResult2 = this.HaptikSDK$e.extraCallbackWithResult();
            this.HaptikSDK$c = extraCallbackWithResult2;
            this.valueOf = extraCallbackWithResult2 + 27;
            this.HaptikSDK$e.valueOf(extraCallbackWithResult2);
            if (isRtlLocale.valueOf(getexitdir, this.HaptikSDK$e.ah$a(), 0, this.HaptikSDK$c, z)) {
                for (int i = 0; i < this.HaptikSDK$c; i++) {
                    this.ag$a[i] = this.HaptikSDK$e.extraCallbackWithResult();
                    this.toString += this.ag$a[i];
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
