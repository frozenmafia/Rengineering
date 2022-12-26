package com.google.ads.interactivemedia.v3.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
/* loaded from: classes4.dex */
public final class alp extends alo {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public long f628b;
    public String c;
    public String d;
    public String e;

    public alp() {
        this.a = ExifInterface.LONGITUDE_EAST;
        this.f628b = -1L;
        this.c = ExifInterface.LONGITUDE_EAST;
        this.d = ExifInterface.LONGITUDE_EAST;
        this.e = ExifInterface.LONGITUDE_EAST;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.alo
    protected final HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.a);
        hashMap.put(4, this.e);
        hashMap.put(3, this.d);
        hashMap.put(2, this.c);
        hashMap.put(1, Long.valueOf(this.f628b));
        return hashMap;
    }

    public alp(String str) {
        String str2 = ExifInterface.LONGITUDE_EAST;
        this.a = ExifInterface.LONGITUDE_EAST;
        this.f628b = -1L;
        this.c = ExifInterface.LONGITUDE_EAST;
        this.d = ExifInterface.LONGITUDE_EAST;
        this.e = ExifInterface.LONGITUDE_EAST;
        HashMap a = a(str);
        if (a != null) {
            this.a = a.get(0) == null ? ExifInterface.LONGITUDE_EAST : (String) a.get(0);
            this.f628b = a.get(1) != null ? ((Long) a.get(1)).longValue() : -1L;
            this.c = a.get(2) == null ? ExifInterface.LONGITUDE_EAST : (String) a.get(2);
            this.d = a.get(3) == null ? ExifInterface.LONGITUDE_EAST : (String) a.get(3);
            this.e = a.get(4) != null ? (String) a.get(4) : str2;
        }
    }
}
