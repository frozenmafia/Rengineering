package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = AppearanceModule.NAME)
/* loaded from: classes.dex */
public class AppearanceModule extends NativeAppearanceSpec {
    private static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final String NAME = "Appearance";
    private String mColorScheme;
    private final toString mOverrideColorScheme;

    /* loaded from: classes4.dex */
    public interface toString {
        String ah$a();
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public void removeListeners(double d) {
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null);
    }

    public AppearanceModule(ReactApplicationContext reactApplicationContext, toString tostring) {
        super(reactApplicationContext);
        this.mColorScheme = "light";
        this.mOverrideColorScheme = tostring;
        this.mColorScheme = colorSchemeForCurrentConfiguration(reactApplicationContext);
    }

    private String colorSchemeForCurrentConfiguration(Context context) {
        toString tostring = this.mOverrideColorScheme;
        if (tostring != null) {
            return tostring.ah$a();
        }
        return (context.getResources().getConfiguration().uiMode & 48) != 32 ? "light" : "dark";
    }

    @Override // com.facebook.fbreact.specs.NativeAppearanceSpec
    public String getColorScheme() {
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(currentActivity);
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        return colorSchemeForCurrentConfiguration;
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            return;
        }
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        emitAppearanceChanged(colorSchemeForCurrentConfiguration);
    }

    public void emitAppearanceChanged(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("colorScheme", str);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(APPEARANCE_CHANGED_EVENT_NAME, createMap);
        }
    }
}
