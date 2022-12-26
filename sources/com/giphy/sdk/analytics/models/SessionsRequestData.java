package com.giphy.sdk.analytics.models;

import com.apxor.androidsdk.core.Constants;
import java.util.List;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class SessionsRequestData {
    private final List<AnalyticsEvent> events;

    public SessionsRequestData(List<AnalyticsEvent> list) {
        runAnimators.ag$a(list, Constants.EVENTS_TABLE);
        this.events = list;
    }

    public final List<AnalyticsEvent> getEvents() {
        return this.events;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SessionsRequestData(Session session) {
        this(session.getEvents());
        runAnimators.ag$a(session, com.apxor.androidsdk.core.ce.Constants.SESSION_ATTR);
    }
}
