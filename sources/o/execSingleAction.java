package o;
/* loaded from: classes4.dex */
public final class execSingleAction {
    private final String toString;
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof execSingleAction) {
            execSingleAction execsingleaction = (execSingleAction) obj;
            return runAnimators.values((Object) this.toString, (Object) execsingleaction.toString) && this.valueOf == execsingleaction.valueOf;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.toString.hashCode();
        boolean z = this.valueOf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        return "GateKeeper(name=" + this.toString + ", value=" + this.valueOf + ')';
    }

    public execSingleAction(String str, boolean z) {
        runAnimators.ag$a(str, "name");
        this.toString = str;
        this.valueOf = z;
    }

    public final String valueOf() {
        return this.toString;
    }

    public final boolean values() {
        return this.valueOf;
    }
}
