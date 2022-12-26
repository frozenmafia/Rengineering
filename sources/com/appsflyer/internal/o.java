package com.appsflyer.internal;
/* loaded from: classes3.dex */
public final class o {
    public final long AFInAppEventParameterName;
    public final String AFKeystoreWrapper;
    private final boolean valueOf;

    /* loaded from: classes3.dex */
    public interface d {
        void AFInAppEventType(String str, String str2, String str3);

        void values(String str);
    }

    o() {
    }

    public o(String str, long j, boolean z) {
        this.AFKeystoreWrapper = str;
        this.AFInAppEventParameterName = j;
        this.valueOf = z;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
