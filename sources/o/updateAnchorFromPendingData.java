package o;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes5.dex */
public class updateAnchorFromPendingData {
    private final String HaptikSDK$a;
    private final long HaptikSDK$c;
    private final String ah$a;
    private final String invoke;
    private final Date valueOf;
    private final long values;
    private static final String[] toString = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final DateFormat ag$a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    public updateAnchorFromPendingData(String str, String str2, String str3, Date date, long j, long j2) {
        this.ah$a = str;
        this.HaptikSDK$a = str2;
        this.invoke = str3;
        this.valueOf = date;
        this.HaptikSDK$c = j;
        this.values = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static updateAnchorFromPendingData values(Map<String, String> map) throws AbtException {
        ag$a(map);
        try {
            return new updateAnchorFromPendingData(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", ag$a.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e) {
            throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
        } catch (java.text.ParseException e2) {
            throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String values() {
        return this.ah$a;
    }

    long ah$a() {
        return this.valueOf.getTime();
    }

    private static void ag$a(Map<String, String> map) throws AbtException {
        String[] strArr;
        ArrayList arrayList = new ArrayList();
        for (String str : toString) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public collectAdjacentPrefetchPositions$ah$a values(String str) {
        collectAdjacentPrefetchPositions$ah$a collectadjacentprefetchpositions_ah_a = new collectAdjacentPrefetchPositions$ah$a();
        collectadjacentprefetchpositions_ah_a.HaptikSDK$a = str;
        collectadjacentprefetchpositions_ah_a.toString = ah$a();
        collectadjacentprefetchpositions_ah_a.ag$a = this.ah$a;
        collectadjacentprefetchpositions_ah_a.HaptikSDK$e = this.HaptikSDK$a;
        collectadjacentprefetchpositions_ah_a.HaptikSDK$c = TextUtils.isEmpty(this.invoke) ? null : this.invoke;
        collectadjacentprefetchpositions_ah_a.getInitSettings = this.HaptikSDK$c;
        collectadjacentprefetchpositions_ah_a.invoke = this.values;
        return collectadjacentprefetchpositions_ah_a;
    }
}
