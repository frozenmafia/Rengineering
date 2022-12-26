package o;
/* loaded from: classes4.dex */
public final class ObservableField {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ObservableField) && runAnimators.values((Object) this.valueOf, (Object) ((ObservableField) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Description_Text_String_(value=" + this.valueOf + ')';
    }

    public ObservableField(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String valueOf() {
        return this.valueOf;
    }
}
