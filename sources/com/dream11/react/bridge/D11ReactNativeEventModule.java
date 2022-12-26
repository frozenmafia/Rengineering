package com.dream11.react.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.Serializable;
import java.util.Map;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class D11ReactNativeEventModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public abstract String onEvent(String str, Map<String, ? extends Serializable> map);

    @ReactMethod
    public abstract void sendCodegenEvent(String str, Map<String, ? extends Serializable> map);

    @ReactMethod
    public abstract void sendEvent(String str, Map<String, ? extends Serializable> map);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11ReactNativeEventModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        runAnimators.ag$a(reactApplicationContext, "context");
    }
}
