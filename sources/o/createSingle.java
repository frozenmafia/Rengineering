package o;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes5.dex */
public final class createSingle extends Event<createSingle> {
    public static final values values = new values(null);
    private final int ah$a;
    private final float toString;

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPageScroll";
    }

    public createSingle(int i, int i2, float f) {
        super(i);
        this.ah$a = i2;
        this.toString = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : 0.0f;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        runAnimators.ag$a(rCTEventEmitter, "rctEventEmitter");
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), ah$a());
    }

    private final WritableMap ah$a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.ah$a);
        createMap.putDouble("offset", this.toString);
        runAnimators.ah$a(createMap, "eventData");
        return createMap;
    }

    /* loaded from: classes5.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }
}
