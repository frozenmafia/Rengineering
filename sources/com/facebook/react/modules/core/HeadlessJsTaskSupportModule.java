package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import o.FragmentActivity;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes4.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d, Promise promise) {
        int i = (int) d;
        FragmentStateManager.AnonymousClass2 valueOf = FragmentStateManager.AnonymousClass2.valueOf(getReactApplicationContext());
        if (valueOf.ah$a(i)) {
            promise.resolve(Boolean.valueOf(valueOf.valueOf(i)));
            return;
        }
        FragmentActivity.toString((Class<?>) HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
        promise.resolve(false);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d) {
        int i = (int) d;
        FragmentStateManager.AnonymousClass2 valueOf = FragmentStateManager.AnonymousClass2.valueOf(getReactApplicationContext());
        if (valueOf.ah$a(i)) {
            valueOf.values(i);
        } else {
            FragmentActivity.toString((Class<?>) HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }
}
