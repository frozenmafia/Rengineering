package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class requestKeyboardFocusForVirtualView implements getViewHorizontalDragRange {
    private final setDrawableBottom ah$a;
    private final ViewGroupBindingAdapter.AnonymousClass2 valueOf;
    private final onItemRangeInserted values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof requestKeyboardFocusForVirtualView) {
            requestKeyboardFocusForVirtualView requestkeyboardfocusforvirtualview = (requestKeyboardFocusForVirtualView) obj;
            return runAnimators.values(this.values, requestkeyboardfocusforvirtualview.values) && runAnimators.values(this.ah$a, requestkeyboardfocusforvirtualview.ah$a) && runAnimators.values(this.valueOf, requestkeyboardfocusforvirtualview.valueOf);
        }
        return false;
    }

    public int hashCode() {
        onItemRangeInserted onitemrangeinserted = this.values;
        int hashCode = onitemrangeinserted == null ? 0 : onitemrangeinserted.hashCode();
        int hashCode2 = this.ah$a.hashCode();
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.valueOf;
        return (((hashCode * 31) + hashCode2) * 31) + (anonymousClass2 != null ? anonymousClass2.hashCode() : 0);
    }

    public String toString() {
        return "PasswordChangeSubmitted(_errorMessage=" + this.values + ", _successFlag=" + this.ah$a + ", _variant=" + this.valueOf + ')';
    }

    public requestKeyboardFocusForVirtualView(onItemRangeInserted onitemrangeinserted, setDrawableBottom setdrawablebottom, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        runAnimators.ag$a(setdrawablebottom, "_successFlag");
        this.values = onitemrangeinserted;
        this.ah$a = setdrawablebottom;
        this.valueOf = anonymousClass2;
    }

    public /* synthetic */ requestKeyboardFocusForVirtualView(onItemRangeInserted onitemrangeinserted, setDrawableBottom setdrawablebottom, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : onitemrangeinserted, setdrawablebottom, (i & 4) != 0 ? null : anonymousClass2);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PasswordChangeSubmitted");
        onItemRangeInserted onitemrangeinserted = this.values;
        if (onitemrangeinserted != null) {
            hashMap.put("errorMessage", onitemrangeinserted.values());
        }
        hashMap.put("successFlag", Boolean.valueOf(this.ah$a.valueOf()));
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.valueOf;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
