package o;
/* loaded from: classes4.dex */
public final class unbind {
    private final String values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof unbind) && runAnimators.values((Object) this.values, (Object) ((unbind) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "_Leaderboard_String(value=" + this.values + ')';
    }

    public unbind(String str) {
        runAnimators.ag$a(str, "value");
        this.values = str;
    }

    public final String valueOf() {
        return this.values;
    }
}
