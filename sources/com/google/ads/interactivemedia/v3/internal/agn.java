package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public enum agn {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");
    
    private final String g;

    agn(String str) {
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
