package o;
/* loaded from: classes4.dex */
public final class updateRegistration {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof updateRegistration) && this.valueOf == ((updateRegistration) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Lineup_announced_Boolean(value=" + this.valueOf + ')';
    }

    public updateRegistration(boolean z) {
        this.valueOf = z;
    }

    public final boolean ah$a() {
        return this.valueOf;
    }
}
