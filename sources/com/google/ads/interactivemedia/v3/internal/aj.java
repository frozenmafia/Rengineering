package com.google.ads.interactivemedia.v3.internal;

import java.util.HashSet;
/* loaded from: classes4.dex */
public final class aj {
    private static final HashSet a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private static String f583b = "media3.common";

    public static String a() {
        String str;
        synchronized (aj.class) {
            str = f583b;
        }
        return str;
    }

    public static void b(String str) {
        synchronized (aj.class) {
            if (a.add(str)) {
                String str2 = f583b;
                f583b = str2 + ", " + str;
            }
        }
    }
}
