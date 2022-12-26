package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Locale;
import java.util.StringTokenizer;
/* loaded from: classes4.dex */
final class bmb extends bjf {
    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ Object read(bnc bncVar) throws IOException {
        if (bncVar.r() == 9) {
            bncVar.m();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(bncVar.h(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (nextToken2 == null && nextToken3 == null) {
            return new Locale(nextToken);
        }
        if (nextToken3 == null) {
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, nextToken3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjf
    public final /* synthetic */ void write(bne bneVar, Object obj) throws IOException {
        Locale locale = (Locale) obj;
        bneVar.k(locale == null ? null : locale.toString());
    }
}
