package o;

import java.io.Serializable;
/* loaded from: classes.dex */
public final class setProcessListener {
    private final int toString;
    private final Serializable valueOf;
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setProcessListener) {
            setProcessListener setprocesslistener = (setProcessListener) obj;
            return this.toString == setprocesslistener.toString && runAnimators.values(this.valueOf, setprocesslistener.valueOf) && this.values == setprocesslistener.values;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = this.toString;
        int hashCode = this.valueOf.hashCode();
        boolean z = this.values;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return (((i * 31) + hashCode) * 31) + i2;
    }

    public String toString() {
        int i = this.toString;
        Serializable serializable = this.valueOf;
        boolean z = this.values;
        return "PaymentServiceInput(matchId=" + i + ", analyticsContextParams=" + serializable + ", devMode=" + z + ")";
    }

    public setProcessListener(int i, Serializable serializable, boolean z) {
        runAnimators.ag$a(serializable, "analyticsContextParams");
        this.toString = i;
        this.valueOf = serializable;
        this.values = z;
    }

    public /* synthetic */ setProcessListener(int i, Serializable serializable, boolean z, int i2, getTargetTypes gettargettypes) {
        this(i, serializable, (i2 & 4) != 0 ? false : z);
    }

    public final int ag$a() {
        return this.toString;
    }

    public final Serializable ah$a() {
        return this.valueOf;
    }

    public final boolean valueOf() {
        return this.values;
    }
}
