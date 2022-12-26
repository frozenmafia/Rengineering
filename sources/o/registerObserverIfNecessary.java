package o;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes5.dex */
public final class registerObserverIfNecessary {
    public static final DeviceEventManagerModule.RCTDeviceEventEmitter toString(ReactContext reactContext) {
        runAnimators.ag$a(reactContext, "<this>");
        JavaScriptModule jSModule = reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        runAnimators.ah$a(jSModule, "this.getJSModule(DeviceE…EventEmitter::class.java)");
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) jSModule;
    }

    public static final UIManagerModule ah$a(ReactContext reactContext) {
        runAnimators.ag$a(reactContext, "<this>");
        NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
        runAnimators.toString(nativeModule);
        runAnimators.ah$a(nativeModule, "this.getNativeModule(UIM…agerModule::class.java)!!");
        return (UIManagerModule) nativeModule;
    }
}
