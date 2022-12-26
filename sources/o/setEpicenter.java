package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
/* loaded from: classes4.dex */
public class setEpicenter extends Event<setEpicenter> {
    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topShow";
    }

    public setEpicenter(int i, int i2) {
        super(i, i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        return Arguments.createMap();
    }
}
