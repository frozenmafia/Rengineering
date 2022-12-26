package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class invalidateVirtualView implements getViewHorizontalDragRange {
    private final setPhoneNumber ah$a;
    private final setCurrentTab toString;
    private final onRatingChanged valueOf;
    private final setImeActionLabel values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof invalidateVirtualView) {
            invalidateVirtualView invalidatevirtualview = (invalidateVirtualView) obj;
            return runAnimators.values(this.valueOf, invalidatevirtualview.valueOf) && runAnimators.values(this.toString, invalidatevirtualview.toString) && runAnimators.values(this.values, invalidatevirtualview.values) && runAnimators.values(this.ah$a, invalidatevirtualview.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.valueOf.hashCode() * 31) + this.toString.hashCode()) * 31) + this.values.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "MyTeamsCloneTeamTapped(_roundId=" + this.valueOf + ", _sportId=" + this.toString + ", _teamId=" + this.values + ", _tourId=" + this.ah$a + ')';
    }

    public invalidateVirtualView(onRatingChanged onratingchanged, setCurrentTab setcurrenttab, setImeActionLabel setimeactionlabel, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setcurrenttab, "_sportId");
        runAnimators.ag$a(setimeactionlabel, "_teamId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.valueOf = onratingchanged;
        this.toString = setcurrenttab;
        this.values = setimeactionlabel;
        this.ah$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MyTeamsCloneTeamTapped");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.valueOf.values()));
        hashMap.put("sportId", Integer.valueOf(this.toString.ag$a()));
        hashMap.put("teamId", Integer.valueOf(this.values.valueOf()));
        hashMap.put("tourId", Integer.valueOf(this.ah$a.values()));
        return hashMap;
    }
}
