package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.sendbird.android.constant.StringSet;
import o.ListFragment;
/* loaded from: classes4.dex */
public class updateFinalState extends Event<ListFragment.AnonymousClass2> {
    private String values;

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topKeyPress";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public updateFinalState(int i, String str) {
        this(-1, i, str);
    }

    updateFinalState(int i, int i2, String str) {
        super(i, i2);
        this.values = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString(StringSet.key, this.values);
        return createMap;
    }
}
