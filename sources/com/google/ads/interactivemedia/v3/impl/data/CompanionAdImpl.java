package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.api.CompanionAd;
import com.google.ads.interactivemedia.v3.internal.btn;
import com.google.ads.interactivemedia.v3.internal.btp;
/* loaded from: classes7.dex */
public class CompanionAdImpl implements CompanionAd {
    private String apiFramework;
    private String resourceValue;
    private bx size = bx.create(0, 0);

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return btn.c(this, obj, new String[0]);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getApiFramework() {
        return this.apiFramework;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getHeight() {
        return this.size.height().intValue();
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public String getResourceValue() {
        return this.resourceValue;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CompanionAd
    public int getWidth() {
        return this.size.width().intValue();
    }

    public int hashCode() {
        return btp.a(this, new String[0]);
    }

    void setApiFramework(String str) {
        this.apiFramework = str;
    }

    void setResourceValue(String str) {
        this.resourceValue = str;
    }

    void setSize(bx bxVar) {
        this.size = bxVar;
    }

    public String toString() {
        String str = this.apiFramework;
        String str2 = this.resourceValue;
        Integer width = this.size.width();
        Integer height = this.size.height();
        return "CompanionAd [apiFramework=" + str + ", resourceUrl=" + str2 + ", width=" + width + ", height=" + height + "]";
    }
}
