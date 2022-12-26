package com.google.android.datatransport.cct.internal;

import o.PercentLayoutHelper;
/* loaded from: classes7.dex */
public abstract class ClientInfo {
    public abstract ClientType ag$a();

    public abstract PercentLayoutHelper.PercentMarginLayoutParams values();

    /* loaded from: classes7.dex */
    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        ClientType(int i) {
            this.value = i;
        }
    }

    public static ClientInfo$ah$a ah$a() {
        return new PercentLayoutHelper.PercentLayoutParams.valueOf();
    }
}
