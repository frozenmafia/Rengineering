package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes7.dex */
public enum bsw implements bpm {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);
    
    private static final bpn i = new btc(1);
    private final int k;

    bsw(int i2) {
        this.k = i2;
    }

    public static bpn a() {
        return i;
    }

    public static bsw b(int i2) {
        switch (i2) {
            case 0:
                return DF_NONE;
            case 1:
                return DF_HTTPHEADER;
            case 2:
                return DF_COOKIE;
            case 3:
                return DF_URL;
            case 4:
                return DF_CGI_ARGS;
            case 5:
                return DF_HOST_ORDER;
            case 6:
                return DF_BYTE_SWAPPED;
            case 7:
                return DF_LOGGING_ELEMENT_TYPE_ID;
            default:
                return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpm
    public final int getNumber() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
