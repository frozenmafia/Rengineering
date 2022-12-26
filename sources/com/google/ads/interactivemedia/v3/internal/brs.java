package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public final class brs extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public brs() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final bpt a() {
        return new bpt(getMessage());
    }
}
