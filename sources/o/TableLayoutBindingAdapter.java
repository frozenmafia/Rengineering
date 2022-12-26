package o;
/* loaded from: classes4.dex */
public final class TableLayoutBindingAdapter {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TableLayoutBindingAdapter) && runAnimators.values((Object) this.ag$a, (Object) ((TableLayoutBindingAdapter) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Sports_Name_String_(value=" + this.ag$a + ')';
    }

    public TableLayoutBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ah$a() {
        return this.ag$a;
    }
}
