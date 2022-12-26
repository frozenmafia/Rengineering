package com.iab.omid.library.giphy.adsession;
/* loaded from: classes7.dex */
public enum AdSessionContextType {
    HTML("html"),
    NATIVE("native");
    
    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
