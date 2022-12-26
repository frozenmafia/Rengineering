package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class bn extends bs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bn(String str, Runnable runnable) {
        super(str, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(Context context, av<Map<String, Object>> avVar) {
        ah.AFInAppEventParameterName();
        if (ah.values(ah.values(context), "appsFlyerCount", false) > 0 || !avVar.AFKeystoreWrapper()) {
            return;
        }
        new Thread(avVar.AFInAppEventParameterName).start();
        AFInAppEventType();
    }
}
