package o;
/* loaded from: classes4.dex */
public final class parseTagInt {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof parseTagInt) && this.values == ((parseTagInt) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Dynamic_Boolean_(value=" + this.values + ')';
    }

    public parseTagInt(boolean z) {
        this.values = z;
    }

    public final boolean ag$a() {
        return this.values;
    }
}
