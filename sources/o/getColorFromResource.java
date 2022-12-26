package o;
/* loaded from: classes4.dex */
public final class getColorFromResource {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getColorFromResource) && runAnimators.values((Object) this.ag$a, (Object) ((getColorFromResource) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Invite_Code_String_(value=" + this.ag$a + ')';
    }

    public getColorFromResource(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String values() {
        return this.ag$a;
    }
}
