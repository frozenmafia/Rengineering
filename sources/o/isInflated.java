package o;
/* loaded from: classes4.dex */
public final class isInflated {
    private final int ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isInflated) && this.ah$a == ((isInflated) obj).ah$a;
    }

    public int hashCode() {
        return this.ah$a;
    }

    public String toString() {
        return "_No_Of_Contacts_Int__(value=" + this.ah$a + ')';
    }

    public isInflated(int i) {
        this.ah$a = i;
    }

    public final int ag$a() {
        return this.ah$a;
    }
}
