package o;
/* loaded from: classes4.dex */
public final class onRatingChanged {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onRatingChanged) && this.toString == ((onRatingChanged) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Round_Id_Int_(value=" + this.toString + ')';
    }

    public onRatingChanged(int i) {
        this.toString = i;
    }

    public final int values() {
        return this.toString;
    }
}
