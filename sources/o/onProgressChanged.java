package o;
/* loaded from: classes4.dex */
public final class onProgressChanged {
    private final int valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onProgressChanged) && this.valueOf == ((onProgressChanged) obj).valueOf;
    }

    public int hashCode() {
        return this.valueOf;
    }

    public String toString() {
        return "_Section_Sequence_Number_Int__(value=" + this.valueOf + ')';
    }

    public onProgressChanged(int i) {
        this.valueOf = i;
    }

    public final int valueOf() {
        return this.valueOf;
    }
}
