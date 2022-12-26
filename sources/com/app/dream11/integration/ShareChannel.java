package com.app.dream11.integration;
/* loaded from: classes.dex */
public enum ShareChannel {
    WHATSAPP("com.whatsapp"),
    MESSENGER("com.facebook.orca"),
    TELEGRAM("org.telegram.messenger"),
    ALL("");
    
    private String packageName;

    ShareChannel(String str) {
        this.packageName = str;
    }

    public String getPackageName() {
        return this.packageName;
    }
}
