package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class Openable implements getViewHorizontalDragRange {
    private final DataBindingComponent ag$a;
    private final onStopTrackingTouch ah$a;
    private final doFrame values;

    public Openable() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Openable) {
            Openable openable = (Openable) obj;
            return runAnimators.values(this.ag$a, openable.ag$a) && runAnimators.values(this.values, openable.values) && runAnimators.values(this.ah$a, openable.ah$a);
        }
        return false;
    }

    public int hashCode() {
        DataBindingComponent dataBindingComponent = this.ag$a;
        int hashCode = dataBindingComponent == null ? 0 : dataBindingComponent.hashCode();
        doFrame doframe = this.values;
        int hashCode2 = doframe == null ? 0 : doframe.hashCode();
        onStopTrackingTouch onstoptrackingtouch = this.ah$a;
        return (((hashCode * 31) + hashCode2) * 31) + (onstoptrackingtouch != null ? onstoptrackingtouch.hashCode() : 0);
    }

    public String toString() {
        return "ReactionBottomSheetLoaded(_channelUrl=" + this.ag$a + ", _messageId=" + this.values + ", _senderId=" + this.ah$a + ')';
    }

    public Openable(DataBindingComponent dataBindingComponent, doFrame doframe, onStopTrackingTouch onstoptrackingtouch) {
        this.ag$a = dataBindingComponent;
        this.values = doframe;
        this.ah$a = onstoptrackingtouch;
    }

    public /* synthetic */ Openable(DataBindingComponent dataBindingComponent, doFrame doframe, onStopTrackingTouch onstoptrackingtouch, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : dataBindingComponent, (i & 2) != 0 ? null : doframe, (i & 4) != 0 ? null : onstoptrackingtouch);
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "ReactionBottomSheetLoaded");
        DataBindingComponent dataBindingComponent = this.ag$a;
        if (dataBindingComponent != null) {
            hashMap.put("channelUrl", dataBindingComponent.ah$a());
        }
        doFrame doframe = this.values;
        if (doframe != null) {
            hashMap.put("messageId", Long.valueOf(doframe.ag$a()));
        }
        onStopTrackingTouch onstoptrackingtouch = this.ah$a;
        if (onstoptrackingtouch != null) {
            hashMap.put("senderId", Long.valueOf(onstoptrackingtouch.ah$a()));
        }
        return hashMap;
    }
}
