package o;
/* loaded from: classes4.dex */
public final class setInputMethod {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setInputMethod) && runAnimators.values((Object) this.ag$a, (Object) ((setInputMethod) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Thumbnail_Type_String_(value=" + this.ag$a + ')';
    }

    public setInputMethod(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String values() {
        return this.ag$a;
    }
}
