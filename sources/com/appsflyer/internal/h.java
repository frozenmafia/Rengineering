package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class h {
    String AFInAppEventParameterName;
    Map<String, Object> AFInAppEventType;
    AppsFlyerRequestListener AFKeystoreWrapper;
    String AFLogger$LogLevel;
    public String AFVersionDeclaration;
    String AppsFlyer2dXConversionCallback;
    String getLevel;
    byte[] init;
    private final boolean onAppOpenAttributionNative;
    public String onAttributionFailureNative;
    boolean onInstallConversionDataLoadedNative;
    public int onInstallConversionFailureNative;
    public Application valueOf;
    public final Map<String, Object> values;

    public h() {
        this(null, null, null, null);
    }

    public h(String str, String str2, Boolean bool, Context context) {
        this.values = new HashMap();
        this.AFLogger$LogLevel = str;
        this.onAttributionFailureNative = str2;
        this.onAppOpenAttributionNative = bool != null ? bool.booleanValue() : true;
        if (context != null) {
            this.valueOf = (Application) context.getApplicationContext();
        }
    }

    public h AFInAppEventParameterName(String str) {
        this.onAttributionFailureNative = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean AFInAppEventParameterName() {
        return this.onInstallConversionDataLoadedNative;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final h values(Map<String, ?> map) {
        this.values.putAll(map);
        return this;
    }

    public final Map<String, Object> AFInAppEventType() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] valueOf() {
        return this.init;
    }

    public final boolean AFKeystoreWrapper() {
        return this.onAppOpenAttributionNative;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String values(String str) {
        String AFInAppEventType = ah.AFInAppEventParameterName().AFInAppEventType(this.valueOf);
        return AFInAppEventType != null ? Uri.parse(str).buildUpon().appendQueryParameter("channel", AFInAppEventType).build().toString() : str;
    }
}
