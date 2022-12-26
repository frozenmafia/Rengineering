package o;
/* loaded from: classes4.dex */
public final class DataBinderMapper {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataBinderMapper) && runAnimators.values((Object) this.valueOf, (Object) ((DataBinderMapper) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Button_Type_String_(value=" + this.valueOf + ')';
    }

    public DataBinderMapper(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
