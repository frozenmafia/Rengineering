package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
/* loaded from: classes7.dex */
public final class zzmx implements Result {
    private final Status zzaen;
    private final int zzasj;
    private final zzmy zzasz;
    private final zznu zzata;

    public zzmx(Status status, int i) {
        this(status, i, null, null);
    }

    public zzmx(Status status, int i, zzmy zzmyVar, zznu zznuVar) {
        this.zzaen = status;
        this.zzasj = i;
        this.zzasz = zzmyVar;
        this.zzata = zznuVar;
    }

    public final zzmy zzll() {
        return this.zzasz;
    }

    public final zznu zzlm() {
        return this.zzata;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzaen;
    }

    public final int getSource() {
        return this.zzasj;
    }

    public final String zzln() {
        int i = this.zzasj;
        if (i == 0) {
            return "Network";
        }
        if (i == 1) {
            return "Saved file on disk";
        }
        if (i == 2) {
            return "Default resource";
        }
        throw new IllegalStateException("Resource source is unknown.");
    }
}
