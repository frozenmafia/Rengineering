package o;
/* loaded from: classes4.dex */
public final class TabWidgetBindingAdapter {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TabWidgetBindingAdapter) && runAnimators.values((Object) this.valueOf, (Object) ((TabWidgetBindingAdapter) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Sortlabel_String(value=" + this.valueOf + ')';
    }

    public TabWidgetBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
