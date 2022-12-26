package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class apt extends apw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public apt(String str, Long l) {
        super(1, str, l);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(h(), ((Long) g()).longValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(h()))) {
            return Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(h())));
        }
        return (Long) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(h(), ((Long) g()).longValue()));
    }
}
