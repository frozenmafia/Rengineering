package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class getKeyboardFocusedVirtualViewId implements getViewHorizontalDragRange {
    private final setCurrentTab ag$a;
    private final onRatingChanged ah$a;
    private final setImeActionLabel toString;
    private final setPhoneNumber valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getKeyboardFocusedVirtualViewId) {
            getKeyboardFocusedVirtualViewId getkeyboardfocusedvirtualviewid = (getKeyboardFocusedVirtualViewId) obj;
            return runAnimators.values(this.ah$a, getkeyboardfocusedvirtualviewid.ah$a) && runAnimators.values(this.ag$a, getkeyboardfocusedvirtualviewid.ag$a) && runAnimators.values(this.toString, getkeyboardfocusedvirtualviewid.toString) && runAnimators.values(this.valueOf, getkeyboardfocusedvirtualviewid.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ah$a.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "MyTeamsEditTeamTapped(_roundId=" + this.ah$a + ", _sportId=" + this.ag$a + ", _teamId=" + this.toString + ", _tourId=" + this.valueOf + ')';
    }

    public getKeyboardFocusedVirtualViewId(onRatingChanged onratingchanged, setCurrentTab setcurrenttab, setImeActionLabel setimeactionlabel, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setcurrenttab, "_sportId");
        runAnimators.ag$a(setimeactionlabel, "_teamId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = onratingchanged;
        this.ag$a = setcurrenttab;
        this.toString = setimeactionlabel;
        this.valueOf = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "MyTeamsEditTeamTapped");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.ah$a.values()));
        hashMap.put("sportId", Integer.valueOf(this.ag$a.ag$a()));
        hashMap.put("teamId", Integer.valueOf(this.toString.valueOf()));
        hashMap.put("tourId", Integer.valueOf(this.valueOf.values()));
        return hashMap;
    }
}
