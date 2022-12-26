package com.google.android.gms.internal.p003firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj  reason: invalid package */
/* loaded from: classes7.dex */
public final class zzacj {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class<?> zzd;
    private static final boolean zze;
    private static final boolean zzf;
    private static final zzaci zzg;
    private static final boolean zzh;
    private static final boolean zzi;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    static {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p003firebaseauthapi.zzacj.<clinit>():void");
    }

    private zzacj() {
    }

    private static int zzA(Class<?> cls) {
        if (zzi) {
            return zzg.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzyg.zza;
        Field zzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (zzC == null) {
            Field zzC2 = zzC(Buffer.class, "address");
            if (zzC2 == null || zzC2.getType() != Long.TYPE) {
                return null;
            }
            return zzC2;
        }
        return zzC;
    }

    private static Field zzC(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        zzaci zzaciVar = zzg;
        int zzj = zzaciVar.zzj(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        zzaciVar.zzn(obj, j2, ((~(255 << i)) & zzj) | ((b2 & 255) << i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j, byte b2) {
        long j2 = (-4) & j;
        zzaci zzaciVar = zzg;
        int i = (((int) j) & 3) << 3;
        int i2 = (b2 & 255) << i;
        zzaciVar.zzn(obj, j2, ((~(255 << i)) & zzaciVar.zzj(obj, j2)) | i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zza(Object obj, long j) {
        return zzg.zza(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzb(Object obj, long j) {
        return zzg.zzb(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(Object obj, long j) {
        return zzg.zzj(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzd(Object obj, long j) {
        return zzg.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zze(Class<T> cls) {
        try {
            return (T) zzc.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzf(Object obj, long j) {
        return zzg.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzacf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zzh(Throwable th) {
        Logger logger = Logger.getLogger(zzacj.class.getName());
        Level level = Level.WARNING;
        String valueOf = String.valueOf(th);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("platform method missing - proto runtime falling back to safer methods: ");
        sb.append(valueOf);
        logger.logp(level, "com.google.protobuf.UnsafeUtil", "logMissingMethod", sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzm(Object obj, long j, boolean z) {
        zzg.zzc(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzn(byte[] bArr, long j, byte b2) {
        zzg.zzd(bArr, zza + j, b2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzo(Object obj, long j, double d) {
        zzg.zze(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzp(Object obj, long j, float f) {
        zzg.zzf(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzq(Object obj, long j, int i) {
        zzg.zzn(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzr(Object obj, long j, long j2) {
        zzg.zzo(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzs(Object obj, long j, Object obj2) {
        zzg.zzp(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzt(Object obj, long j) {
        return ((byte) ((zzg.zzj(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzu(Object obj, long j) {
        return ((byte) ((zzg.zzj(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class<?> cls) {
        int i = zzyg.zza;
        try {
            Class<?> cls2 = zzd;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzw(Object obj, long j) {
        return zzg.zzg(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzx() {
        return zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzy() {
        return zzh;
    }

    private static int zzz(Class<?> cls) {
        if (zzi) {
            return zzg.zzh(cls);
        }
        return -1;
    }
}
