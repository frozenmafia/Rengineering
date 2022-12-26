package o;
/* loaded from: classes4.dex */
public final class onNotifyCallback {
    private final int values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof onNotifyCallback) && this.values == ((onNotifyCallback) obj).values;
    }

    public int hashCode() {
        return this.values;
    }

    public String toString() {
        return "_Card_Count_Int_(value=" + this.values + ')';
    }

    public onNotifyCallback(int i) {
        this.values = i;
    }

    public final int ag$a() {
        return this.values;
    }
}
