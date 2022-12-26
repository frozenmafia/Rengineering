package com.google.android.gms.internal.gtm;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzbfx uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
public class zzug {
    public static final zzug zzbfp;
    public static final zzug zzbfq;
    public static final zzug zzbfr;
    public static final zzug zzbfs;
    public static final zzug zzbft;
    public static final zzug zzbfu;
    public static final zzug zzbfv;
    public static final zzug zzbfw;
    public static final zzug zzbfx;
    public static final zzug zzbfy;
    public static final zzug zzbfz;
    public static final zzug zzbga;
    public static final zzug zzbgb;
    public static final zzug zzbgc;
    public static final zzug zzbgd;
    public static final zzug zzbge;
    public static final zzug zzbgf;
    public static final zzug zzbgg;
    private static final /* synthetic */ zzug[] zzbgj;
    private final zzul zzbgh;
    private final int zzbgi;

    public static zzug[] values() {
        return (zzug[]) zzbgj.clone();
    }

    private zzug(String str, int i, zzul zzulVar, int i2) {
        this.zzbgh = zzulVar;
        this.zzbgi = i2;
    }

    public final zzul zzrs() {
        return this.zzbgh;
    }

    public final int zzrt() {
        return this.zzbgi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzug(String str, int i, zzul zzulVar, int i2, zzuf zzufVar) {
        this(str, i, zzulVar, i2);
    }

    static {
        zzug zzugVar = new zzug("DOUBLE", 0, zzul.DOUBLE, 1);
        zzbfp = zzugVar;
        zzug zzugVar2 = new zzug("FLOAT", 1, zzul.FLOAT, 5);
        zzbfq = zzugVar2;
        zzug zzugVar3 = new zzug("INT64", 2, zzul.LONG, 0);
        zzbfr = zzugVar3;
        zzug zzugVar4 = new zzug("UINT64", 3, zzul.LONG, 0);
        zzbfs = zzugVar4;
        zzug zzugVar5 = new zzug("INT32", 4, zzul.INT, 0);
        zzbft = zzugVar5;
        zzug zzugVar6 = new zzug("FIXED64", 5, zzul.LONG, 1);
        zzbfu = zzugVar6;
        zzug zzugVar7 = new zzug("FIXED32", 6, zzul.INT, 5);
        zzbfv = zzugVar7;
        zzug zzugVar8 = new zzug("BOOL", 7, zzul.BOOLEAN, 0);
        zzbfw = zzugVar8;
        final zzul zzulVar = zzul.STRING;
        zzug zzugVar9 = new zzug("STRING", 8, zzulVar, 2) { // from class: com.google.android.gms.internal.gtm.zzuh
        };
        zzbfx = zzugVar9;
        final zzul zzulVar2 = zzul.MESSAGE;
        zzug zzugVar10 = new zzug("GROUP", 9, zzulVar2, 3) { // from class: com.google.android.gms.internal.gtm.zzui
        };
        zzbfy = zzugVar10;
        final zzul zzulVar3 = zzul.MESSAGE;
        zzug zzugVar11 = new zzug("MESSAGE", 10, zzulVar3, 2) { // from class: com.google.android.gms.internal.gtm.zzuj
        };
        zzbfz = zzugVar11;
        final zzul zzulVar4 = zzul.BYTE_STRING;
        zzug zzugVar12 = new zzug("BYTES", 11, zzulVar4, 2) { // from class: com.google.android.gms.internal.gtm.zzuk
        };
        zzbga = zzugVar12;
        zzug zzugVar13 = new zzug("UINT32", 12, zzul.INT, 0);
        zzbgb = zzugVar13;
        zzug zzugVar14 = new zzug("ENUM", 13, zzul.ENUM, 0);
        zzbgc = zzugVar14;
        zzug zzugVar15 = new zzug("SFIXED32", 14, zzul.INT, 5);
        zzbgd = zzugVar15;
        zzug zzugVar16 = new zzug("SFIXED64", 15, zzul.LONG, 1);
        zzbge = zzugVar16;
        zzug zzugVar17 = new zzug("SINT32", 16, zzul.INT, 0);
        zzbgf = zzugVar17;
        zzug zzugVar18 = new zzug("SINT64", 17, zzul.LONG, 0);
        zzbgg = zzugVar18;
        zzbgj = new zzug[]{zzugVar, zzugVar2, zzugVar3, zzugVar4, zzugVar5, zzugVar6, zzugVar7, zzugVar8, zzugVar9, zzugVar10, zzugVar11, zzugVar12, zzugVar13, zzugVar14, zzugVar15, zzugVar16, zzugVar17, zzugVar18};
    }
}
