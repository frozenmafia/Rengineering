package o;
/* loaded from: classes4.dex */
public final class notifyMoved {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyMoved) && this.ah$a == ((notifyMoved) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "_Contest_Join_Count_Int__(value=" + this.ah$a + ')';
    }

    public notifyMoved(int i) {
        this.ah$a = i;
    }

    public final int ag$a() {
        return this.ah$a;
    }
}
