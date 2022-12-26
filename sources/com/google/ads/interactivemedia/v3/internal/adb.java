package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final class adb {
    private static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static long a(String str) throws NumberFormatException {
        String[] al = cp.al(str, "\\.");
        long j = 0;
        for (String str2 : cp.ak(al[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (al.length == 2) {
            j2 += Long.parseLong(al[1]);
        }
        return j2 * 1000;
    }

    public static Matcher b(ci ciVar) {
        String r;
        while (true) {
            String r2 = ciVar.r();
            if (r2 == null) {
                return null;
            }
            if (a.matcher(r2).matches()) {
                do {
                    r = ciVar.r();
                    if (r != null) {
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = ada.a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static void c(ci ciVar) throws as {
        int c = ciVar.c();
        if (d(ciVar)) {
            return;
        }
        ciVar.F(c);
        throw as.a("Expected WEBVTT. Got ".concat(String.valueOf(ciVar.r())), null);
    }

    public static boolean d(ci ciVar) {
        String r = ciVar.r();
        return r != null && r.startsWith("WEBVTT");
    }
}
