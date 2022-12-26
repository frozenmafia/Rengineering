package o;
/* loaded from: classes4.dex */
public final class updateStateFlowRegistration {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof updateStateFlowRegistration) && this.ag$a == ((updateStateFlowRegistration) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Mobile_Number_Entered_Boolean__(value=" + this.ag$a + ')';
    }

    public updateStateFlowRegistration(boolean z) {
        this.ag$a = z;
    }

    public final boolean ag$a() {
        return this.ag$a;
    }
}
