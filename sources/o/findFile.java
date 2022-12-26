package o;
/* loaded from: classes4.dex */
public final class findFile {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof findFile) && runAnimators.values((Object) this.ah$a, (Object) ((findFile) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "__Contestcreationsource_String(value=" + this.ah$a + ')';
    }

    public findFile(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }
}
