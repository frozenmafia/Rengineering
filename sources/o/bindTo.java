package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes5.dex */
public class bindTo extends Event<bindTo> {
    private final double ag$a;
    private final boolean valueOf;

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }

    public bindTo(int i, double d, boolean z) {
        super(i);
        this.ag$a = d;
        this.valueOf = z;
    }

    public double values() {
        return this.ag$a;
    }

    public boolean ag$a() {
        return this.valueOf;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), ah$a());
    }

    private WritableMap ah$a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", values());
        createMap.putBoolean("fromUser", ag$a());
        return createMap;
    }
}
