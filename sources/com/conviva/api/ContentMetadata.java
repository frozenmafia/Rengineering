package com.conviva.api;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public class ContentMetadata {
    public int HaptikSDK$a;
    public String HaptikSDK$b;
    public boolean HaptikSDK$c;
    @Deprecated
    public int ag$a;
    public String ah$a;
    public int ah$b;
    public String getInitSettings;
    public StreamType invoke;
    public Map<String, String> toString;
    public String valueOf;
    public String values;

    /* loaded from: classes4.dex */
    public enum StreamType {
        UNKNOWN,
        LIVE,
        VOD
    }

    public ContentMetadata() {
        this.ah$a = null;
        this.ag$a = -1;
        this.values = null;
        this.getInitSettings = null;
        this.valueOf = null;
        this.HaptikSDK$b = null;
        this.HaptikSDK$c = false;
        this.invoke = StreamType.UNKNOWN;
        this.HaptikSDK$a = -1;
        this.ah$b = -1;
    }

    public ContentMetadata(ContentMetadata contentMetadata) {
        this.ah$a = null;
        this.ag$a = -1;
        this.values = null;
        this.getInitSettings = null;
        this.valueOf = null;
        this.HaptikSDK$b = null;
        this.HaptikSDK$c = false;
        this.invoke = StreamType.UNKNOWN;
        this.HaptikSDK$a = -1;
        this.ah$b = -1;
        if (contentMetadata == null) {
            return;
        }
        this.ah$a = contentMetadata.ah$a;
        this.ag$a = contentMetadata.ag$a;
        this.values = contentMetadata.values;
        this.HaptikSDK$a = contentMetadata.HaptikSDK$a;
        this.ah$b = contentMetadata.ah$b;
        this.invoke = contentMetadata.invoke;
        this.valueOf = contentMetadata.valueOf;
        this.HaptikSDK$b = contentMetadata.HaptikSDK$b;
        this.HaptikSDK$c = contentMetadata.HaptikSDK$c;
        this.getInitSettings = contentMetadata.getInitSettings;
        Map<String, String> map = contentMetadata.toString;
        if (map == null || map.isEmpty()) {
            return;
        }
        this.toString = new HashMap(contentMetadata.toString);
    }
}
