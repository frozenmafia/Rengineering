package o;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.Event;
/* loaded from: classes5.dex */
public final class dropFtsSyncTriggers {
    public static final void ag$a(ReactContext reactContext, Event<?> event) {
        runAnimators.ag$a(reactContext, "<this>");
        runAnimators.ag$a(event, androidx.core.app.NotificationCompat.CATEGORY_EVENT);
        try {
            NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
            runAnimators.toString(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().dispatchEvent(event);
        } catch (NullPointerException e) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e);
        }
    }
}
