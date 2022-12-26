package o;
/* loaded from: classes4.dex */
public final class isNumeric {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isNumeric) && this.ag$a == ((isNumeric) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Dm_Boolean_(value=" + this.ag$a + ')';
    }

    public isNumeric(boolean z) {
        this.ag$a = z;
    }

    public final boolean values() {
        return this.ag$a;
    }
}
