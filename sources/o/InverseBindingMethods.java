package o;
/* loaded from: classes4.dex */
public final class InverseBindingMethods {
    private final String ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InverseBindingMethods) && runAnimators.values((Object) this.ah$a, (Object) ((InverseBindingMethods) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "_Connection_Status_String_(value=" + this.ah$a + ')';
    }

    public InverseBindingMethods(String str) {
        runAnimators.ag$a(str, "value");
        this.ah$a = str;
    }

    public final String ag$a() {
        return this.ah$a;
    }
}
