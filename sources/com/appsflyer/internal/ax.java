package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes3.dex */
public final class ax {
    public final Application AFInAppEventParameterName;
    public final SharedPreferences AFInAppEventType;

    public ax(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.AFInAppEventParameterName = application;
        this.AFInAppEventType = ah.values(application);
    }

    public final boolean AFInAppEventType() {
        ah.AFInAppEventParameterName();
        return ah.values(this.AFInAppEventType, "appsFlyerCount", false) == 0;
    }
}
