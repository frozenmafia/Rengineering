package o;
/* loaded from: classes4.dex */
public final class onValueChange {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onValueChange) && this.valueOf == ((onValueChange) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Recommended_Template_Id_Int__(value=" + this.valueOf + ')';
    }

    public onValueChange(int i) {
        this.valueOf = i;
    }

    public final int values() {
        return this.valueOf;
    }
}
