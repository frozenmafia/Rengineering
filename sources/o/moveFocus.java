package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class moveFocus implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter ag$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof moveFocus) && runAnimators.values(this.ag$a, ((moveFocus) obj).ag$a);
    }

    public int hashCode() {
        return this.ag$a.hashCode();
    }

    public String toString() {
        return "MobileNoHintPopupDismissed(_screenName=" + this.ag$a + ')';
    }

    public moveFocus(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.ag$a = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintPopupDismissed");
        hashMap.put("screenName", this.ag$a.ag$a());
        return hashMap;
    }
}
