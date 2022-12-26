package o;
/* loaded from: classes4.dex */
public final class getFanCodeRecylerView {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getFanCodeRecylerView) && runAnimators.values((Object) this.ah$a, (Object) ((getFanCodeRecylerView) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_City_Name_String_(value=" + this.ah$a + ')';
    }

    public getFanCodeRecylerView(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ah$a() {
        return this.ah$a;
    }
}
