package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes4.dex */
public class setListAdapter extends Event<setListAdapter> {
    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topFocus";
    }

    public setListAdapter(int i, int i2) {
        super(i, i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        return createMap;
    }
}
