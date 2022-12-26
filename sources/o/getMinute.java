package o;
/* loaded from: classes4.dex */
public final class getMinute {
    private final boolean valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getMinute) && this.valueOf == ((getMinute) obj).valueOf;
    }

    public int hashCode() {
        boolean z = this.valueOf;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "_Unread_notifications_Boolean(value=" + this.valueOf + ')';
    }

    public getMinute(boolean z) {
        this.valueOf = z;
    }

    public final boolean ag$a() {
        return this.valueOf;
    }
}
