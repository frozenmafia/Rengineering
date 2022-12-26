package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes5.dex */
public final class ViewTreeSavedStateRegistryOwner extends Event<ViewTreeSavedStateRegistryOwner> {
    public static final values ah$a = new values(null);

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topDismissed";
    }

    public ViewTreeSavedStateRegistryOwner(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        runAnimators.ag$a(rCTEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("dismissCount", 1);
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
