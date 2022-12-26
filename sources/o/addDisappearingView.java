package o;

import com.google.firebase.database.core.view.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class addDisappearingView {
    private final Map<detachViewAt, setFrom> ag$a = new HashMap();

    public void toString(setFrom setfrom) {
        Event.EventType valueOf = setfrom.valueOf();
        detachViewAt ag$a = setfrom.ag$a();
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(valueOf == Event.EventType.CHILD_ADDED || valueOf == Event.EventType.CHILD_CHANGED || valueOf == Event.EventType.CHILD_REMOVED, "Only child changes supported for tracking");
        RecyclerView.ItemAnimator.AdapterChanges.ah$a(!setfrom.ag$a().HaptikSDK$b());
        if (this.ag$a.containsKey(ag$a)) {
            setFrom setfrom2 = this.ag$a.get(ag$a);
            Event.EventType valueOf2 = setfrom2.valueOf();
            if (valueOf == Event.EventType.CHILD_ADDED && valueOf2 == Event.EventType.CHILD_REMOVED) {
                this.ag$a.put(setfrom.ag$a(), setFrom.ag$a(ag$a, setfrom.ah$a(), setfrom2.ah$a()));
                return;
            } else if (valueOf == Event.EventType.CHILD_REMOVED && valueOf2 == Event.EventType.CHILD_ADDED) {
                this.ag$a.remove(ag$a);
                return;
            } else if (valueOf == Event.EventType.CHILD_REMOVED && valueOf2 == Event.EventType.CHILD_CHANGED) {
                this.ag$a.put(ag$a, setFrom.toString(ag$a, setfrom2.values()));
                return;
            } else if (valueOf == Event.EventType.CHILD_CHANGED && valueOf2 == Event.EventType.CHILD_ADDED) {
                this.ag$a.put(ag$a, setFrom.values(ag$a, setfrom.ah$a()));
                return;
            } else if (valueOf == Event.EventType.CHILD_CHANGED && valueOf2 == Event.EventType.CHILD_CHANGED) {
                this.ag$a.put(ag$a, setFrom.ag$a(ag$a, setfrom.ah$a(), setfrom2.values()));
                return;
            } else {
                throw new IllegalStateException("Illegal combination of changes: " + setfrom + " occurred after " + setfrom2);
            }
        }
        this.ag$a.put(setfrom.ag$a(), setfrom);
    }

    public List<setFrom> values() {
        return new ArrayList(this.ag$a.values());
    }
}
