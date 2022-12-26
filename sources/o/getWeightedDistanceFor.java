package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class getWeightedDistanceFor implements getViewHorizontalDragRange {
    private final setPhoneNumber ag$a;
    private final setContentPaddingTop ah$a;
    private final onRatingChanged toString;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getWeightedDistanceFor) {
            getWeightedDistanceFor getweighteddistancefor = (getWeightedDistanceFor) obj;
            return runAnimators.values(this.ah$a, getweighteddistancefor.ah$a) && runAnimators.values(this.toString, getweighteddistancefor.toString) && runAnimators.values(this.ag$a, getweighteddistancefor.ag$a);
        }
        return false;
    }

    public int hashCode() {
        return (((this.ah$a.hashCode() * 31) + this.toString.hashCode()) * 31) + this.ag$a.hashCode();
    }

    public String toString() {
        return "PlayerCategorySwitched(_playerCategory=" + this.ah$a + ", _roundId=" + this.toString + ", _tourId=" + this.ag$a + ')';
    }

    public getWeightedDistanceFor(setContentPaddingTop setcontentpaddingtop, onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(setcontentpaddingtop, "_playerCategory");
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = setcontentpaddingtop;
        this.toString = onratingchanged;
        this.ag$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "PlayerCategorySwitched");
        hashMap.put("playerCategory", this.ah$a.ag$a());
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.toString.values()));
        hashMap.put("tourId", Integer.valueOf(this.ag$a.values()));
        return hashMap;
    }
}
