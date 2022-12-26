package com.facebook.react.modules.i18nmanager;

import android.os.Build;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.FragmentStateManager;
import o.destroyItem;
import o.setNonConfig;
@FragmentStateManager.AnonymousClass1(values = I18nManagerModule.NAME)
/* loaded from: classes4.dex */
public class I18nManagerModule extends NativeI18nManagerSpec {
    public static final String NAME = "I18nManager";
    private final setNonConfig sharedI18nUtilInstance;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sharedI18nUtilInstance = setNonConfig.ah$a();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        Locale locale;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = reactApplicationContext.getResources().getConfiguration().locale;
        }
        HashMap values = destroyItem.values();
        values.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.toString(reactApplicationContext)));
        values.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.valueOf(reactApplicationContext)));
        values.put("localeIdentifier", locale.toString());
        return values;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z) {
        this.sharedI18nUtilInstance.ah$a(getReactApplicationContext(), z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z) {
        this.sharedI18nUtilInstance.valueOf(getReactApplicationContext(), z);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z) {
        this.sharedI18nUtilInstance.ag$a(getReactApplicationContext(), z);
    }
}
