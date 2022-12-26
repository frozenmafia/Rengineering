package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class measureChild implements getViewHorizontalDragRange {
    private final onRatingChanged ah$a;
    private final setPhoneNumber toString;
    private final setLineSpacingExtra values;

    public measureChild() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof measureChild) {
            measureChild measurechild = (measureChild) obj;
            return runAnimators.values(this.ah$a, measurechild.ah$a) && runAnimators.values(this.values, measurechild.values) && runAnimators.values(this.toString, measurechild.toString);
        }
        return false;
    }

    public int hashCode() {
        onRatingChanged onratingchanged = this.ah$a;
        int hashCode = onratingchanged == null ? 0 : onratingchanged.hashCode();
        setLineSpacingExtra setlinespacingextra = this.values;
        int hashCode2 = setlinespacingextra == null ? 0 : setlinespacingextra.hashCode();
        setPhoneNumber setphonenumber = this.toString;
        return (((hashCode * 31) + hashCode2) * 31) + (setphonenumber != null ? setphonenumber.hashCode() : 0);
    }

    public String toString() {
        return "ContestJoinedPopUpShown(_roundId=" + this.ah$a + ", _timeToRoundlock=" + this.values + ", _tourId=" + this.toString + ')';
    }

    public measureChild(onRatingChanged onratingchanged, setLineSpacingExtra setlinespacingextra, setPhoneNumber setphonenumber) {
        this.ah$a = onratingchanged;
        this.values = setlinespacingextra;
        this.toString = setphonenumber;
    }

    public /* synthetic */ measureChild(onRatingChanged onratingchanged, setLineSpacingExtra setlinespacingextra, setPhoneNumber setphonenumber, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : onratingchanged, (i & 2) != 0 ? null : setlinespacingextra, (i & 4) != 0 ? null : setphonenumber);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContestJoinedPopUpShown");
        onRatingChanged onratingchanged = this.ah$a;
        if (onratingchanged != null) {
            hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(onratingchanged.values()));
        }
        setLineSpacingExtra setlinespacingextra = this.values;
        if (setlinespacingextra != null) {
            hashMap.put("timeToRoundlock", Integer.valueOf(setlinespacingextra.ag$a()));
        }
        setPhoneNumber setphonenumber = this.toString;
        if (setphonenumber != null) {
            hashMap.put("tourId", Integer.valueOf(setphonenumber.values()));
        }
        return hashMap;
    }
}
