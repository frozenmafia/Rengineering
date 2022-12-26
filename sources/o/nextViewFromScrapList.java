package o;

import android.text.TextUtils;
import com.google.android.gms.internal.p003firebaseauthapi.zzwu;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class nextViewFromScrapList {
    public static MultiFactorInfo ag$a(zzwu zzwuVar) {
        if (zzwuVar == null || TextUtils.isEmpty(zzwuVar.zze())) {
            return null;
        }
        return new PhoneMultiFactorInfo(zzwuVar.zzd(), zzwuVar.zzc(), zzwuVar.zza(), com.google.android.gms.common.internal.Preconditions.checkNotEmpty(zzwuVar.zze()));
    }

    public static List<MultiFactorInfo> ah$a(List<zzwu> list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (zzwu zzwuVar : list) {
            MultiFactorInfo ag$a = ag$a(zzwuVar);
            if (ag$a != null) {
                arrayList.add(ag$a);
            }
        }
        return arrayList;
    }
}
