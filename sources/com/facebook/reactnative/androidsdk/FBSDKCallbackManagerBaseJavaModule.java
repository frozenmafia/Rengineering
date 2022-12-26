package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import o.DefaultSpecialEffectsController;
import o.SpecialEffectsController;
/* loaded from: classes4.dex */
public abstract class FBSDKCallbackManagerBaseJavaModule extends ReactContextBaseJavaModule {
    private final SpecialEffectsController.AnonymousClass1 mActivityEventListener;

    /* JADX INFO: Access modifiers changed from: protected */
    public DefaultSpecialEffectsController.AnonymousClass4.AnonymousClass1 getCallbackManager() {
        return this.mActivityEventListener.ah$a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public FBSDKCallbackManagerBaseJavaModule(ReactApplicationContext reactApplicationContext, SpecialEffectsController.AnonymousClass1 anonymousClass1) {
        super(reactApplicationContext);
        this.mActivityEventListener = anonymousClass1;
        reactApplicationContext.addActivityEventListener(anonymousClass1);
    }
}
