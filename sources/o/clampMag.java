package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class clampMag implements getViewHorizontalDragRange {
    private final doFrame ah$a;
    private final setList toString;
    private final onStopTrackingTouch valueOf;
    private final DataBindingComponent values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof clampMag) {
            clampMag clampmag = (clampMag) obj;
            return runAnimators.values(this.values, clampmag.values) && runAnimators.values(this.ah$a, clampmag.ah$a) && runAnimators.values(this.toString, clampmag.toString) && runAnimators.values(this.valueOf, clampmag.valueOf);
        }
        return false;
    }

    public int hashCode() {
        DataBindingComponent dataBindingComponent = this.values;
        int hashCode = dataBindingComponent == null ? 0 : dataBindingComponent.hashCode();
        doFrame doframe = this.ah$a;
        int hashCode2 = doframe == null ? 0 : doframe.hashCode();
        int hashCode3 = this.toString.hashCode();
        onStopTrackingTouch onstoptrackingtouch = this.valueOf;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (onstoptrackingtouch != null ? onstoptrackingtouch.hashCode() : 0);
    }

    public String toString() {
        return "ReactionBottomSheetTabSelected(_channelUrl=" + this.values + ", _messageId=" + this.ah$a + ", _reactionId=" + this.toString + ", _senderId=" + this.valueOf + ')';
    }

    public clampMag(DataBindingComponent dataBindingComponent, doFrame doframe, setList setlist, onStopTrackingTouch onstoptrackingtouch) {
        runAnimators.ag$a(setlist, "_reactionId");
        this.values = dataBindingComponent;
        this.ah$a = doframe;
        this.toString = setlist;
        this.valueOf = onstoptrackingtouch;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReactionBottomSheetTabSelected");
        DataBindingComponent dataBindingComponent = this.values;
        if (dataBindingComponent != null) {
            hashMap.put("channelUrl", dataBindingComponent.ah$a());
        }
        doFrame doframe = this.ah$a;
        if (doframe != null) {
            hashMap.put("messageId", Long.valueOf(doframe.ag$a()));
        }
        hashMap.put("reactionId", this.toString.valueOf());
        onStopTrackingTouch onstoptrackingtouch = this.valueOf;
        if (onstoptrackingtouch != null) {
            hashMap.put("senderId", Long.valueOf(onstoptrackingtouch.ah$a()));
        }
        return hashMap;
    }
}
