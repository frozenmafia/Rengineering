package o;

import com.sendbird.android.constant.StringSet;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class addOnBackStackChangedListener {
    public static final addOnBackStackChangedListener ag$a = new addOnBackStackChangedListener();
    private static final ConcurrentHashMap<String, JSONObject> values = new ConcurrentHashMap<>();

    private addOnBackStackChangedListener() {
    }

    public static final void ah$a(String str, JSONObject jSONObject) {
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.ag$a(jSONObject, "value");
        values.put(str, jSONObject);
    }
}
