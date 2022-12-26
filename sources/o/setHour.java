package o;
/* loaded from: classes4.dex */
public final class setHour {
    private final String ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setHour) && runAnimators.values((Object) this.ag$a, (Object) ((setHour) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "_Unread_notifications_String(value=" + this.ag$a + ')';
    }

    public setHour(String str) {
        runAnimators.ag$a(str, "value");
        this.ag$a = str;
    }

    public final String ag$a() {
        return this.ag$a;
    }
}
