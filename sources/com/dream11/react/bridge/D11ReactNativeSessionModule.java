package com.dream11.react.bridge;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Pair;
import o.runAnimators;
/* loaded from: classes6.dex */
public abstract class D11ReactNativeSessionModule extends ReactContextBaseJavaModule {
    @ReactMethod
    public abstract Pair<Boolean, String> getAuthenticationToken();

    @ReactMethod
    public abstract String getRefreshToken();

    @ReactMethod
    public abstract void setAuthenticationToken(Pair<Boolean, String> pair);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11ReactNativeSessionModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        runAnimators.ag$a(reactApplicationContext, "context");
    }
}
