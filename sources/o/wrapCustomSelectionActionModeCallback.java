package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class wrapCustomSelectionActionModeCallback implements getViewHorizontalDragRange {
    private final setPhoneNumber toString;
    private final onRatingChanged values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wrapCustomSelectionActionModeCallback) {
            wrapCustomSelectionActionModeCallback wrapcustomselectionactionmodecallback = (wrapCustomSelectionActionModeCallback) obj;
            return runAnimators.values(this.values, wrapcustomselectionactionmodecallback.values) && runAnimators.values(this.toString, wrapcustomselectionactionmodecallback.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        return "FloatingContestsButtonTapped(_roundId=" + this.values + ", _tourId=" + this.toString + ')';
    }

    public wrapCustomSelectionActionModeCallback(onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.values = onratingchanged;
        this.toString = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "FloatingContestsButtonTapped");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.values.values()));
        hashMap.put("tourId", Integer.valueOf(this.toString.values()));
        return hashMap;
    }
}
