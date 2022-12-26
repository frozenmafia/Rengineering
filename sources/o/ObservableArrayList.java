package o;
/* loaded from: classes4.dex */
public final class ObservableArrayList {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableArrayList) && this.ah$a == ((ObservableArrayList) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "_Count_Upi_Int_(value=" + this.ah$a + ')';
    }

    public ObservableArrayList(int i) {
        this.ah$a = i;
    }

    public final int ag$a() {
        return this.ah$a;
    }
}
