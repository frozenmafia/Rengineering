package com.fancode.video.drm;
/* loaded from: classes6.dex */
public enum DRMSecurityLevel {
    LEVEL_1("LEVEL_1"),
    LEVEL_2("LEVEL_2"),
    LEVEL_3("LEVEL_3");
    
    private final String name;

    DRMSecurityLevel(String str) {
        this.name = str;
    }

    public static DRMSecurityLevel fromValue(String str) {
        DRMSecurityLevel dRMSecurityLevel = LEVEL_3;
        if (dRMSecurityLevel.name.equalsIgnoreCase(str)) {
            return dRMSecurityLevel;
        }
        DRMSecurityLevel dRMSecurityLevel2 = LEVEL_2;
        return dRMSecurityLevel2.name.equalsIgnoreCase(str) ? dRMSecurityLevel2 : LEVEL_1;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
