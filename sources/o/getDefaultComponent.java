package o;
/* loaded from: classes4.dex */
public final class getDefaultComponent {
    private final int toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getDefaultComponent) && this.toString == ((getDefaultComponent) obj).toString;
    }

    public int hashCode() {
        return this.toString;
    }

    public String toString() {
        return "_Competitor_Team_Id_Int__(value=" + this.toString + ')';
    }

    public getDefaultComponent(int i) {
        this.toString = i;
    }

    public final int ah$a() {
        return this.toString;
    }
}
