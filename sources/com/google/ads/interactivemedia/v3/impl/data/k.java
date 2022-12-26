package com.google.ads.interactivemedia.v3.impl.data;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
/* loaded from: classes4.dex */
public final /* synthetic */ class k {
    public static Application a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    public static boolean b(Context context, TestingConfiguration testingConfiguration) {
        if (testingConfiguration == null || !testingConfiguration.forceTvMode()) {
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }
        return true;
    }
}
