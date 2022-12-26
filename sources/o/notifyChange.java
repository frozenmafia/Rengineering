package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class notifyChange implements getViewHorizontalDragRange {
    private final setPhoneNumber ag$a;
    private final setTo ah$a;
    private final onRatingChanged values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof notifyChange) {
            notifyChange notifychange = (notifyChange) obj;
            return runAnimators.values(this.ah$a, notifychange.ah$a) && runAnimators.values(this.values, notifychange.values) && runAnimators.values(this.ag$a, notifychange.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ah$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "ViewAllContests(_isFiltered=" + this.ah$a + ", _roundId=" + this.values + ", _tourId=" + this.ag$a + ')';
    }

    public notifyChange(setTo setto, onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(setto, "_isFiltered");
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = setto;
        this.values = onratingchanged;
        this.ag$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ViewAllContests");
        hashMap.put("isFiltered", Boolean.valueOf(this.ah$a.valueOf()));
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.values.values()));
        hashMap.put("tourId", Integer.valueOf(this.ag$a.values()));
        return hashMap;
    }
}
