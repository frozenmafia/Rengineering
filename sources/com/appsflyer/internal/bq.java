package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFInAppEventType;
/* loaded from: classes6.dex */
public final class bq extends bk {
    public bq(Context context) {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE, context);
    }

    @Override // com.appsflyer.internal.h
    public final h AFInAppEventParameterName(String str) {
        return super.AFInAppEventParameterName(values(str));
    }
}
