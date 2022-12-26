package o;
/* loaded from: classes4.dex */
public final class ObservableArrayMap {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableArrayMap) && runAnimators.values((Object) this.valueOf, (Object) ((ObservableArrayMap) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Creation_Flow_String_(value=" + this.valueOf + ')';
    }

    public ObservableArrayMap(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
