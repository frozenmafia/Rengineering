package com.google.ads.interactivemedia.v3.internal;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class aht extends aho {
    public aht(aln alnVar, HashSet hashSet, JSONObject jSONObject, long j, byte[] bArr) {
        super(alnVar, hashSet, jSONObject, j, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.ads.interactivemedia.v3.internal.ahp
    public final void a(String str) {
        ags a;
        if (!TextUtils.isEmpty(str) && (a = ags.a()) != null) {
            for (agm agmVar : a.c()) {
                if (this.a.contains(agmVar.i())) {
                    agmVar.h().e(str, this.c);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (ahh.i(this.f562b, this.d.c())) {
            return null;
        }
        this.d.g(this.f562b);
        return this.f562b.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahp, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
