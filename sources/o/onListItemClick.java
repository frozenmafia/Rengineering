package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes6.dex */
public class onListItemClick extends Event<setEmptyText> {
    private float toString;
    private float valueOf;

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return ContentSizeChangeEvent.EVENT_NAME;
    }

    public onListItemClick(int i, int i2, float f, float f2) {
        super(i, i2);
        this.toString = f;
        this.valueOf = f2;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.toString);
        createMap2.putDouble("height", this.valueOf);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        return createMap;
    }
}
