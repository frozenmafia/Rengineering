package com.google.android.gms.internal.p003firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.LibraryVersion;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk  reason: invalid package */
/* loaded from: classes5.dex */
public final class zzuk {
    private final int zza;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0062 -> B:15:0x0063). Please submit an issue!!! */
    public zzuk(String str) {
        List<String> zzd;
        char c = 0;
        int i = 2;
        i = 2;
        i = 2;
        int i2 = 2;
        int i3 = 3;
        i3 = 3;
        i3 = 3;
        int i4 = 3;
        try {
            zzd = zzae.zzc("[.-]").zzd(str);
        } catch (IllegalArgumentException e) {
            ?? isLoggable = Log.isLoggable("LibraryVersionContainer", i3);
            i2 = i;
            i4 = isLoggable;
            if (isLoggable != 0) {
                ?? r1 = new Object[i];
                r1[c] = str;
                r1[1] = e;
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", r1));
                i2 = r1;
                i4 = isLoggable;
            }
        }
        if (zzd.size() == 1) {
            str = Integer.parseInt(str);
        } else {
            if (zzd.size() >= 3) {
                c = 16960;
                str = Integer.parseInt(zzd.get(2)) + (Integer.parseInt(zzd.get(0)) * 1000000) + (Integer.parseInt(zzd.get(1)) * 1000);
            }
            str = -1;
            i = i2;
            i3 = i4;
        }
        this.zza = str;
    }

    public static zzuk zza() {
        return new zzuk(zzc());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzc() {
        String version = LibraryVersion.getInstance().getVersion("firebase-auth");
        return (TextUtils.isEmpty(version) || version.equals("UNKNOWN")) ? "-1" : version;
    }

    public final String zzb() {
        return String.format("X%s", Integer.toString(this.zza));
    }
}
