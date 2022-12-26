package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes4.dex */
public class containedBeforeIndex extends Event<containedBeforeIndex> {
    private final boolean ag$a;

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }

    public containedBeforeIndex(int i, int i2, boolean z) {
        super(i, i2);
        this.ag$a = z;
    }

    public boolean valueOf() {
        return this.ag$a;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        createMap.putBoolean("value", valueOf());
        return createMap;
    }
}
