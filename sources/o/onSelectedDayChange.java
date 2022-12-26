package o;
/* loaded from: classes4.dex */
public final class onSelectedDayChange {
    private final boolean toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onSelectedDayChange) && this.toString == ((onSelectedDayChange) obj).toString;
    }

    public int hashCode() {
        boolean z = this.toString;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Phonebook_sync_status_Boolean(value=" + this.toString + ')';
    }

    public onSelectedDayChange(boolean z) {
        this.toString = z;
    }

    public final boolean ah$a() {
        return this.toString;
    }
}
