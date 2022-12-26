package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class zabg {
    private final zabf zaa;

    /* JADX INFO: Access modifiers changed from: protected */
    public zabg(zabf zabfVar) {
        this.zaa = zabfVar;
    }

    protected abstract void zaa();

    public final void zab(zabi zabiVar) {
        Lock zah;
        zabi.zah(zabiVar).lock();
        try {
            if (zabi.zag(zabiVar) != this.zaa) {
                zah = zabi.zah(zabiVar);
            } else {
                zaa();
                zah = zabi.zah(zabiVar);
            }
            zah.unlock();
        } catch (Throwable th) {
            zabi.zah(zabiVar).unlock();
            throw th;
        }
    }
}
