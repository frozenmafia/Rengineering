package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes7.dex */
public final class getUnmodifiedPayloads$ah$a extends hasAnyOfTheFlags<String> {
    private static final Map<Long, String> toString = Collections.unmodifiableMap(new HashMap<Long, String>() { // from class: com.google.firebase.perf.config.ConfigurationConstants$LogSourceName$1
        {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    });
    private static getUnmodifiedPayloads$ah$a valueOf;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String HaptikSDK$a() {
        return "fpr_log_source";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.hasAnyOfTheFlags
    public String p_() {
        return "com.google.firebase.perf.LogSourceName";
    }

    private getUnmodifiedPayloads$ah$a() {
    }

    public static getUnmodifiedPayloads$ah$a ah$a() {
        getUnmodifiedPayloads$ah$a getunmodifiedpayloads_ah_a;
        synchronized (getUnmodifiedPayloads$ah$a.class) {
            if (valueOf == null) {
                valueOf = new getUnmodifiedPayloads$ah$a();
            }
            getunmodifiedpayloads_ah_a = valueOf;
        }
        return getunmodifiedpayloads_ah_a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String values(long j) {
        return toString.get(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String valueOf() {
        return addFlags.values;
    }
}
