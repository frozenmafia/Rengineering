package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Map;
/* loaded from: classes4.dex */
public abstract class NativeDeviceInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule {
    protected abstract Map<String, Object> getTypedExportedConstants();

    public NativeDeviceInfoSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
