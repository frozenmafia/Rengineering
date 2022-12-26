package o;
/* loaded from: classes4.dex */
public final class DataBindingUtil {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataBindingUtil) && runAnimators.values((Object) this.values, (Object) ((DataBindingUtil) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Channelurl_String(value=" + this.values + ')';
    }

    public DataBindingUtil(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String values() {
        return this.values;
    }
}
