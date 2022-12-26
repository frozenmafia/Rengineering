package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class onAbsorb implements getViewHorizontalDragRange {
    private final setPhoneNumber ag$a;
    private final onRatingChanged ah$a;
    private final setImeActionLabel values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof onAbsorb) {
            onAbsorb onabsorb = (onAbsorb) obj;
            return runAnimators.values(this.ah$a, onabsorb.ah$a) && runAnimators.values(this.values, onabsorb.values) && runAnimators.values(this.ag$a, onabsorb.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ah$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "AnnouncedLineupsIconClicked(_roundId=" + this.ah$a + ", _teamId=" + this.values + ", _tourId=" + this.ag$a + ')';
    }

    public onAbsorb(onRatingChanged onratingchanged, setImeActionLabel setimeactionlabel, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setimeactionlabel, "_teamId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = onratingchanged;
        this.values = setimeactionlabel;
        this.ag$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "AnnouncedLineupsIconClicked");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.ah$a.values()));
        hashMap.put("teamId", Integer.valueOf(this.values.valueOf()));
        hashMap.put("tourId", Integer.valueOf(this.ag$a.values()));
        return hashMap;
    }
}
