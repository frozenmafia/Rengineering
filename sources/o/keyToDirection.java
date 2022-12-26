package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class keyToDirection implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof keyToDirection) && runAnimators.values(this.toString, ((keyToDirection) obj).toString);
    }

    public int hashCode() {
        return this.toString.hashCode();
    }

    public String toString() {
        return "MobileNoHintPopupShowRequested(_screenName=" + this.toString + ')';
    }

    public keyToDirection(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.toString = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintPopupShowRequested");
        hashMap.put("screenName", this.toString.ag$a());
        return hashMap;
    }
}
