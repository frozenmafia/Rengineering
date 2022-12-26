package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes5.dex */
public class copyArgumentsFrom extends Event<copyArgumentsFrom> {
    private final double values;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSlidingStart";
    }

    public copyArgumentsFrom(int i, double d) {
        super(i);
        this.values = d;
    }

    public double valueOf() {
        return this.values;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), ag$a());
    }

    private WritableMap ag$a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", valueOf());
        return createMap;
    }
}
