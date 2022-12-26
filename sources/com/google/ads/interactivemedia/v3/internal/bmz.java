package com.google.ads.interactivemedia.v3.internal;

import java.sql.Date;
import java.sql.Timestamp;
/* loaded from: classes4.dex */
public final class bmz {
    public static final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final bku f894b;
    public static final bku c;
    public static final bjg d;
    public static final bjg e;
    public static final bjg f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        bjg bjgVar = null;
        if (z) {
            f894b = new bmx(Date.class);
            c = new bmy(Timestamp.class);
            d = bmt.a;
            e = bmv.a;
            bjgVar = bmw.a;
        } else {
            f894b = null;
            c = null;
            d = null;
            e = null;
        }
        f = bjgVar;
    }
}
