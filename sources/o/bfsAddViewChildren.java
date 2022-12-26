package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes4.dex */
public class bfsAddViewChildren extends Event<bfsAddViewChildren> {
    private final double toString;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSlidingComplete";
    }

    public bfsAddViewChildren(int i, int i2, double d) {
        super(i, i2);
        this.toString = d;
    }

    public double ag$a() {
        return this.toString;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putDouble("value", ag$a());
        return createMap;
    }
}
