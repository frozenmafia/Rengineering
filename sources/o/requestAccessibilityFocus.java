package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class requestAccessibilityFocus implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof requestAccessibilityFocus) && runAnimators.values(this.valueOf, ((requestAccessibilityFocus) obj).valueOf);
    }

    public int hashCode() {
        return this.valueOf.hashCode();
    }

    public String toString() {
        return "MobileNoHintPopupResultError(_screenName=" + this.valueOf + ')';
    }

    public requestAccessibilityFocus(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.valueOf = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintPopupResultError");
        hashMap.put("screenName", this.valueOf.ag$a());
        return hashMap;
    }
}
