package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class dispatchViewReleased implements getViewHorizontalDragRange {
    private final ViewGroupBindingAdapter.AnonymousClass2 ag$a;
    private final onItemRangeInserted valueOf;
    private final setRequiresFadingEdge values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dispatchViewReleased) {
            dispatchViewReleased dispatchviewreleased = (dispatchViewReleased) obj;
            return runAnimators.values(this.valueOf, dispatchviewreleased.valueOf) && runAnimators.values(this.values, dispatchviewreleased.values) && runAnimators.values(this.ag$a, dispatchviewreleased.ag$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.values;
        int hashCode2 = setrequiresfadingedge == null ? 0 : setrequiresfadingedge.hashCode();
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ag$a;
        return (((hashCode * 31) + hashCode2) * 31) + (anonymousClass2 != null ? anonymousClass2.hashCode() : 0);
    }

    public String toString() {
        return "RegistrationError(_errorMessage=" + this.valueOf + ", _utm_redirection=" + this.values + ", _variant=" + this.ag$a + ')';
    }

    public dispatchViewReleased(onItemRangeInserted onitemrangeinserted, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        this.valueOf = onitemrangeinserted;
        this.values = setrequiresfadingedge;
        this.ag$a = anonymousClass2;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "RegistrationError");
        hashMap.put("errorMessage", this.valueOf.values());
        setRequiresFadingEdge setrequiresfadingedge = this.values;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ag$a;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
