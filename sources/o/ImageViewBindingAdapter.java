package o;
/* loaded from: classes4.dex */
public final class ImageViewBindingAdapter {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewBindingAdapter) && runAnimators.values((Object) this.valueOf, (Object) ((ImageViewBindingAdapter) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Prize_Amount_String_(value=" + this.valueOf + ')';
    }

    public ImageViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
