package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class aab {
    public final Object a;

    private aab(String str) {
        this.a = str;
    }

    public static aab a(ci ciVar) {
        String str;
        ciVar.G(2);
        int i = ciVar.i();
        int i2 = i >> 1;
        int i3 = (ciVar.i() >> 3) | ((i & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = i3 < 10 ? ".0" : ".";
        return new aab(str + ".0" + i2 + str2 + i3);
    }
}
