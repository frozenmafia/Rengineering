package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.btn;
import com.google.ads.interactivemedia.v3.internal.btp;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class bn {
    public int errorCode;
    public String errorMessage;
    public String innerError;
    public String type;

    public Map<String, String> constructMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", this.type);
        hashMap.put("errorCode", String.valueOf(this.errorCode));
        hashMap.put("errorMessage", this.errorMessage);
        String str = this.innerError;
        if (str != null) {
            hashMap.put("innerError", str);
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return btn.c(this, obj, new String[0]);
    }

    public int hashCode() {
        return btp.a(this, new String[0]);
    }

    public String toString() {
        return String.format("Log[type=%s, errorCode=%s, errorMessage=%s, innerError=%s]", this.type, Integer.valueOf(this.errorCode), this.errorMessage, this.innerError);
    }
}
