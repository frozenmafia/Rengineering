package com.app.dream11.react;

import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.ref.WeakReference;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class D11ReactNativeAttributionModuleImpl$ah$a {
    public /* synthetic */ D11ReactNativeAttributionModuleImpl$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    private D11ReactNativeAttributionModuleImpl$ah$a() {
    }

    public final WeakReference<ReactApplicationContext> ag$a() {
        WeakReference<ReactApplicationContext> weakReference = D11ReactNativeAttributionModuleImpl.reactApplication;
        if (weakReference != null) {
            return weakReference;
        }
        runAnimators.valueOf("reactApplication");
        return null;
    }

    public final void ah$a(WeakReference<ReactApplicationContext> weakReference) {
        runAnimators.ag$a(weakReference, "<set-?>");
        D11ReactNativeAttributionModuleImpl.reactApplication = weakReference;
    }
}
