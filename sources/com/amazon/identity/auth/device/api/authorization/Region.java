package com.amazon.identity.auth.device.api.authorization;

import com.apxor.androidsdk.core.Constants;
/* loaded from: classes.dex */
public enum Region {
    AUTO("AUTO"),
    NA(Constants.NO_SESSION_ID),
    EU("EU"),
    FE("FE");
    

    /* renamed from: a  reason: collision with other field name */
    private String f26a;

    Region(String str) {
        this.f26a = str;
    }

    public String getStringValue() {
        return this.f26a;
    }
}
