package o;

import com.google.android.gms.internal.p003firebaseauthapi.zzll;
import java.util.HashMap;
import java.util.Map;
import o.LinearLayoutManager;
/* loaded from: classes5.dex */
public final class assignFromView {
    private static final com.google.android.gms.common.logging.Logger ag$a = new com.google.android.gms.common.logging.Logger("GetTokenResultFactory", new String[0]);

    public static findViewByPosition valueOf(String str) {
        Map hashMap;
        try {
            hashMap = LinearLayoutManager.LayoutChunkResult.ah$a(str);
        } catch (zzll e) {
            ag$a.e("Error parsing token claims", e, new Object[0]);
            hashMap = new HashMap();
        }
        return new findViewByPosition(str, hashMap);
    }
}
