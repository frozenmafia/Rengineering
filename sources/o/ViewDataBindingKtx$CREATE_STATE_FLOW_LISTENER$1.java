package o;
/* loaded from: classes4.dex */
public final class ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1 {
    private final String valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1) && runAnimators.values((Object) this.valueOf, (Object) ((ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "_Network_label_String(value=" + this.valueOf + ')';
    }

    public ViewDataBindingKtx$CREATE_STATE_FLOW_LISTENER$1(String str) {
        runAnimators.ag$a(str, "value");
        this.valueOf = str;
    }

    public final String ah$a() {
        return this.valueOf;
    }
}
