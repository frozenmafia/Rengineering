package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class apr extends apw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public apr(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(h(), ((Boolean) g()).booleanValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(h()))) {
            return Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(h())));
        }
        return (Boolean) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(h(), ((Boolean) g()).booleanValue()));
    }
}
