package o;

import java.util.HashMap;
import java.util.Map;
import o.ViewDataBinding;
/* loaded from: classes4.dex */
public final class doOnTextChanged implements getViewHorizontalDragRange {
    private final ViewDataBinding.AnonymousClass2 ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doOnTextChanged) && runAnimators.values(this.ah$a, ((doOnTextChanged) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "FomoDrawerLoaded(_loadType=" + this.ah$a + ')';
    }

    public doOnTextChanged(ViewDataBinding.AnonymousClass2 anonymousClass2) {
        runAnimators.ag$a(anonymousClass2, "_loadType");
        this.ah$a = anonymousClass2;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FomoDrawerLoaded");
        hashMap.put("loadType", this.ah$a.values());
        return hashMap;
    }
}
