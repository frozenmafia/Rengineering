package o;

import com.phonepe.intent.sdk.api.PhonePe;
import irjuc.irjuc.cqqlq.irjuc.rmqfk.jmbjl;
import java.util.Map;
import o.ChangeBounds;
/* loaded from: classes5.dex */
public final class ChangeBounds$4$ag$a {
    public final void ag$a(boolean z, String str) {
        runAnimators.valueOf(str, "responseCode");
        toString("CHECK_AVAILABILITY_SDK_FINAL_RESPONSE_SENT", fetchDrawMatrixField.values(getReparent.toString("checkAvailabilityFinalResponse", Boolean.valueOf(z)), getReparent.toString("checkAvailabilityFinalResponseCode", str)));
    }

    public final void toString(String str, Map<String, ? extends Object> map) {
        runAnimators.valueOf(str, "eventName");
        ChangeBounds.AnonymousClass2 anonymousClass2 = (ChangeBounds.AnonymousClass2) PhonePe.getObjectFactory().values(ChangeBounds.AnonymousClass2.class);
        jmbjl ag$a = anonymousClass2.ag$a(str);
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                ag$a.toString(entry.getKey(), entry.getValue());
            }
        }
        anonymousClass2.ag$a(ag$a);
    }

    public final void values(long j, long j2) {
        toString("CHECK_AVAILABILITY_API_CALL_TIMED_OUT", fetchDrawMatrixField.values(getReparent.toString("checkAvailabilityTimeoutMs", Long.valueOf(j)), getReparent.toString("timeTakenMs", Long.valueOf(j2))));
    }
}
