package o;
/* loaded from: classes4.dex */
public final class VideoViewBindingAdapter {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VideoViewBindingAdapter) && runAnimators.values((Object) this.values, (Object) ((VideoViewBindingAdapter) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Upi3_Verified_String_(value=" + this.values + ')';
    }

    public VideoViewBindingAdapter(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
