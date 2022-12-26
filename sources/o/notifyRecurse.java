package o;
/* loaded from: classes4.dex */
public final class notifyRecurse {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyRecurse) && runAnimators.values((Object) this.ag$a, (Object) ((notifyRecurse) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_App_Version_String_(value=" + this.ag$a + ')';
    }

    public notifyRecurse(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ag$a() {
        return this.ag$a;
    }
}
