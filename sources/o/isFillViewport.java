package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class isFillViewport implements getViewHorizontalDragRange {
    private final setOnSuggestListener ag$a;
    private final onRatingChanged ah$a;
    private final setDrawableEnd toString;
    private final setPhoneNumber valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof isFillViewport) {
            isFillViewport isfillviewport = (isFillViewport) obj;
            return runAnimators.values(this.ah$a, isfillviewport.ah$a) && runAnimators.values(this.ag$a, isfillviewport.ag$a) && runAnimators.values(this.toString, isfillviewport.toString) && runAnimators.values(this.valueOf, isfillviewport.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ah$a.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "ContestHomeTabViewed(_roundId=" + this.ah$a + ", _roundStatus=" + this.ag$a + ", _tabSelected=" + this.toString + ", _tourId=" + this.valueOf + ')';
    }

    public isFillViewport(onRatingChanged onratingchanged, setOnSuggestListener setonsuggestlistener, setDrawableEnd setdrawableend, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setonsuggestlistener, "_roundStatus");
        runAnimators.ag$a(setdrawableend, "_tabSelected");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = onratingchanged;
        this.ag$a = setonsuggestlistener;
        this.toString = setdrawableend;
        this.valueOf = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContestHomeTabViewed");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.ah$a.values()));
        hashMap.put("roundStatus", this.ag$a.values());
        hashMap.put("tabSelected", this.toString.ag$a());
        hashMap.put("tourId", Integer.valueOf(this.valueOf.values()));
        return hashMap;
    }
}
