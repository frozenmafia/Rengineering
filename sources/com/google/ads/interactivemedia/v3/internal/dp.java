package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Map;
/* loaded from: classes4.dex */
public final class dp extends dn {
    public final int c;
    public final Map d;

    public dp(int i, IOException iOException, Map map, db dbVar) {
        super("Response code: " + i, iOException, 2004);
        this.c = i;
        this.d = map;
    }
}
