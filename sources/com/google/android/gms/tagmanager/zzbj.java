package com.google.android.gms.tagmanager;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zzbj extends zzce {
    @Override // com.google.android.gms.tagmanager.zzcd
    public final void zzb(String str, Map map) {
        Map map2;
        Map map3;
        CustomTagProvider customTagProvider;
        Object zza;
        Map map4;
        map2 = zzbf.zzagn;
        if (map2.containsKey(str)) {
            map3 = zzbf.zzagn;
            customTagProvider = (CustomTagProvider) map3.get(str);
        } else {
            zza = zzbf.zza(str, CustomTagProvider.class);
            customTagProvider = (CustomTagProvider) zza;
            map4 = zzbf.zzagn;
            map4.put(str, customTagProvider);
        }
        if (customTagProvider != null) {
            customTagProvider.execute(map);
        }
    }

    @Override // com.google.android.gms.tagmanager.zzcd
    public final String zzc(String str, Map map) {
        Map map2;
        Map map3;
        CustomVariableProvider customVariableProvider;
        Object zza;
        Map map4;
        map2 = zzbf.zzago;
        if (!map2.containsKey(str)) {
            zza = zzbf.zza(str, CustomVariableProvider.class);
            customVariableProvider = (CustomVariableProvider) zza;
            map4 = zzbf.zzago;
            map4.put(str, customVariableProvider);
        } else {
            map3 = zzbf.zzago;
            customVariableProvider = (CustomVariableProvider) map3.get(str);
        }
        if (customVariableProvider != null) {
            return customVariableProvider.getValue(map);
        }
        return null;
    }
}
