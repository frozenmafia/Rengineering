package o;
/* loaded from: classes4.dex */
public final class removeOnListChangedCallback {
    private final boolean values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeOnListChangedCallback) && this.values == ((removeOnListChangedCallback) obj).values;
    }

    public int hashCode() {
        boolean z = this.values;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Coupon_Available_Boolean_(value=" + this.values + ')';
    }

    public removeOnListChangedCallback(boolean z) {
        this.values = z;
    }

    public final boolean values() {
        return this.values;
    }
}
