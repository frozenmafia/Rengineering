package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class performActionForHost implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof performActionForHost) && runAnimators.values(this.values, ((performActionForHost) obj).values);
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        return "MobileNoHintSelected(_screenName=" + this.values + ')';
    }

    public performActionForHost(SearchViewBindingAdapter searchViewBindingAdapter) {
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        this.values = searchViewBindingAdapter;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MobileNoHintSelected");
        hashMap.put("screenName", this.values.ag$a());
        return hashMap;
    }
}
