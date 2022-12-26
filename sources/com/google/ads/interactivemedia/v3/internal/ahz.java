package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes4.dex */
public final class ahz implements AdEvent {
    private final AdEvent.AdEventType a;

    /* renamed from: b  reason: collision with root package name */
    private final Ad f566b;
    private final Map c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ahz(AdEvent.AdEventType adEventType, Ad ad, Map map) {
        this.a = adEventType;
        this.f566b = ad;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ahz) {
            ahz ahzVar = (ahz) obj;
            return this.a == ahzVar.a && atc.o(this.f566b, ahzVar.f566b) && atc.o(this.c, ahzVar.c);
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Ad getAd() {
        return this.f566b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final Map<String, String> getAdData() {
        return this.c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdEvent
    public final AdEvent.AdEventType getType() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f566b, this.c});
    }

    public final String toString() {
        String format;
        String format2 = String.format("AdEvent[type=%s, ad=%s", this.a, this.f566b);
        if (this.c == null) {
            format = "]";
        } else {
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder("{");
            Iterator it = this.c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append(": ");
                sb.append((String) entry.getValue());
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            objArr[0] = sb.toString();
            format = String.format(", adData=%s]", objArr);
        }
        return String.valueOf(format2).concat(String.valueOf(format));
    }
}
