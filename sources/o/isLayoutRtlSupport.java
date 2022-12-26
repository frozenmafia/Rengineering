package o;

import android.net.Uri;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public final class isLayoutRtlSupport {
    private static isLayoutRtlSupport ag$a = null;
    private static final String toString = "f";
    private final Map<String, Uri> ah$a = new LinkedHashMap();

    public static isLayoutRtlSupport ah$a() {
        isLayoutRtlSupport islayoutrtlsupport;
        synchronized (isLayoutRtlSupport.class) {
            if (ag$a == null) {
                ag$a = new isLayoutRtlSupport();
            }
            islayoutrtlsupport = ag$a;
        }
        return islayoutrtlsupport;
    }

    public Uri toString(String str) {
        Uri remove;
        synchronized (this) {
            String str2 = toString;
            Log.d(str2, "Dequeuing pending response for request ID " + str);
            remove = this.ah$a.remove(str);
        }
        return remove;
    }

    public int values() {
        return this.ah$a.size();
    }

    public void values(String str, Uri uri) {
        synchronized (this) {
            if (str == null) {
                throw new IllegalArgumentException("requestId must be non-null");
            }
            if (uri == null) {
                throw new IllegalArgumentException("responseUri must be non-null");
            }
            while (this.ah$a.size() >= 10) {
                String next = this.ah$a.keySet().iterator().next();
                String str2 = toString;
                Log.d(str2, "Purging pending response for request ID " + next);
                this.ah$a.remove(next);
            }
            String str3 = toString;
            Log.d(str3, "Recording pending response for request ID " + str);
            this.ah$a.put(str, uri);
        }
    }

    public boolean values(String str) {
        boolean containsKey;
        synchronized (this) {
            containsKey = this.ah$a.containsKey(str);
        }
        return containsKey;
    }
}
