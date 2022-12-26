package o;
/* loaded from: classes4.dex */
public final class CardViewBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CardViewBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((CardViewBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Payment_Type_String_(value=" + this.ag$a + ')';
    }

    public CardViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String valueOf() {
        return this.ag$a;
    }
}
