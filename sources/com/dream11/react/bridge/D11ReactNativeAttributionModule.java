package com.dream11.react.bridge;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import o.runAnimators;
/* loaded from: classes.dex */
public abstract class D11ReactNativeAttributionModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public abstract void appsFlyereferralLink(Promise promise);

    @ReactMethod
    public abstract void getAppsFlyerUID(Promise promise);

    @ReactMethod
    public abstract void getUTMParamsdictionaryValue(Promise promise);

    @ReactMethod
    public abstract void getUTMParamsdictionaryValueForLogin(Promise promise);

    @ReactMethod
    public abstract void logScreenName(String str, ReadableArray readableArray);

    @ReactMethod
    public abstract void performLogoutOn(ReadableArray readableArray);

    @ReactMethod
    public abstract void performSetup();

    @ReactMethod
    public abstract void trackEvent(String str, ReadableMap readableMap, ReadableArray readableArray);

    @ReactMethod
    public abstract void uniqueDeviceID(Promise promise);

    @ReactMethod
    public abstract void utmCampaign(Promise promise);

    @ReactMethod
    public abstract void utmContent(Promise promise);

    @ReactMethod
    public abstract void utmMedium(Promise promise);

    @ReactMethod
    public abstract void utmRetarget(Promise promise);

    @ReactMethod
    public abstract void utmRetargetContent(Promise promise);

    @ReactMethod
    public abstract void utmSource(Promise promise);

    @ReactMethod
    public abstract void utmTerm(Promise promise);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11ReactNativeAttributionModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        runAnimators.ag$a(reactApplicationContext, "context");
    }
}
