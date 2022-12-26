package com.app.dream11.model;

import com.apxor.androidsdk.core.Constants;
import java.util.HashMap;
import o.isFullSpan;
/* loaded from: classes3.dex */
public final class EventsList {
    @isFullSpan(valueOf = Constants.EVENTS_TABLE)
    private HashMap<String, Events> eventList;

    public final HashMap<String, Events> getEventList() {
        return this.eventList;
    }

    public final void setEventList(HashMap<String, Events> hashMap) {
        this.eventList = hashMap;
    }
}
