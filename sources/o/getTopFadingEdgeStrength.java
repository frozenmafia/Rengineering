package o;

import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
import o.SeekBarBindingAdapter;
/* loaded from: classes4.dex */
public final class getTopFadingEdgeStrength implements getViewHorizontalDragRange {
    private final SeekBarBindingAdapter.OnProgressChanged ag$a;
    private final setOnSuggestListener ah$a;
    private final onRatingChanged toString;
    private final setPhoneNumber valueOf;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getTopFadingEdgeStrength) {
            getTopFadingEdgeStrength gettopfadingedgestrength = (getTopFadingEdgeStrength) obj;
            return runAnimators.values(this.toString, gettopfadingedgestrength.toString) && runAnimators.values(this.ah$a, gettopfadingedgestrength.ah$a) && runAnimators.values(this.ag$a, gettopfadingedgestrength.ag$a) && runAnimators.values(this.valueOf, gettopfadingedgestrength.valueOf);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.toString.hashCode() * 31) + this.ah$a.hashCode()) * 31) + this.ag$a.hashCode()) * 31) + this.valueOf.hashCode();
    }

    public String toString() {
        return "ContestHomeTabSelected(_roundId=" + this.toString + ", _roundStatus=" + this.ah$a + ", _selection=" + this.ag$a + ", _tourId=" + this.valueOf + ')';
    }

    public getTopFadingEdgeStrength(onRatingChanged onratingchanged, setOnSuggestListener setonsuggestlistener, SeekBarBindingAdapter.OnProgressChanged onProgressChanged, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setonsuggestlistener, "_roundStatus");
        runAnimators.ag$a(onProgressChanged, "_selection");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.toString = onratingchanged;
        this.ah$a = setonsuggestlistener;
        this.ag$a = onProgressChanged;
        this.valueOf = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ContestHomeTabSelected");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.toString.values()));
        hashMap.put("roundStatus", this.ah$a.values());
        hashMap.put("selection", this.ag$a.ag$a());
        hashMap.put("tourId", Integer.valueOf(this.valueOf.values()));
        return hashMap;
    }
}
