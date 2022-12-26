package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
/* loaded from: classes4.dex */
public class setEmptyText extends Event<setEmptyText> {
    private int ag$a;
    private String ah$a;

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topChange";
    }

    public setEmptyText(int i, int i2, String str, int i3) {
        super(i, i2);
        this.ah$a = str;
        this.ag$a = i3;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.ah$a);
        createMap.putInt("eventCount", this.ag$a);
        createMap.putInt(TouchesHelper.TARGET_KEY, getViewTag());
        return createMap;
    }
}
