package com.reactnativecommunity.netinfo;

import android.os.Build;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import o.FragmentStateManager;
import o.RoomOpenHelper;
import o.dropAllTables;
import o.onPostMigrate;
import o.onValidateSchema;
@FragmentStateManager.AnonymousClass1(values = NetInfoModule.NAME)
/* loaded from: classes5.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements onPostMigrate.toString {
    public static final String NAME = "RNCNetInfo";
    private final onPostMigrate mAmazonConnectivityChecker;
    private final onValidateSchema mConnectivityReceiver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new RoomOpenHelper.ValidationResult(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new dropAllTables(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new onPostMigrate(reactApplicationContext, this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mConnectivityReceiver.valueOf();
        this.mAmazonConnectivityChecker.values();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mAmazonConnectivityChecker.ah$a();
        this.mConnectivityReceiver.values();
        this.mConnectivityReceiver.values = false;
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        this.mConnectivityReceiver.ah$a(str, promise);
    }

    @Override // o.onPostMigrate.toString
    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.values(z);
    }

    @ReactMethod
    public void addListener(String str) {
        this.mConnectivityReceiver.values = true;
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        if (num.intValue() == 0) {
            this.mConnectivityReceiver.values = false;
        }
    }
}
