package o;

import com.app.dream11.contest.teamcompare.CompareTeamFlowState;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
import o.ListChangeRegistry;
/* loaded from: classes4.dex */
public final class newDropDownView implements getViewHorizontalDragRange {
    private final ListChangeRegistry.ListChanges ag$a;
    private final setPhoneNumber ah$a;
    private final ImageViewBindingAdapter toString;
    private final onRatingChanged valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof newDropDownView) {
            newDropDownView newdropdownview = (newDropDownView) obj;
            return runAnimators.values(this.ag$a, newdropdownview.ag$a) && runAnimators.values(this.toString, newdropdownview.toString) && runAnimators.values(this.valueOf, newdropdownview.valueOf) && runAnimators.values(this.ah$a, newdropdownview.ah$a);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.ag$a.hashCode() * 31) + this.toString.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.ah$a.hashCode();
    }

    public String toString() {
        return "HOFContestSelected(_contestId=" + this.ag$a + ", _prizeAmount=" + this.toString + ", _roundId=" + this.valueOf + ", _tourId=" + this.ah$a + ')';
    }

    public newDropDownView(ListChangeRegistry.ListChanges listChanges, ImageViewBindingAdapter imageViewBindingAdapter, onRatingChanged onratingchanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(listChanges, "_contestId");
        runAnimators.ag$a(imageViewBindingAdapter, "_prizeAmount");
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ag$a = listChanges;
        this.toString = imageViewBindingAdapter;
        this.valueOf = onratingchanged;
        this.ah$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFContestSelected");
        hashMap.put(CompareTeamFlowState.CONTEST_ID, Long.valueOf(this.ag$a.valueOf()));
        hashMap.put("prizeAmount", this.toString.ah$a());
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.valueOf.values()));
        hashMap.put("tourId", Integer.valueOf(this.ah$a.values()));
        return hashMap;
    }
}
