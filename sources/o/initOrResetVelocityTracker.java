package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class initOrResetVelocityTracker implements getViewHorizontalDragRange {
    private final onStopTrackingTouch toString;
    private final doFrame valueOf;
    private final DataBindingComponent values;

    public initOrResetVelocityTracker() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof initOrResetVelocityTracker) {
            initOrResetVelocityTracker initorresetvelocitytracker = (initOrResetVelocityTracker) obj;
            return runAnimators.values(this.values, initorresetvelocitytracker.values) && runAnimators.values(this.valueOf, initorresetvelocitytracker.valueOf) && runAnimators.values(this.toString, initorresetvelocitytracker.toString);
        }
        return false;
    }

    public int hashCode() {
        DataBindingComponent dataBindingComponent = this.values;
        int hashCode = dataBindingComponent == null ? 0 : dataBindingComponent.hashCode();
        doFrame doframe = this.valueOf;
        int hashCode2 = doframe == null ? 0 : doframe.hashCode();
        onStopTrackingTouch onstoptrackingtouch = this.toString;
        return (((hashCode * 31) + hashCode2) * 31) + (onstoptrackingtouch != null ? onstoptrackingtouch.hashCode() : 0);
    }

    public String toString() {
        return "ChatReactionLongPress(_channelUrl=" + this.values + ", _messageId=" + this.valueOf + ", _senderId=" + this.toString + ')';
    }

    public initOrResetVelocityTracker(DataBindingComponent dataBindingComponent, doFrame doframe, onStopTrackingTouch onstoptrackingtouch) {
        this.values = dataBindingComponent;
        this.valueOf = doframe;
        this.toString = onstoptrackingtouch;
    }

    public /* synthetic */ initOrResetVelocityTracker(DataBindingComponent dataBindingComponent, doFrame doframe, onStopTrackingTouch onstoptrackingtouch, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : dataBindingComponent, (i & 2) != 0 ? null : doframe, (i & 4) != 0 ? null : onstoptrackingtouch);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ChatReactionLongPress");
        DataBindingComponent dataBindingComponent = this.values;
        if (dataBindingComponent != null) {
            hashMap.put("channelUrl", dataBindingComponent.ah$a());
        }
        doFrame doframe = this.valueOf;
        if (doframe != null) {
            hashMap.put("messageId", Long.valueOf(doframe.ag$a()));
        }
        onStopTrackingTouch onstoptrackingtouch = this.toString;
        if (onstoptrackingtouch != null) {
            hashMap.put("senderId", Long.valueOf(onstoptrackingtouch.ah$a()));
        }
        return hashMap;
    }
}
