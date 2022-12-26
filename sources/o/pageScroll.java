package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
import o.RatingBarBindingAdapter;
/* loaded from: classes4.dex */
public final class pageScroll implements getViewHorizontalDragRange {
    private final RatingBarBindingAdapter.AnonymousClass1 ah$a;
    private final getBuildSdkInt toString;
    private final setPhoneNumber valueOf;
    private final setOnSuggestListener values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pageScroll) {
            pageScroll pagescroll = (pageScroll) obj;
            return runAnimators.values(this.toString, pagescroll.toString) && runAnimators.values(this.ah$a, pagescroll.ah$a) && runAnimators.values(this.values, pagescroll.values) && runAnimators.values(this.valueOf, pagescroll.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.toString.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.values.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "ContestPageInitiated(_inviteCount=" + this.toString + ", _roundId=" + this.ah$a + ", _roundStatus=" + this.values + ", _tourId=" + this.valueOf + ')';
    }

    public pageScroll(getBuildSdkInt getbuildsdkint, RatingBarBindingAdapter.AnonymousClass1 anonymousClass1, setOnSuggestListener setonsuggestlistener, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(getbuildsdkint, "_inviteCount");
        runAnimators.ag$a(anonymousClass1, "_roundId");
        runAnimators.ag$a(setonsuggestlistener, "_roundStatus");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.toString = getbuildsdkint;
        this.ah$a = anonymousClass1;
        this.values = setonsuggestlistener;
        this.valueOf = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContestPageInitiated");
        hashMap.put("inviteCount", Integer.valueOf(this.toString.values()));
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Long.valueOf(this.ah$a.ah$a()));
        hashMap.put("roundStatus", this.values.values());
        hashMap.put("tourId", Integer.valueOf(this.valueOf.values()));
        return hashMap;
    }
}
