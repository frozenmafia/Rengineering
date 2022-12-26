package com.apxor.androidsdk.core.d;

import com.apxor.androidsdk.core.Constants;
import com.apxor.androidsdk.core.EventListener;
import com.apxor.androidsdk.core.SDKController;
import com.apxor.androidsdk.core.models.BaseApxorEvent;
import com.apxor.androidsdk.core.utils.DateTimeUtils;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public class d implements EventListener {
    private boolean a;

    public void a() {
        if (this.a) {
            return;
        }
        SDKController sDKController = SDKController.getInstance();
        sDKController.registerToEvent("app_events", this);
        sDKController.registerToEvent(Constants.NAVIGATION_EVENTS, this);
        sDKController.registerToEvent(Constants.CLIENT_EVENTS, this);
        this.a = true;
    }

    @Override // com.apxor.androidsdk.core.EventListener
    public void onEvent(BaseApxorEvent baseApxorEvent) {
        char c;
        DateTimeUtils dateTimeUtils = SDKController.getInstance().getDateTimeUtils();
        long timeFromDate = dateTimeUtils.getTimeFromDate(dateTimeUtils.getDateString(new Date()));
        String eventType = baseApxorEvent.getEventType();
        eventType.hashCode();
        eventType.hashCode();
        int hashCode = eventType.hashCode();
        if (hashCode == -66447964) {
            if (eventType.equals(Constants.NAVIGATION_EVENTS)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 884993271) {
            if (hashCode == 1808123565 && eventType.equals(Constants.CLIENT_EVENTS)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (eventType.equals("app_events")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0 || c == 1 || c == 2) {
            a(baseApxorEvent, timeFromDate);
        }
    }

    private void a(BaseApxorEvent baseApxorEvent, long j) {
        try {
            String eventName = baseApxorEvent.getEventName();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("date", j);
            jSONObject.put(Constants.OPERAND, eventName);
            SDKController.getInstance().getDataHandler().a(jSONObject);
        } catch (JSONException unused) {
        }
    }
}
