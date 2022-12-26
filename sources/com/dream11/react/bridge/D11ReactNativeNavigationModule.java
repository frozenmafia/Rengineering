package com.dream11.react.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.Serializable;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class D11ReactNativeNavigationModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public abstract void handleBackPress();

    @ReactMethod
    public abstract void startFlow(String str, Map<String, ? extends Serializable> map);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11ReactNativeNavigationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        runAnimators.ag$a(reactApplicationContext, "context");
    }
}
