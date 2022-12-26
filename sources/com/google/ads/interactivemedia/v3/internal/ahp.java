package com.google.ads.interactivemedia.v3.internal;

import android.os.AsyncTask;
/* loaded from: classes4.dex */
public abstract class ahp extends AsyncTask {
    private ahq a;
    protected final aln d;

    public ahp(aln alnVar, byte[] bArr) {
        this.d = alnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        ahq ahqVar = this.a;
        if (ahqVar != null) {
            ahqVar.b();
        }
    }

    public final void b(ahq ahqVar) {
        this.a = ahqVar;
    }
}
