package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class tryCaptureView implements getViewHorizontalDragRange {
    private final onItemRangeInserted ag$a;
    private final CheckedTextViewBindingAdapter ah$a;
    private final BuildConfig values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tryCaptureView) {
            tryCaptureView trycaptureview = (tryCaptureView) obj;
            return runAnimators.values(this.ag$a, trycaptureview.ag$a) && runAnimators.values(this.ah$a, trycaptureview.ah$a) && runAnimators.values(this.values, trycaptureview.values);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ag$a.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode();
    }

    public String toString() {
        return "WalletLinkedError(_errorMessage=" + this.ag$a + ", _placement=" + this.ah$a + ", _walletName=" + this.values + ')';
    }

    public tryCaptureView(onItemRangeInserted onitemrangeinserted, CheckedTextViewBindingAdapter checkedTextViewBindingAdapter, BuildConfig buildConfig) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(checkedTextViewBindingAdapter, "_placement");
        runAnimators.ag$a(buildConfig, "_walletName");
        this.ag$a = onitemrangeinserted;
        this.ah$a = checkedTextViewBindingAdapter;
        this.values = buildConfig;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "WalletLinkedError");
        hashMap.put("errorMessage", this.ag$a.values());
        hashMap.put("placement", this.ah$a.values());
        hashMap.put("walletName", this.values.valueOf());
        return hashMap;
    }
}
