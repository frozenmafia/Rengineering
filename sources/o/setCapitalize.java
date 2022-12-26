package o;
/* loaded from: classes4.dex */
public final class setCapitalize {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setCapitalize) && this.ag$a == ((setCapitalize) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Successflag_Boolean(value=" + this.ag$a + ')';
    }

    public setCapitalize(boolean z) {
        this.ag$a = z;
    }

    public final boolean ah$a() {
        return this.ag$a;
    }
}
