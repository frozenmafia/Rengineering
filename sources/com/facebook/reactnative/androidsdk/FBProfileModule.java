package com.facebook.reactnative.androidsdk;

import com.facebook.Profile;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import o.FragmentStateManager;
import o.SpecialEffectsController;
@FragmentStateManager.AnonymousClass1(values = FBProfileModule.NAME)
/* loaded from: classes4.dex */
public class FBProfileModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBProfile";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public FBProfileModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void getCurrentProfile(Callback callback) {
        Object[] objArr = new Object[1];
        objArr[0] = Profile.ah$a() == null ? null : SpecialEffectsController.AnonymousClass3.values(Profile.ah$a());
        callback.invoke(objArr);
    }
}
