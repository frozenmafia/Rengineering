package o;
/* loaded from: classes.dex */
public final class dismiss {
    private final String ah$a;
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dismiss) {
            dismiss dismissVar = (dismiss) obj;
            return runAnimators.values((Object) this.ah$a, (Object) dismissVar.ah$a) && this.toString == dismissVar.toString;
        }
        return false;
    }

    public int hashCode() {
        return (this.ah$a.hashCode() * 31) + this.toString;
    }

    public String toString() {
        String str = this.ah$a;
        int i = this.toString;
        return "SingleHeaderItem(headerLabel=" + str + ", widthInDp=" + i + ")";
    }

    public dismiss(String str, int i) {
        runAnimators.ag$a(str, "headerLabel");
        this.ah$a = str;
        this.toString = i;
    }

    public final int ah$a() {
        return this.toString;
    }

    public final String values() {
        return this.ah$a;
    }
}
