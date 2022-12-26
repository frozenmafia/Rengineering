package o;
/* loaded from: classes4.dex */
public final class haveContentsChanged {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof haveContentsChanged) && runAnimators.values((Object) this.ah$a, (Object) ((haveContentsChanged) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Status_String(value=" + this.ah$a + ')';
    }

    public haveContentsChanged(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
