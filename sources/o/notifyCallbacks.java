package o;
/* loaded from: classes4.dex */
public final class notifyCallbacks {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof notifyCallbacks) && runAnimators.values((Object) this.values, (Object) ((notifyCallbacks) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Attribution_Metadata_String_(value=" + this.values + ')';
    }

    public notifyCallbacks(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ah$a() {
        return this.values;
    }
}
