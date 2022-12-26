package o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes3.dex */
class registerForLayoutCallback {
    private static final Map<Integer, String> toString;

    static {
        HashMap hashMap = new HashMap();
        toString = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(256, "CursorLeak");
        hashMap.put(512, "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf(Throwable th) {
        return toString(th).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toString(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        int lastIndexOf = str.lastIndexOf("violation=");
        if (lastIndexOf != -1) {
            String replace = str.substring(lastIndexOf).replace("violation=", "");
            if (TextUtils.isDigitsOnly(replace)) {
                return toString.get(Integer.valueOf(replace));
            }
            return null;
        }
        return null;
    }

    private Throwable toString(Throwable th) {
        List<Throwable> ag$a = extrasAvailable.ag$a(th);
        return ag$a.get(ag$a.size() - 1);
    }
}
