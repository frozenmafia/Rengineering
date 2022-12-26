package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class BaseObservable implements getViewHorizontalDragRange {
    private final CheckedTextViewBindingAdapter toString;
    private final BuildConfig valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BaseObservable) {
            BaseObservable baseObservable = (BaseObservable) obj;
            return runAnimators.values(this.toString, baseObservable.toString) && runAnimators.values(this.valueOf, baseObservable.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (this.toString.hashCode() * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "WalletLinkAccountInitiated(_placement=" + this.toString + ", _walletName=" + this.valueOf + ')';
    }

    public BaseObservable(CheckedTextViewBindingAdapter checkedTextViewBindingAdapter, BuildConfig buildConfig) {
        runAnimators.ag$a(checkedTextViewBindingAdapter, "_placement");
        runAnimators.ag$a(buildConfig, "_walletName");
        this.toString = checkedTextViewBindingAdapter;
        this.valueOf = buildConfig;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "WalletLinkAccountInitiated");
        hashMap.put("placement", this.toString.values());
        hashMap.put("walletName", this.valueOf.valueOf());
        return hashMap;
    }
}
