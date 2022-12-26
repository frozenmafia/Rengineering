package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class apv extends apw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public apv(String str, String str2) {
        super(1, str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return jSONObject.optString(h(), (String) g());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(h()))) {
            return bundle.getString("com.google.android.gms.ads.flag.".concat(h()));
        }
        return (String) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(h(), (String) g());
    }
}
