package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes7.dex */
public final class zzbh extends zzan {
    private volatile String zzut;
    private Future<String> zzyh;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbh(zzap zzapVar) {
        super(zzapVar);
    }

    @Override // com.google.android.gms.internal.gtm.zzan
    protected final void zzaw() {
    }

    public final String zzeh() {
        String str;
        zzdb();
        synchronized (this) {
            if (this.zzut == null) {
                this.zzyh = zzcq().zza(new zzbi(this));
            }
            Future<String> future = this.zzyh;
            if (future != null) {
                try {
                    this.zzut = future.get();
                } catch (InterruptedException e) {
                    zzd("ClientId loading or generation was interrupted", e);
                    this.zzut = SessionDescription.SUPPORTED_SDP_VERSION;
                } catch (ExecutionException e2) {
                    zze("Failed to load or generate client id", e2);
                    this.zzut = SessionDescription.SUPPORTED_SDP_VERSION;
                }
                if (this.zzut == null) {
                    this.zzut = SessionDescription.SUPPORTED_SDP_VERSION;
                }
                zza("Loaded clientId", this.zzut);
                this.zzyh = null;
            }
            str = this.zzut;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzei() {
        synchronized (this) {
            this.zzut = null;
            this.zzyh = zzcq().zza(new zzbj(this));
        }
        return zzeh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String zzej() {
        String zzd = zzd(zzcq().getContext());
        return zzd == null ? zzek() : zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String zzek() {
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            return !zzb(zzcq().getContext(), lowerCase) ? SessionDescription.SUPPORTED_SDP_VERSION : lowerCase;
        } catch (Exception e) {
            zze("Error saving clientId file", e);
            return SessionDescription.SUPPORTED_SDP_VERSION;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0066: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:31:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String zzd(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.String r0 = "gaClientId"
            java.lang.String r1 = "Failed to close client id reading stream"
            java.lang.String r2 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.Preconditions.checkNotMainThread(r2)
            r2 = 0
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6e java.io.FileNotFoundException -> L8e
            r4 = 36
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r6 = 0
            int r4 = r3.read(r5, r6, r4)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            int r7 = r3.available()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            if (r7 <= 0) goto L33
            java.lang.String r4 = "clientId file seems corrupted, deleting it."
            r8.zzt(r4)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r3.close()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r9.deleteFile(r0)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            if (r3 == 0) goto L32
            r3.close()     // Catch: java.io.IOException -> L2e
            goto L32
        L2e:
            r9 = move-exception
            r8.zze(r1, r9)
        L32:
            return r2
        L33:
            r7 = 14
            if (r4 >= r7) goto L4d
            java.lang.String r4 = "clientId file is empty, deleting it."
            r8.zzt(r4)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r3.close()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r9.deleteFile(r0)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            if (r3 == 0) goto L4c
            r3.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r9 = move-exception
            r8.zze(r1, r9)
        L4c:
            return r2
        L4d:
            r3.close()     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            java.lang.String r4 = "Read client id from disk"
            r8.zza(r4, r7)     // Catch: java.lang.Throwable -> L65 java.io.IOException -> L68 java.io.FileNotFoundException -> L6a
            if (r3 == 0) goto L64
            r3.close()     // Catch: java.io.IOException -> L60
            goto L64
        L60:
            r9 = move-exception
            r8.zze(r1, r9)
        L64:
            return r7
        L65:
            r9 = move-exception
            r2 = r3
            goto L83
        L68:
            r4 = move-exception
            goto L70
        L6a:
            goto L8f
        L6c:
            r9 = move-exception
            goto L83
        L6e:
            r4 = move-exception
            r3 = r2
        L70:
            java.lang.String r5 = "Error reading client id file, deleting it"
            r8.zze(r5, r4)     // Catch: java.lang.Throwable -> L65
            r9.deleteFile(r0)     // Catch: java.lang.Throwable -> L65
            if (r3 == 0) goto L82
            r3.close()     // Catch: java.io.IOException -> L7e
            goto L82
        L7e:
            r9 = move-exception
            r8.zze(r1, r9)
        L82:
            return r2
        L83:
            if (r2 == 0) goto L8d
            r2.close()     // Catch: java.io.IOException -> L89
            goto L8d
        L89:
            r0 = move-exception
            r8.zze(r1, r0)
        L8d:
            throw r9
        L8e:
            r3 = r2
        L8f:
            if (r3 == 0) goto L99
            r3.close()     // Catch: java.io.IOException -> L95
            goto L99
        L95:
            r9 = move-exception
            r8.zze(r1, r9)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzbh.zzd(android.content.Context):java.lang.String");
    }

    private final boolean zzb(Context context, String str) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotMainThread("ClientId should be saved from worker thread");
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    zza("Storing clientId", str);
                    fileOutputStream = context.openFileOutput("gaClientId", 0);
                    fileOutputStream.write(str.getBytes());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return true;
                        } catch (IOException e) {
                            zze("Failed to close clientId writing stream", e);
                            return true;
                        }
                    }
                    return true;
                } catch (FileNotFoundException e2) {
                    zze("Error creating clientId file", e2);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e3) {
                            zze("Failed to close clientId writing stream", e3);
                        }
                    }
                    return false;
                }
            } catch (IOException e4) {
                zze("Error writing to clientId file", e4);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        zze("Failed to close clientId writing stream", e5);
                    }
                }
                return false;
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e6) {
                    zze("Failed to close clientId writing stream", e6);
                }
            }
            throw th;
        }
    }
}
