package o;
/* loaded from: classes4.dex */
public final class setTextWatcher {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setTextWatcher) && runAnimators.values((Object) this.ah$a, (Object) ((setTextWatcher) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Transactionid_String(value=" + this.ah$a + ')';
    }

    public setTextWatcher(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String valueOf() {
        return this.ah$a;
    }
}
