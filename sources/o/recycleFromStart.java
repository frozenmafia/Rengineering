package o;

import android.util.Log;
import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;
/* loaded from: classes5.dex */
public class recycleFromStart {
    private final Set<BiConsumer<String, getNextSpan>> HaptikSDK$a = new HashSet();
    private final fixStartGap ag$a;
    private final Executor ah$b;
    private final fixStartGap valueOf;
    public static final Charset values = Charset.forName("UTF-8");
    static final Pattern toString = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final Pattern ah$a = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    public recycleFromStart(Executor executor, fixStartGap fixstartgap, fixStartGap fixstartgap2) {
        this.ah$b = executor;
        this.ag$a = fixstartgap;
        this.valueOf = fixstartgap2;
    }

    public String ag$a(String str) {
        String ah$a2 = ah$a(this.ag$a, str);
        if (ah$a2 != null) {
            ah$a(str, valueOf(this.ag$a));
            return ah$a2;
        }
        String ah$a3 = ah$a(this.valueOf, str);
        if (ah$a3 != null) {
            return ah$a3;
        }
        ah$a(str, "String");
        return "";
    }

    public boolean values(String str) {
        String ah$a2 = ah$a(this.ag$a, str);
        if (ah$a2 != null) {
            if (toString.matcher(ah$a2).matches()) {
                ah$a(str, valueOf(this.ag$a));
                return true;
            } else if (ah$a.matcher(ah$a2).matches()) {
                ah$a(str, valueOf(this.ag$a));
                return false;
            }
        }
        String ah$a3 = ah$a(this.valueOf, str);
        if (ah$a3 != null) {
            if (toString.matcher(ah$a3).matches()) {
                return true;
            }
            if (ah$a.matcher(ah$a3).matches()) {
                return false;
            }
        }
        ah$a(str, "Boolean");
        return false;
    }

    public double ah$a(String str) {
        Double values2 = values(this.ag$a, str);
        if (values2 != null) {
            ah$a(str, valueOf(this.ag$a));
            return values2.doubleValue();
        }
        Double values3 = values(this.valueOf, str);
        if (values3 != null) {
            return values3.doubleValue();
        }
        ah$a(str, "Double");
        return 0.0d;
    }

    public long toString(String str) {
        Long ag$a = ag$a(this.ag$a, str);
        if (ag$a != null) {
            ah$a(str, valueOf(this.ag$a));
            return ag$a.longValue();
        }
        Long ag$a2 = ag$a(this.valueOf, str);
        if (ag$a2 != null) {
            return ag$a2.longValue();
        }
        ah$a(str, "Long");
        return 0L;
    }

    public createFullSpanItemFromEnd valueOf(String str) {
        String ah$a2 = ah$a(this.ag$a, str);
        if (ah$a2 != null) {
            ah$a(str, valueOf(this.ag$a));
            return new areAllStartsEqual(ah$a2, 2);
        }
        String ah$a3 = ah$a(this.valueOf, str);
        if (ah$a3 != null) {
            return new areAllStartsEqual(ah$a3, 1);
        }
        ah$a(str, "FirebaseRemoteConfigValue");
        return new areAllStartsEqual("", 0);
    }

    public Map<String, createFullSpanItemFromEnd> valueOf() {
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(toString(this.ag$a));
        hashSet.addAll(toString(this.valueOf));
        HashMap hashMap = new HashMap();
        for (String str : hashSet) {
            hashMap.put(str, valueOf(str));
        }
        return hashMap;
    }

    public void ag$a(BiConsumer<String, getNextSpan> biConsumer) {
        synchronized (this.HaptikSDK$a) {
            this.HaptikSDK$a.add(biConsumer);
        }
    }

    private void ah$a(final String str, final getNextSpan getnextspan) {
        if (getnextspan == null) {
            return;
        }
        synchronized (this.HaptikSDK$a) {
            for (final BiConsumer<String, getNextSpan> biConsumer : this.HaptikSDK$a) {
                this.ah$b.execute(new Runnable() { // from class: o.updateAllRemainingSpans
                    @Override // java.lang.Runnable
                    public final void run() {
                        BiConsumer.this.accept(str, getnextspan);
                    }
                });
            }
        }
    }

    private static String ah$a(fixStartGap fixstartgap, String str) {
        getNextSpan valueOf = valueOf(fixstartgap);
        if (valueOf == null) {
            return null;
        }
        try {
            return valueOf.values().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Double values(fixStartGap fixstartgap, String str) {
        getNextSpan valueOf = valueOf(fixstartgap);
        if (valueOf == null) {
            return null;
        }
        try {
            return Double.valueOf(valueOf.values().getDouble(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Long ag$a(fixStartGap fixstartgap, String str) {
        getNextSpan valueOf = valueOf(fixstartgap);
        if (valueOf == null) {
            return null;
        }
        try {
            return Long.valueOf(valueOf.values().getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static Set<String> toString(fixStartGap fixstartgap) {
        HashSet hashSet = new HashSet();
        getNextSpan valueOf = valueOf(fixstartgap);
        if (valueOf == null) {
            return hashSet;
        }
        Iterator<String> keys = valueOf.values().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static getNextSpan valueOf(fixStartGap fixstartgap) {
        return fixstartgap.valueOf();
    }

    private static void ah$a(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }
}
