package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class performActionForChild implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof performActionForChild) && runAnimators.values(this.ah$a, ((performActionForChild) obj).ah$a);
    }

    public int hashCode() {
        return this.ah$a.hashCode();
    }

    public String toString() {
        return "MobileNoHintPopupLaunchError(_screenName=" + this.ah$a + ')';
    }

    public performActionForChild(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.ah$a = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintPopupLaunchError");
        hashMap.put("screenName", this.ah$a.ag$a());
        return hashMap;
    }
}
