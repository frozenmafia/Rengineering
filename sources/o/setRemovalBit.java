package o;
/* loaded from: classes4.dex */
public final class setRemovalBit {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setRemovalBit) && runAnimators.values((Object) this.ag$a, (Object) ((setRemovalBit) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Banner_Id_String_(value=" + this.ag$a + ')';
    }

    public setRemovalBit(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ah$a() {
        return this.ag$a;
    }
}
