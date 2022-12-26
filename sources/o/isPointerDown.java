package o;

import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class isPointerDown implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged ag$a;
    private final ViewGroupBindingAdapter.AnonymousClass2 ah$a;
    private final onItemRangeInserted toString;
    private final setRequiresFadingEdge valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isPointerDown) {
            isPointerDown ispointerdown = (isPointerDown) obj;
            return runAnimators.values(this.toString, ispointerdown.toString) && runAnimators.values(this.ag$a, ispointerdown.ag$a) && runAnimators.values(this.valueOf, ispointerdown.valueOf) && runAnimators.values(this.ah$a, ispointerdown.ah$a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.toString.hashCode();
        int hashCode2 = this.ag$a.hashCode();
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        int hashCode3 = setrequiresfadingedge == null ? 0 : setrequiresfadingedge.hashCode();
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ah$a;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (anonymousClass2 != null ? anonymousClass2.hashCode() : 0);
    }

    public String toString() {
        return "SocialLoginError(_errorMessage=" + this.toString + ", _selection=" + this.ag$a + ", _utm_redirection=" + this.valueOf + ", _variant=" + this.ah$a + ')';
    }

    public isPointerDown(onItemRangeInserted onitemrangeinserted, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setRequiresFadingEdge setrequiresfadingedge, ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2) {
        runAnimators.ag$a(onitemrangeinserted, "_errorMessage");
        runAnimators.ag$a(onProgressChanged, "_selection");
        this.toString = onitemrangeinserted;
        this.ag$a = onProgressChanged;
        this.valueOf = setrequiresfadingedge;
        this.ah$a = anonymousClass2;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SocialLoginError");
        hashMap.put("errorMessage", this.toString.values());
        hashMap.put("selection", this.ag$a.ag$a());
        setRequiresFadingEdge setrequiresfadingedge = this.valueOf;
        if (setrequiresfadingedge != null) {
            hashMap.put("utm_redirection", setrequiresfadingedge.ah$a());
        }
        ViewGroupBindingAdapter.AnonymousClass2 anonymousClass2 = this.ah$a;
        if (anonymousClass2 != null) {
            hashMap.put(com.facebook.hermes.intl.Constants.SENSITIVITY_VARIANT, anonymousClass2.ah$a());
        }
        return hashMap;
    }
}
