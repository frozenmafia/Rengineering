package o;
/* loaded from: classes4.dex */
public final class ListenerUtil {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListenerUtil) && runAnimators.values((Object) this.values, (Object) ((ListenerUtil) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Promotion_Text_String_(value=" + this.values + ')';
    }

    public final String values() {
        return this.values;
    }
}
