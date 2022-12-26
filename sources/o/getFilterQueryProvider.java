package o;

import java.util.HashMap;
import java.util.Map;
import o.SearchViewBindingAdapter;
/* loaded from: classes4.dex */
public final class getFilterQueryProvider implements getViewHorizontalDragRange {
    private final setPhoneNumber ag$a;
    private final SearchViewBindingAdapter.AnonymousClass2 values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getFilterQueryProvider) {
            getFilterQueryProvider getfilterqueryprovider = (getFilterQueryProvider) obj;
            return runAnimators.values(this.values, getfilterqueryprovider.values) && runAnimators.values(this.ag$a, getfilterqueryprovider.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "HOFFilterApplied(_search=" + this.values + ", _tourId=" + this.ag$a + ')';
    }

    public getFilterQueryProvider(SearchViewBindingAdapter.AnonymousClass2 anonymousClass2, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(anonymousClass2, "_search");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.values = anonymousClass2;
        this.ag$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFFilterApplied");
        hashMap.put("search", Boolean.valueOf(this.values.ag$a()));
        hashMap.put("tourId", Integer.valueOf(this.ag$a.values()));
        return hashMap;
    }
}
