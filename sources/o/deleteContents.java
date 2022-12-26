package o;
/* loaded from: classes4.dex */
public final class deleteContents {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof deleteContents) && runAnimators.values((Object) this.ah$a, (Object) ((deleteContents) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "__Section_Contest_Id_String__(value=" + this.ah$a + ')';
    }

    public deleteContents(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
