package o;
/* loaded from: classes.dex */
public final class indexOfStateSet {
    private int ah$a;
    private Object toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof indexOfStateSet) {
            indexOfStateSet indexofstateset = (indexOfStateSet) obj;
            return this.ah$a == indexofstateset.ah$a && runAnimators.values(this.toString, indexofstateset.toString);
        }
        return false;
    }

    public int hashCode() {
        int i = this.ah$a;
        Object obj = this.toString;
        return (i * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        int i = this.ah$a;
        Object obj = this.toString;
        return "PresenterDataEvent(id=" + i + ", data=" + obj + ")";
    }

    public indexOfStateSet(int i, Object obj) {
        this.ah$a = i;
        this.toString = obj;
    }

    public final Object ag$a() {
        return this.toString;
    }

    public final int valueOf() {
        return this.ah$a;
    }
}
