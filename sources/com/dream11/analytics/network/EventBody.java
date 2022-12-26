package com.dream11.analytics.network;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.getTargetTypes;
import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes4.dex */
public final class EventBody implements Serializable {
    @isFullSpan(valueOf = "eventName")
    private final String eventName;
    @isFullSpan(valueOf = "props")
    private Map<String, ? extends Object> params;

    public EventBody() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventBody copy$default(EventBody eventBody, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventBody.eventName;
        }
        if ((i & 2) != 0) {
            map = eventBody.params;
        }
        return eventBody.copy(str, map);
    }

    public final String component1() {
        return this.eventName;
    }

    public final Map<String, Object> component2() {
        return this.params;
    }

    public final EventBody copy(String str, Map<String, ? extends Object> map) {
        runAnimators.valueOf(str, "eventName");
        runAnimators.valueOf(map, "params");
        return new EventBody(str, map);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EventBody) {
                EventBody eventBody = (EventBody) obj;
                return runAnimators.values((Object) this.eventName, (Object) eventBody.eventName) && runAnimators.values(this.params, eventBody.params);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.eventName;
        int hashCode = str != null ? str.hashCode() : 0;
        Map<String, ? extends Object> map = this.params;
        return (hashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "EventBody(eventName=" + this.eventName + ", params=" + this.params + ")";
    }

    public EventBody(String str, Map<String, ? extends Object> map) {
        runAnimators.valueOf(str, "eventName");
        runAnimators.valueOf(map, "params");
        this.eventName = str;
        this.params = map;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public /* synthetic */ EventBody(String str, HashMap hashMap, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new HashMap() : hashMap);
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final void setParams(Map<String, ? extends Object> map) {
        runAnimators.valueOf(map, "<set-?>");
        this.params = map;
    }
}
