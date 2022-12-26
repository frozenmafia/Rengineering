package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes5.dex */
public final class setKeysetAlias extends Event<setKeysetAlias> {
    public static final values values = new values(null);

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topFinishTransitioning";
    }

    public setKeysetAlias(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        runAnimators.ag$a(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), Arguments.createMap());
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
