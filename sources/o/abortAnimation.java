package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class abortAnimation implements getViewHorizontalDragRange {
    private final SearchViewBindingAdapter toString;

    public abortAnimation() {
        this(null, 1, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof abortAnimation) && runAnimators.values(this.toString, ((abortAnimation) obj).toString);
    }

    public int hashCode() {
        SearchViewBindingAdapter searchViewBindingAdapter = this.toString;
        if (searchViewBindingAdapter == null) {
            return 0;
        }
        return searchViewBindingAdapter.hashCode();
    }

    public String toString() {
        return "DREducationSnackbar(_screenName=" + this.toString + ')';
    }

    public abortAnimation(SearchViewBindingAdapter searchViewBindingAdapter) {
        this.toString = searchViewBindingAdapter;
    }

    public /* synthetic */ abortAnimation(SearchViewBindingAdapter searchViewBindingAdapter, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : searchViewBindingAdapter);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "DREducationSnackbar");
        SearchViewBindingAdapter searchViewBindingAdapter = this.toString;
        if (searchViewBindingAdapter != null) {
            hashMap.put("screenName", searchViewBindingAdapter.ag$a());
        }
        return hashMap;
    }
}
