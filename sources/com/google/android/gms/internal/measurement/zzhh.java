package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;
/* loaded from: classes7.dex */
public final class zzhh {
    private final SimpleArrayMap zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhh(SimpleArrayMap simpleArrayMap) {
        this.zza = simpleArrayMap;
    }

    public final String zza(Uri uri, String str, String str2, String str3) {
        if (uri != null) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) this.zza.get(uri.toString());
            if (simpleArrayMap == null) {
                return null;
            }
            return (String) simpleArrayMap.get("".concat(String.valueOf(str3)));
        }
        return null;
    }
}
