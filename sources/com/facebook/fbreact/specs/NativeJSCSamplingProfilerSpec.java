package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
/* loaded from: classes6.dex */
public abstract class NativeJSCSamplingProfilerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    @ReactMethod
    public abstract void operationComplete(double d, String str, String str2);

    public NativeJSCSamplingProfilerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }
}
