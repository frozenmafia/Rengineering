package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzia implements Runnable {
    final /* synthetic */ zzib zza;
    private final URL zzb;
    private final String zzc;
    private final zzfp zzd;

    public zzia(zzib zzibVar, String str, URL url, byte[] bArr, Map map, zzfp zzfpVar, byte[] bArr2) {
        this.zza = zzibVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzfpVar);
        this.zzb = url;
        this.zzd = zzfpVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaz().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzhz
            @Override // java.lang.Runnable
            public final void run() {
                zzia.this.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzib r0 = r10.zza
            r0.zzax()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzib r2 = r10.zza     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            java.net.URL r3 = r10.zzb     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            if (r4 == 0) goto L84
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            com.google.android.gms.measurement.internal.zzfr r4 = r2.zzt     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r4.zzf()     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            com.google.android.gms.measurement.internal.zzfr r2 = r2.zzt     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r2.zzf()     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L7a
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L66
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L66
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L66
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5d
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L5d:
            if (r3 == 0) goto L62
            r3.disconnect()
        L62:
            r10.zzb(r2, r1, r0, r4)
            return
        L66:
            r0 = move-exception
            goto L6a
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L72
        L70:
            r0 = move-exception
            goto L76
        L72:
            r0 = move-exception
            goto L7c
        L74:
            r0 = move-exception
            r4 = r1
        L76:
            r9 = r2
            r2 = r0
            r0 = r9
            goto L8f
        L7a:
            r0 = move-exception
            r4 = r1
        L7c:
            r9 = r2
            r2 = r0
            r0 = r9
            goto L9b
        L80:
            r2 = move-exception
            goto L8e
        L82:
            r2 = move-exception
            goto L9a
        L84:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
            throw r2     // Catch: java.lang.Throwable -> L8c java.io.IOException -> L98
        L8c:
            r2 = move-exception
            r3 = r1
        L8e:
            r4 = r1
        L8f:
            if (r3 == 0) goto L94
            r3.disconnect()
        L94:
            r10.zzb(r0, r1, r1, r4)
            throw r2
        L98:
            r2 = move-exception
            r3 = r1
        L9a:
            r4 = r1
        L9b:
            if (r3 == 0) goto La0
            r3.disconnect()
        La0:
            r10.zzb(r0, r2, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzia.run():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzfp zzfpVar = this.zzd;
        zzfpVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
