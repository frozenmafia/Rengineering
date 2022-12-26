package com.dreampay.commons.upi;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class UpiAppStatus {
    private final String appName;
    private final boolean isAvailable;
    private boolean isBlackListed;
    private UpiAppHealth upiAppHealth;

    public UpiAppStatus(String str, boolean z, boolean z2, UpiAppHealth upiAppHealth) {
        runAnimators.ag$a(str, "appName");
        this.appName = str;
        this.isAvailable = z;
        this.isBlackListed = z2;
        this.upiAppHealth = upiAppHealth;
    }

    public /* synthetic */ UpiAppStatus(String str, boolean z, boolean z2, UpiAppHealth upiAppHealth, int i, getTargetTypes gettargettypes) {
        this(str, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : upiAppHealth);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isBlackListed() {
        return this.isBlackListed;
    }

    public final void setBlackListed(boolean z) {
        this.isBlackListed = z;
    }

    public final UpiAppHealth getUpiAppHealth() {
        return this.upiAppHealth;
    }

    public final void setUpiAppHealth(UpiAppHealth upiAppHealth) {
        this.upiAppHealth = upiAppHealth;
    }
}
