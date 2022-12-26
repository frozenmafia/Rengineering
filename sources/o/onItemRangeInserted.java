package o;
/* loaded from: classes4.dex */
public final class onItemRangeInserted {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onItemRangeInserted) && runAnimators.values((Object) this.ah$a, (Object) ((onItemRangeInserted) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Error_Message_String_(value=" + this.ah$a + ')';
    }

    public onItemRangeInserted(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }
}
