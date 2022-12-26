package com.fancode.video.drm;
/* loaded from: classes4.dex */
public enum DRMProvider {
    INTER_TRUST("INTER_TRUST");
    
    private final String name;

    DRMProvider(String str) {
        this.name = str;
    }

    public static DRMProvider fromValue(String str) {
        return INTER_TRUST;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
