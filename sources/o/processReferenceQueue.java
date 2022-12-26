package o;
/* loaded from: classes4.dex */
public final class processReferenceQueue {
    private final boolean ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof processReferenceQueue) && this.ag$a == ((processReferenceQueue) obj).ag$a;
    }

    public int hashCode() {
        boolean z = this.ag$a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Is_Group_Contest_Flow_Boolean___(value=" + this.ag$a + ')';
    }

    public processReferenceQueue(boolean z) {
        this.ag$a = z;
    }

    public final boolean valueOf() {
        return this.ag$a;
    }
}
