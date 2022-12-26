package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzal implements Callable<Void> {
    private final /* synthetic */ zzae zzvw;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzae zzaeVar) {
        this.zzvw = zzaeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() throws Exception {
        zzbb zzbbVar;
        zzbbVar = this.zzvw.zzvu;
        zzbbVar.zzeb();
        return null;
    }
}
