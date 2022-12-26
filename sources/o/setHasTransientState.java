package o;
/* loaded from: classes3.dex */
public final class setHasTransientState {
    private final int ah$a;
    private final boolean valueOf;
    private final boolean values;

    public setHasTransientState(int i, boolean z, boolean z2) {
        this.ah$a = i;
        this.valueOf = z;
        this.values = z2;
    }

    public final int valueOf() {
        return this.ah$a;
    }

    public final boolean ag$a() {
        return this.valueOf;
    }

    public final boolean ah$a() {
        return this.values;
    }

    public String toString() {
        return "LastRunInfo(consecutiveLaunchCrashes=" + this.ah$a + ", crashed=" + this.valueOf + ", crashedDuringLaunch=" + this.values + ')';
    }
}
