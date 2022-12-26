package o;
/* loaded from: classes4.dex */
public final class onStartTrackingTouch {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onStartTrackingTouch) && this.values == ((onStartTrackingTouch) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Section_Position_Int_(value=" + this.values + ')';
    }

    public onStartTrackingTouch(int i) {
        this.values = i;
    }

    public final int values() {
        return this.values;
    }
}
