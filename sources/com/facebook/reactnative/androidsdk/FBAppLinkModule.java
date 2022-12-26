package com.facebook.reactnative.androidsdk;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import o.FragmentStateManager;
import o.addRetainedFragment;
import o.performPrimaryNavigationFragmentChanged;
@FragmentStateManager.AnonymousClass1(values = FBAppLinkModule.NAME)
/* loaded from: classes4.dex */
public class FBAppLinkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "FBAppLink";
    private final ReactApplicationContext mReactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public FBAppLinkModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
    }

    private performPrimaryNavigationFragmentChanged.values createCompletionHandler(final Promise promise) {
        return new performPrimaryNavigationFragmentChanged.values() { // from class: com.facebook.reactnative.androidsdk.FBAppLinkModule.5
            @Override // o.performPrimaryNavigationFragmentChanged.values
            public void values(performPrimaryNavigationFragmentChanged performprimarynavigationfragmentchanged) {
                if (performprimarynavigationfragmentchanged == null) {
                    promise.resolve(null);
                } else {
                    promise.resolve(performprimarynavigationfragmentchanged.ag$a().toString());
                }
            }
        };
    }

    @ReactMethod
    public void fetchDeferredAppLink(Promise promise) {
        try {
            performPrimaryNavigationFragmentChanged.valueOf(this.mReactContext.getApplicationContext(), createCompletionHandler(promise));
        } catch (Exception e) {
            promise.resolve(null);
            addRetainedFragment.values(getName(), "Received error while fetching deferred app link", e);
        }
    }
}
