package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public enum agp {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String j;

    agp(String str) {
        this.j = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.j;
    }
}
