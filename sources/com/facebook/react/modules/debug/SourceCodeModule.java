package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import o.FragmentLifecycleCallbacksDispatcher;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = SourceCodeModule.NAME)
/* loaded from: classes4.dex */
public class SourceCodeModule extends NativeSourceCodeSpec {
    public static final String NAME = "SourceCode";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) FragmentLifecycleCallbacksDispatcher.FragmentLifecycleCallbacksHolder.ag$a(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }
}
