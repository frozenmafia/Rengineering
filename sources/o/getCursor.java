package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getCursor implements getViewHorizontalDragRange {
    private final onRatingChanged ag$a;
    private final setPhoneNumber ah$a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getCursor) {
            getCursor getcursor = (getCursor) obj;
            return runAnimators.values(this.ag$a, getcursor.ag$a) && runAnimators.values(this.ah$a, getcursor.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.ag$a.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "HOFDreamTeamClicked(_roundId=" + this.ag$a + ", _tourId=" + this.ah$a + ')';
    }

    public getCursor(onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ag$a = onratingchanged;
        this.ah$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFDreamTeamClicked");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.ag$a.values()));
        hashMap.put("tourId", Integer.valueOf(this.ah$a.values()));
        return hashMap;
    }
}
