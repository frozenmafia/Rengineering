package o;

import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.analytics.models.enums.EventType;
import java.util.LinkedList;
/* loaded from: classes4.dex */
public final class getStatus {
    private final LinkedList<getStatus$ah$a> ag$a = new LinkedList<>();

    public final getStatus$ah$a ah$a(String str, String str2, String str3, String str4, String str5, EventType eventType, String str6, String str7, ActionType actionType, String str8, String str9, int i, String str10) {
        runAnimators.ag$a(str, "userId");
        runAnimators.ag$a(str2, "loggedInUserId");
        runAnimators.ag$a(str4, "analyticsResponsePayload");
        runAnimators.ag$a(str6, "mediaId");
        runAnimators.ag$a(actionType, "actionType");
        getStatus$ah$a pollFirst = this.ag$a.pollFirst();
        if (pollFirst == null) {
            pollFirst = new getStatus$ah$a();
        }
        getStatus$ah$a getstatus_ah_a = pollFirst;
        getstatus_ah_a.values(str, str2, str3, str4, str5, eventType, str6, str7, actionType, str8, str9, i, str10);
        return getstatus_ah_a;
    }

    public final void toString(getStatus$ah$a getstatus_ah_a) {
        runAnimators.ag$a(getstatus_ah_a, "eventWrapper");
        this.ag$a.add(getstatus_ah_a);
    }
}
