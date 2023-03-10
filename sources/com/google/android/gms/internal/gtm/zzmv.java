package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.api.Status;
import org.json.JSONException;
/* loaded from: classes7.dex */
final class zzmv implements zzms {
    @Override // com.google.android.gms.internal.gtm.zzms
    public final zzmx zze(byte[] bArr) throws zzml {
        if (bArr == null) {
            throw new zzml("Cannot parse a null byte[]");
        }
        if (bArr.length == 0) {
            throw new zzml("Cannot parse a 0 length byte[]");
        }
        try {
            zznu zzce = zzmm.zzce(new String(bArr));
            if (zzce != null) {
                zzev.zzab("The runtime configuration was successfully parsed from the resource");
            }
            return new zzmx(Status.RESULT_SUCCESS, 0, null, zzce);
        } catch (zzml unused) {
            throw new zzml("The resource data is invalid. The runtime  configuration cannot be extracted from the JSON data");
        } catch (JSONException unused2) {
            throw new zzml("The resource data is corrupted. The runtime configuration cannot be extracted from the JSON data");
        }
    }
}
