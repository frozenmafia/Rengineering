package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class zztd extends zztc<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zztd(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.gtm.zztc
    public final void zzmi() {
        if (!isImmutable()) {
            for (int i = 0; i < zzra(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzbv = zzbv(i);
                if (((zzqv) zzbv.getKey()).zzoz()) {
                    zzbv.setValue(Collections.unmodifiableList((List) zzbv.getValue()));
                }
            }
            Iterator it = zzrb().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((zzqv) entry.getKey()).zzoz()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzmi();
    }
}
