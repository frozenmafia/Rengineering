package o;

import com.google.android.exoplayer2.C;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TransitionKt$addListener$5 {
    private boolean ag$a;
    private boolean ah$a;
    private final int invoke;
    private boolean values;
    private final getCarrierFrequencyHz HaptikSDK$c = new getCarrierFrequencyHz(0);
    private long toString = C.TIME_UNSET;
    private long ah$b = C.TIME_UNSET;
    private long valueOf = C.TIME_UNSET;
    private final C$default$setContentDescription HaptikSDK$b = new C$default$setContentDescription();

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransitionKt$addListener$5(int i) {
        this.invoke = i;
    }

    public boolean ag$a() {
        return this.values;
    }

    public int ag$a(getExitDir getexitdir, skipTagForward skiptagforward, int i) throws IOException {
        if (i <= 0) {
            return toString(getexitdir);
        }
        if (!this.ag$a) {
            return values(getexitdir, skiptagforward, i);
        }
        if (this.ah$b == C.TIME_UNSET) {
            return toString(getexitdir);
        }
        if (!this.ah$a) {
            return ah$a(getexitdir, skiptagforward, i);
        }
        long j = this.toString;
        if (j == C.TIME_UNSET) {
            return toString(getexitdir);
        }
        long valueOf = this.HaptikSDK$c.valueOf(this.ah$b) - this.HaptikSDK$c.valueOf(j);
        this.valueOf = valueOf;
        if (valueOf < 0) {
            SupportMenuItem.toString("TsDurationReader", "Invalid duration: " + this.valueOf + ". Using TIME_UNSET instead.");
            this.valueOf = C.TIME_UNSET;
        }
        return toString(getexitdir);
    }

    public long values() {
        return this.valueOf;
    }

    public getCarrierFrequencyHz valueOf() {
        return this.HaptikSDK$c;
    }

    private int toString(getExitDir getexitdir) {
        this.HaptikSDK$b.valueOf(getElevationDegrees.values);
        this.values = true;
        getexitdir.valueOf();
        return 0;
    }

    private int ah$a(getExitDir getexitdir, skipTagForward skiptagforward, int i) throws IOException {
        int min = (int) Math.min(this.invoke, getexitdir.ah$a());
        long j = 0;
        if (getexitdir.values() != j) {
            skiptagforward.ah$a = j;
            return 1;
        }
        this.HaptikSDK$b.valueOf(min);
        getexitdir.valueOf();
        getexitdir.ag$a(this.HaptikSDK$b.ah$a(), 0, min);
        this.toString = valueOf(this.HaptikSDK$b, i);
        this.ah$a = true;
        return 0;
    }

    private long valueOf(C$default$setContentDescription c$default$setContentDescription, int i) {
        int HaptikSDK$a = c$default$setContentDescription.HaptikSDK$a();
        for (int valueOf = c$default$setContentDescription.valueOf(); valueOf < HaptikSDK$a; valueOf++) {
            if (c$default$setContentDescription.ah$a()[valueOf] == 71) {
                long ontransitionend = onTransitionEnd.toString(c$default$setContentDescription, valueOf, i);
                if (ontransitionend != C.TIME_UNSET) {
                    return ontransitionend;
                }
            }
        }
        return C.TIME_UNSET;
    }

    private int values(getExitDir getexitdir, skipTagForward skiptagforward, int i) throws IOException {
        long ah$a = getexitdir.ah$a();
        int min = (int) Math.min(this.invoke, ah$a);
        long j = ah$a - min;
        if (getexitdir.values() != j) {
            skiptagforward.ah$a = j;
            return 1;
        }
        this.HaptikSDK$b.valueOf(min);
        getexitdir.valueOf();
        getexitdir.ag$a(this.HaptikSDK$b.ah$a(), 0, min);
        this.ah$b = values(this.HaptikSDK$b, i);
        this.ag$a = true;
        return 0;
    }

    private long values(C$default$setContentDescription c$default$setContentDescription, int i) {
        int valueOf = c$default$setContentDescription.valueOf();
        int HaptikSDK$a = c$default$setContentDescription.HaptikSDK$a();
        for (int i2 = HaptikSDK$a - 188; i2 >= valueOf; i2--) {
            if (onTransitionEnd.ag$a(c$default$setContentDescription.ah$a(), valueOf, HaptikSDK$a, i2)) {
                long ontransitionend = onTransitionEnd.toString(c$default$setContentDescription, i2, i);
                if (ontransitionend != C.TIME_UNSET) {
                    return ontransitionend;
                }
            }
        }
        return C.TIME_UNSET;
    }
}
