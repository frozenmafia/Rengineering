package o;
/* loaded from: classes4.dex */
public final class Converters {
    private final String toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Converters) && runAnimators.values((Object) this.toString, (Object) ((Converters) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "_Player_Name_String_(value=" + this.toString + ')';
    }

    public Converters(String str) {
        runAnimators.ag$a(str, "value");
        this.toString = str;
    }

    public final String values() {
        return this.toString;
    }
}
