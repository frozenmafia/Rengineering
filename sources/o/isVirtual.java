package o;
/* loaded from: classes4.dex */
public final class isVirtual {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isVirtual) && this.valueOf == ((isVirtual) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "__Index_Int(value=" + this.valueOf + ')';
    }

    public isVirtual(int i) {
        this.valueOf = i;
    }

    public final int values() {
        return this.valueOf;
    }
}
