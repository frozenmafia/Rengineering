package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class swapCursor implements getViewHorizontalDragRange {
    private final setPhoneNumber ah$a;
    private final onRatingChanged valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof swapCursor) {
            swapCursor swapcursor = (swapCursor) obj;
            return runAnimators.values(this.valueOf, swapcursor.valueOf) && runAnimators.values(this.ah$a, swapcursor.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "HOFMatchSelected(_roundId=" + this.valueOf + ", _tourId=" + this.ah$a + ')';
    }

    public swapCursor(onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.valueOf = onratingchanged;
        this.ah$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFMatchSelected");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.valueOf.values()));
        hashMap.put("tourId", Integer.valueOf(this.ah$a.values()));
        return hashMap;
    }
}
