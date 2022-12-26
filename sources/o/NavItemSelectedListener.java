package o;
/* loaded from: classes.dex */
public class NavItemSelectedListener {
    private values ag$a;
    private resolveMethod toString;
    private resolveMethod valueOf;

    /* loaded from: classes.dex */
    public interface values {
        void values(boolean z, int i);
    }

    public final values HaptikSDK$b() {
        return this.ag$a;
    }

    public final void valueOf(values valuesVar) {
        this.ag$a = valuesVar;
    }

    public final resolveMethod HaptikSDK$c() {
        return this.toString;
    }

    public final void toString(resolveMethod resolvemethod) {
        this.toString = resolvemethod;
    }

    public final resolveMethod ag$a() {
        return this.valueOf;
    }

    public final void valueOf(resolveMethod resolvemethod) {
        this.valueOf = resolvemethod;
    }
}
