package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import o.DefaultSpecialEffectsController;
import o.FragmentStateManager;
import o.SpecialEffectsController;
@FragmentStateManager.AnonymousClass1(values = FBSettingsModule.NAME)
/* loaded from: classes4.dex */
public class FBSettingsModule extends BaseJavaModule {
    public static final String NAME = "FBSettings";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void setDataProcessingOptions(ReadableArray readableArray, int i, int i2) {
        DefaultSpecialEffectsController.AnonymousClass8.valueOf((String[]) SpecialEffectsController.AnonymousClass3.toString(readableArray).toArray(new String[0]), i, i2);
    }

    @ReactMethod
    public static void initializeSDK() {
        DefaultSpecialEffectsController.AnonymousClass8.values();
    }

    @ReactMethod
    public static void setAppID(String str) {
        DefaultSpecialEffectsController.AnonymousClass8.toString(str);
    }
}
