package o;

import java.util.HashMap;
import java.util.HashSet;
/* loaded from: classes4.dex */
public final class unregisterReceiver {
    private final HashMap<String, HashSet<String>> values = new HashMap<>();

    public final boolean values(String str, String str2) {
        runAnimators.ag$a(str, "mediaId");
        runAnimators.ag$a(str2, "responseId");
        HashSet<String> hashSet = this.values.get(str2);
        if (hashSet != null) {
            if (hashSet.contains(str)) {
                return false;
            }
            hashSet.add(str);
            return true;
        }
        this.values.put(str2, runAnimators.ag$a(new String[]{str}, "elements"));
        return true;
    }

    public final void ah$a() {
        this.values.clear();
    }
}
