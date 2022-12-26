package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzqa {
    private final byte[] buffer;
    private final zzqj zzawd;

    private zzqa(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zzawd = zzqj.zzg(bArr);
    }

    public final zzps zzng() {
        if (this.zzawd.zzoi() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        return new zzqc(this.buffer);
    }

    public final zzqj zznh() {
        return this.zzawd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzqa(int i, zzpt zzptVar) {
        this(i);
    }
}
