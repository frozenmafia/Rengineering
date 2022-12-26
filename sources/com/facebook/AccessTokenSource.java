package com.facebook;

import java.util.Arrays;
/* loaded from: classes4.dex */
public enum AccessTokenSource {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);
    
    private final boolean canExtendToken;

    AccessTokenSource(boolean z) {
        this.canExtendToken = z;
    }

    public final boolean canExtendToken() {
        return this.canExtendToken;
    }

    public final boolean fromInstagram() {
        int i = AccessTokenSource$ag$a.toString[ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AccessTokenSource[] valuesCustom() {
        AccessTokenSource[] valuesCustom = values();
        return (AccessTokenSource[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
