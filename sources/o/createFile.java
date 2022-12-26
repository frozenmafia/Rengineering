package o;
/* loaded from: classes4.dex */
public final class createFile {
    private final boolean ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof createFile) && this.ah$a == ((createFile) obj).ah$a;
    }

    public int hashCode() {
        boolean z = this.ah$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "__Contest_Queue_Flow_Boolean__(value=" + this.ah$a + ')';
    }

    public createFile(boolean z) {
        this.ah$a = z;
    }

    public final boolean valueOf() {
        return this.ah$a;
    }
}
