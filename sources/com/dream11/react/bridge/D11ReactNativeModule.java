package com.dream11.react.bridge;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import o.runAnimators;
/* loaded from: classes.dex */
public abstract class D11ReactNativeModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public abstract void awaitCallback(String str, ReadableMap readableMap, Promise promise);

    @ReactMethod
    public abstract void configureGiphyKey();

    @ReactMethod
    public abstract void deleteSavedPaymentCard(String str, String str2, String str3, Promise promise);

    @ReactMethod
    public abstract void dismissProgressLoader();

    @ReactMethod
    public abstract void fetchWalletBalance(ReadableArray readableArray, Promise promise);

    @ReactMethod
    public abstract void getAllContacts(Promise promise);

    @ReactMethod
    public abstract void getAllReactNativeFeatureFlags(Promise promise);

    @ReactMethod
    public abstract void getAppVersionName(Promise promise);

    @ReactMethod
    public abstract void getAuthenticationToken(boolean z, Promise promise);

    @ReactMethod
    public abstract void getDisabledLanguages(Promise promise);

    @ReactMethod
    public abstract Promise getExperimentValue(String str, String str2, String str3, Promise promise);

    @ReactMethod
    public abstract Promise getFeatureFlag(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getGraphQLEndPoint(Promise promise);

    @ReactMethod
    public abstract void getInstalledApps(Promise promise);

    @ReactMethod
    public abstract void getLocationValue(Promise promise);

    @ReactMethod
    public abstract void getReferralLink(Promise promise);

    @ReactMethod
    public abstract void getReferralSummary(Promise promise);

    @ReactMethod
    public abstract void getSavedPaymentCards(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void getServerTimeStamp(Promise promise);

    @ReactMethod
    public abstract void getURLPreview(String str, Promise promise);

    @ReactMethod
    public abstract Promise getValueFromLocalStorage(String str, String str2, String str3, Promise promise);

    @ReactMethod
    public abstract void handleBackPress();

    @ReactMethod
    public abstract void isAppInstalled(String str, Promise promise);

    @ReactMethod
    public abstract void linkUnlinkWallet(boolean z, String str, String str2, String str3, Promise promise);

    @ReactMethod
    public abstract void logoutFromApp(Promise promise);

    @ReactMethod
    public abstract String onEvent(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void onLanguageChanged(String str, boolean z);

    @ReactMethod
    public abstract void onQuickKYCFlowFinished(boolean z, String str);

    @ReactMethod
    public abstract void onSaveTeamComplete(ReadableMap readableMap, ReadableMap readableMap2);

    @ReactMethod
    public abstract void onTeamSwitchedSuccessfully();

    @ReactMethod
    public abstract void openPdfFromFileSystem(String str, String str2);

    @ReactMethod
    public abstract void openPdfFromWeb(String str, String str2);

    @ReactMethod
    public abstract void openTextMessageAndroid(String str, String str2);

    @ReactMethod
    public abstract void performAction(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void queryContacts(String str, String str2, Promise promise);

    @ReactMethod
    public abstract void queryDream11Contact(String str, Promise promise);

    @ReactMethod
    public abstract void registerContactSyncClose();

    @ReactMethod
    public abstract void requestPermission(String str, Promise promise);

    @ReactMethod
    public abstract void saveLocationValue(ReadableMap readableMap);

    @ReactMethod
    public abstract void sendCodegenEvent(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void sendEvent(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void sendInstalledAppsData(String str, boolean z);

    @ReactMethod
    public abstract void sendPerformanceData(String str, String str2);

    @ReactMethod
    public abstract void setReactNativeDashboardFeatureFlag(String str, boolean z);

    @ReactMethod
    public abstract void setValueFromLocalStorage(String str, String str2, String str3);

    @ReactMethod
    public abstract void shareTextMessage(String str, String str2, String str3);

    @ReactMethod
    public abstract void shouldConstructBottomTabs();

    @ReactMethod
    public abstract void showGifBottomSheet(int i, String str, boolean z, boolean z2, String str2, String str3, Promise promise);

    @ReactMethod
    public abstract void startFlow(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void syncContact(String str);

    @ReactMethod
    public abstract void triggerCallback(String str, ReadableMap readableMap);

    @ReactMethod
    public abstract void updateUserSegmentAndSetUtmParams(String str, Double d);

    @ReactMethod
    public abstract void updatelocalDB(String str, String str2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11ReactNativeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        runAnimators.ag$a(reactApplicationContext, "context");
    }

    public static /* synthetic */ void showGifBottomSheet$default(D11ReactNativeModule d11ReactNativeModule, int i, String str, boolean z, boolean z2, String str2, String str3, Promise promise, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showGifBottomSheet");
        }
        d11ReactNativeModule.showGifBottomSheet(i, str, z, z2, str2, (i2 & 32) != 0 ? null : str3, promise);
    }
}
