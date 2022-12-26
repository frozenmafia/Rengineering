package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public enum bsg {
    DOUBLE(bsh.DOUBLE, 1),
    FLOAT(bsh.FLOAT, 5),
    INT64(bsh.LONG, 0),
    UINT64(bsh.LONG, 0),
    INT32(bsh.INT, 0),
    FIXED64(bsh.LONG, 1),
    FIXED32(bsh.INT, 5),
    BOOL(bsh.BOOLEAN, 0),
    STRING(bsh.STRING, 2),
    GROUP(bsh.MESSAGE, 3),
    MESSAGE(bsh.MESSAGE, 2),
    BYTES(bsh.BYTE_STRING, 2),
    UINT32(bsh.INT, 0),
    ENUM(bsh.ENUM, 0),
    SFIXED32(bsh.INT, 5),
    SFIXED64(bsh.LONG, 1),
    SINT32(bsh.INT, 0),
    SINT64(bsh.LONG, 0);
    
    private final bsh t;
    private final int u;

    bsg(bsh bshVar, int i) {
        this.t = bshVar;
        this.u = i;
    }

    public final bsh a() {
        return this.t;
    }
}
