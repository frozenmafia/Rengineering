package o;
/* loaded from: classes4.dex */
public final class setPhoneNumber {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setPhoneNumber) && this.valueOf == ((setPhoneNumber) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Tour_Id_Int_(value=" + this.valueOf + ')';
    }

    public setPhoneNumber(int i) {
        this.valueOf = i;
    }

    public final int values() {
        return this.valueOf;
    }
}
