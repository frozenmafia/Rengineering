package o;
/* loaded from: classes4.dex */
public final class setDefaultComponent {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setDefaultComponent) && runAnimators.values((Object) this.ag$a, (Object) ((setDefaultComponent) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Click_Type_String_(value=" + this.ag$a + ')';
    }

    public setDefaultComponent(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ag$a() {
        return this.ag$a;
    }
}
