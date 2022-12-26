package o;
/* loaded from: classes4.dex */
public final class getCurrentTab {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getCurrentTab) && runAnimators.values((Object) this.valueOf, (Object) ((getCurrentTab) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Sort_Order_String_(value=" + this.valueOf + ')';
    }

    public getCurrentTab(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String values() {
        return this.valueOf;
    }
}
