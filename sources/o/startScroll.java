package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewGroupBindingAdapter;
/* loaded from: classes4.dex */
public final class startScroll implements getViewHorizontalDragRange {
    private final ViewGroupBindingAdapter.AnonymousClass1 ah$a;
    private final onMapChanged values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof startScroll) {
            startScroll startscroll = (startScroll) obj;
            return runAnimators.values(this.values, startscroll.values) && runAnimators.values(this.ah$a, startscroll.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "EmailOTPRequested(_errormessage=" + this.values + ", _verificationmethod=" + this.ah$a + ')';
    }

    public startScroll(onMapChanged onmapchanged, ViewGroupBindingAdapter.AnonymousClass1 anonymousClass1) {
        runAnimators.ag$a(onmapchanged, "_errormessage");
        runAnimators.ag$a(anonymousClass1, "_verificationmethod");
        this.values = onmapchanged;
        this.ah$a = anonymousClass1;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "EmailOTPRequested");
        hashMap.put("errormessage", this.values.ah$a());
        hashMap.put("verificationmethod", this.ah$a.values());
        return hashMap;
    }
}
