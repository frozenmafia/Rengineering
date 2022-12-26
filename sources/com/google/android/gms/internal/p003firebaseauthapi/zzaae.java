package com.google.android.gms.internal.p003firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaae  reason: invalid package */
/* loaded from: classes7.dex */
public class zzaae extends IOException {
    private zzaaz zza;

    public zzaae(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaad zza() {
        return new zzaad("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzb() {
        return new zzaae("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzc() {
        return new zzaae("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzd() {
        return new zzaae("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zze() {
        return new zzaae("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzf() {
        return new zzaae("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzg() {
        return new zzaae("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaae zzi() {
        return new zzaae("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzaae zzh(zzaaz zzaazVar) {
        this.zza = zzaazVar;
        return this;
    }

    public zzaae(String str) {
        super(str);
        this.zza = null;
    }
}
