package o;
/* loaded from: classes4.dex */
public final class removeRemovedCallbacks {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof removeRemovedCallbacks) && runAnimators.values((Object) this.ah$a, (Object) ((removeRemovedCallbacks) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Bank_Verified_String_(value=" + this.ah$a + ')';
    }

    public removeRemovedCallbacks(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
