package com.fancode.video.drm;
/* loaded from: classes6.dex */
public enum DRMType {
    NONE("NONE"),
    WIDEVINE("WIDEVINE"),
    PLAYREADY("PLAYREADY");
    
    private final String name;

    DRMType(String str) {
        this.name = str;
    }

    public static DRMType fromValue(String str) {
        DRMType dRMType = WIDEVINE;
        if (dRMType.name.equalsIgnoreCase(str)) {
            return dRMType;
        }
        DRMType dRMType2 = PLAYREADY;
        return dRMType2.name.equalsIgnoreCase(str) ? dRMType2 : NONE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
