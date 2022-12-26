package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class guessPreviouslyFocusedRect implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof guessPreviouslyFocusedRect) && runAnimators.values(this.values, ((guessPreviouslyFocusedRect) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "MobileNoHintNotAvailable(_screenName=" + this.values + ')';
    }

    public guessPreviouslyFocusedRect(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.values = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintNotAvailable");
        hashMap.put("screenName", this.values.ag$a());
        return hashMap;
    }
}
