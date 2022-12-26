package com.google.android.gms.internal.p003firebaseauthapi;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacp  reason: invalid package */
/* loaded from: classes7.dex */
public enum zzacp {
    DOUBLE(zzacq.DOUBLE, 1),
    FLOAT(zzacq.FLOAT, 5),
    INT64(zzacq.LONG, 0),
    UINT64(zzacq.LONG, 0),
    INT32(zzacq.INT, 0),
    FIXED64(zzacq.LONG, 1),
    FIXED32(zzacq.INT, 5),
    BOOL(zzacq.BOOLEAN, 0),
    STRING(zzacq.STRING, 2),
    GROUP(zzacq.MESSAGE, 3),
    MESSAGE(zzacq.MESSAGE, 2),
    BYTES(zzacq.BYTE_STRING, 2),
    UINT32(zzacq.INT, 0),
    ENUM(zzacq.ENUM, 0),
    SFIXED32(zzacq.INT, 5),
    SFIXED64(zzacq.LONG, 1),
    SINT32(zzacq.INT, 0),
    SINT64(zzacq.LONG, 0);
    
    private final zzacq zzt;

    zzacp(zzacq zzacqVar, int i) {
        this.zzt = zzacqVar;
    }

    public final zzacq zza() {
        return this.zzt;
    }
}
