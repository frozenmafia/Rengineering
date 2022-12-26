package o;

import android.os.Bundle;
import com.sendbird.android.constant.StringSet;
/* loaded from: classes7.dex */
public final class setDy$ag$a {
    public static androidx.collection.ArrayMap<String, String> ag$a(Bundle bundle) {
        androidx.collection.ArrayMap<String, String> arrayMap = new androidx.collection.ArrayMap<>();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals(StringSet.message_type) && !str.equals("collapse_key")) {
                    arrayMap.put(str, str2);
                }
            }
        }
        return arrayMap;
    }
}
