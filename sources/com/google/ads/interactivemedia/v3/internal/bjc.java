package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
/* loaded from: classes4.dex */
public enum bjc implements bjd {
    DOUBLE,
    LAZILY_PARSED_NUMBER,
    LONG_OR_DOUBLE,
    BIG_DECIMAL;

    public static final Double b(bnc bncVar) throws IOException {
        return Double.valueOf(bncVar.a());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjd
    public final /* synthetic */ Number a(bnc bncVar) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            return new bjw(bncVar.h());
        }
        return b(bncVar);
    }
}
