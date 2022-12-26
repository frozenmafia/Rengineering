package o;
/* loaded from: classes4.dex */
public final class parseColumns {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof parseColumns) && runAnimators.values((Object) this.ag$a, (Object) ((parseColumns) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Starplayer_In_Teams_String__(value=" + this.ag$a + ')';
    }

    public parseColumns(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
