package o;
/* loaded from: classes4.dex */
public final class WeakListener {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WeakListener) && runAnimators.values((Object) this.values, (Object) ((WeakListener) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Notification_type_String(value=" + this.values + ')';
    }

    public WeakListener(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String ag$a() {
        return this.values;
    }
}
