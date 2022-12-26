package o;
/* loaded from: classes4.dex */
public final class notifyRemainder {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyRemainder) && runAnimators.values((Object) this.ag$a, (Object) ((notifyRemainder) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Behaviour_String(value=" + this.ag$a + ')';
    }

    public notifyRemainder(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
