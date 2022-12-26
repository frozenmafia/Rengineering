package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes5.dex */
public final class openFileInput extends Event<openFileInput> {
    public static final toString values = new toString(null);

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topDisappear";
    }

    public openFileInput(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        runAnimators.ag$a(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), Arguments.createMap());
    }

    /* loaded from: classes5.dex */
    public static final class toString {
        public /* synthetic */ toString(getTargetTypes gettargettypes) {
            this();
        }

        private toString() {
        }
    }
}
