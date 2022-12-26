package com.google.ads.interactivemedia.v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public final class zk {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f1378b = -1;

    private final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = cp.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.f1378b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final boolean a() {
        return (this.a == -1 || this.f1378b == -1) ? false : true;
    }

    public final void b(ao aoVar) {
        for (int i = 0; i < aoVar.a(); i++) {
            an b2 = aoVar.b(i);
            if (b2 instanceof aap) {
                aap aapVar = (aap) b2;
                if ("iTunSMPB".equals(aapVar.f427b) && c(aapVar.c)) {
                    return;
                }
            } else if (b2 instanceof aaw) {
                aaw aawVar = (aaw) b2;
                if ("com.apple.iTunes".equals(aawVar.a) && "iTunSMPB".equals(aawVar.f431b) && c(aawVar.c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
