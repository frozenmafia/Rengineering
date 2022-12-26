package o;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public final class setOnPreferenceTreeClickListener {
    private static final Set ah$a = new HashSet(Arrays.asList("app_update", "review"));
    private static final Set values = new HashSet(Arrays.asList("native", "unity"));
    private static final Map valueOf = new HashMap();
    private static final setPreferences toString = new setPreferences("PlayCoreVersion");

    public static Map toString(String str) {
        Map map;
        synchronized (setOnPreferenceTreeClickListener.class) {
            Map map2 = valueOf;
            if (!map2.containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11004);
                map2.put("app_update", hashMap);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }

    public static Bundle valueOf(String str) {
        Bundle bundle = new Bundle();
        Map setonpreferencetreeclicklistener = toString("app_update");
        bundle.putInt("playcore_version_code", ((Integer) setonpreferencetreeclicklistener.get("java")).intValue());
        if (setonpreferencetreeclicklistener.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) setonpreferencetreeclicklistener.get("native")).intValue());
        }
        if (setonpreferencetreeclicklistener.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) setonpreferencetreeclicklistener.get("unity")).intValue());
        }
        return bundle;
    }
}
