package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class aps extends apw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aps(String str, Integer num) {
        super(1, str, num);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(h(), ((Integer) g()).intValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(h()))) {
            return Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(h())));
        }
        return (Integer) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(h(), ((Integer) g()).intValue()));
    }
}
