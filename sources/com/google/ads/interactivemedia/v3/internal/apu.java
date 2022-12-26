package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class apu extends apw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public apu(String str, Float f) {
        super(1, str, f);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(h(), ((Float) g()).floatValue()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object b(Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.ads.flag.".concat(h()))) {
            return Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(h())));
        }
        return (Float) g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.apw
    public final /* synthetic */ Object c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(h(), ((Float) g()).floatValue()));
    }
}
