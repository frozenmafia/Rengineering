package o;
/* loaded from: classes2.dex */
public final class getIntrinsicWidth {
    private final boolean ah$a;
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getIntrinsicWidth) {
            getIntrinsicWidth getintrinsicwidth = (getIntrinsicWidth) obj;
            return runAnimators.values((Object) this.values, (Object) getintrinsicwidth.values) && this.ah$a == getintrinsicwidth.ah$a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.values.hashCode();
        boolean z = this.ah$a;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        String str = this.values;
        boolean z = this.ah$a;
        return "EndOfOverDetailsVM(info=" + str + ", showDivider=" + z + ")";
    }

    public getIntrinsicWidth(String str, boolean z) {
        runAnimators.ag$a(str, "info");
        this.values = str;
        this.ah$a = z;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public final String valueOf() {
        return this.values;
    }
}
