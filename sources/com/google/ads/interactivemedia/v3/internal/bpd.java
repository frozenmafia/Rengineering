package com.google.ads.interactivemedia.v3.internal;
/* loaded from: classes4.dex */
public enum bpd {
    DOUBLE(0, bpc.SCALAR, bpv.DOUBLE),
    FLOAT(1, bpc.SCALAR, bpv.FLOAT),
    INT64(2, bpc.SCALAR, bpv.LONG),
    UINT64(3, bpc.SCALAR, bpv.LONG),
    INT32(4, bpc.SCALAR, bpv.INT),
    FIXED64(5, bpc.SCALAR, bpv.LONG),
    FIXED32(6, bpc.SCALAR, bpv.INT),
    BOOL(7, bpc.SCALAR, bpv.BOOLEAN),
    STRING(8, bpc.SCALAR, bpv.STRING),
    MESSAGE(9, bpc.SCALAR, bpv.MESSAGE),
    BYTES(10, bpc.SCALAR, bpv.BYTE_STRING),
    UINT32(11, bpc.SCALAR, bpv.INT),
    ENUM(12, bpc.SCALAR, bpv.ENUM),
    SFIXED32(13, bpc.SCALAR, bpv.INT),
    SFIXED64(14, bpc.SCALAR, bpv.LONG),
    SINT32(15, bpc.SCALAR, bpv.INT),
    SINT64(16, bpc.SCALAR, bpv.LONG),
    GROUP(17, bpc.SCALAR, bpv.MESSAGE),
    DOUBLE_LIST(18, bpc.VECTOR, bpv.DOUBLE),
    FLOAT_LIST(19, bpc.VECTOR, bpv.FLOAT),
    INT64_LIST(20, bpc.VECTOR, bpv.LONG),
    UINT64_LIST(21, bpc.VECTOR, bpv.LONG),
    INT32_LIST(22, bpc.VECTOR, bpv.INT),
    FIXED64_LIST(23, bpc.VECTOR, bpv.LONG),
    FIXED32_LIST(24, bpc.VECTOR, bpv.INT),
    BOOL_LIST(25, bpc.VECTOR, bpv.BOOLEAN),
    STRING_LIST(26, bpc.VECTOR, bpv.STRING),
    MESSAGE_LIST(27, bpc.VECTOR, bpv.MESSAGE),
    BYTES_LIST(28, bpc.VECTOR, bpv.BYTE_STRING),
    UINT32_LIST(29, bpc.VECTOR, bpv.INT),
    ENUM_LIST(30, bpc.VECTOR, bpv.ENUM),
    SFIXED32_LIST(31, bpc.VECTOR, bpv.INT),
    SFIXED64_LIST(32, bpc.VECTOR, bpv.LONG),
    SINT32_LIST(33, bpc.VECTOR, bpv.INT),
    SINT64_LIST(34, bpc.VECTOR, bpv.LONG),
    DOUBLE_LIST_PACKED(35, bpc.PACKED_VECTOR, bpv.DOUBLE),
    FLOAT_LIST_PACKED(36, bpc.PACKED_VECTOR, bpv.FLOAT),
    INT64_LIST_PACKED(37, bpc.PACKED_VECTOR, bpv.LONG),
    UINT64_LIST_PACKED(38, bpc.PACKED_VECTOR, bpv.LONG),
    INT32_LIST_PACKED(39, bpc.PACKED_VECTOR, bpv.INT),
    FIXED64_LIST_PACKED(40, bpc.PACKED_VECTOR, bpv.LONG),
    FIXED32_LIST_PACKED(41, bpc.PACKED_VECTOR, bpv.INT),
    BOOL_LIST_PACKED(42, bpc.PACKED_VECTOR, bpv.BOOLEAN),
    UINT32_LIST_PACKED(43, bpc.PACKED_VECTOR, bpv.INT),
    ENUM_LIST_PACKED(44, bpc.PACKED_VECTOR, bpv.ENUM),
    SFIXED32_LIST_PACKED(45, bpc.PACKED_VECTOR, bpv.INT),
    SFIXED64_LIST_PACKED(46, bpc.PACKED_VECTOR, bpv.LONG),
    SINT32_LIST_PACKED(47, bpc.PACKED_VECTOR, bpv.INT),
    SINT64_LIST_PACKED(48, bpc.PACKED_VECTOR, bpv.LONG),
    GROUP_LIST(49, bpc.VECTOR, bpv.MESSAGE),
    MAP(50, bpc.MAP, bpv.VOID);
    
    private static final bpd[] Z;
    private final int ab;
    private final bpc ac;

    static {
        bpd[] values = values();
        Z = new bpd[values.length];
        for (bpd bpdVar : values) {
            Z[bpdVar.ab] = bpdVar;
        }
    }

    bpd(int i, bpc bpcVar, bpv bpvVar) {
        this.ab = i;
        this.ac = bpcVar;
        bpv bpvVar2 = bpv.VOID;
        bpc bpcVar2 = bpc.SCALAR;
        int ordinal = bpcVar.ordinal();
        if (ordinal == 1) {
            bpvVar.a();
        } else if (ordinal == 3) {
            bpvVar.a();
        }
        if (bpcVar == bpc.SCALAR) {
            bpvVar.ordinal();
        }
    }

    public final int a() {
        return this.ab;
    }
}
