package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class bd extends h {
    private final boolean onAppOpenAttributionNative;
    public boolean onDeepLinking;
    private final boolean onDeepLinkingNative;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bd() {
        this(null, null, null, null, null, null);
    }

    public bd(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, Context context) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false), context);
        this.onDeepLinkingNative = bool != null ? bool.booleanValue() : true;
        this.onAppOpenAttributionNative = bool2 != null ? bool2.booleanValue() : true;
    }

    public final boolean init() {
        return this.onDeepLinking;
    }

    public final boolean AFLogger$LogLevel() {
        return this.onDeepLinkingNative;
    }

    public final boolean AppsFlyer2dXConversionCallback() {
        return this.onAppOpenAttributionNative;
    }

    public String getLevel() {
        return m.AFInAppEventParameterName((Map<String, ?>) AFInAppEventType()).toString();
    }
}
