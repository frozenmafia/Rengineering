package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
/* loaded from: classes6.dex */
public class findPendingOperation extends Event<findPendingOperation> {
    private int ah$a;
    private int toString;

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSelectionChange";
    }

    public findPendingOperation(int i, int i2, int i3, int i4) {
        super(i, i2);
        this.toString = i3;
        this.ah$a = i4;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.ah$a);
        createMap2.putInt("start", this.toString);
        createMap.putMap("selection", createMap2);
        return createMap;
    }
}
