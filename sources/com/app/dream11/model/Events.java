package com.app.dream11.model;

import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class Events {
    private final Boolean enabled;
    private final String eventName;
    private final List<Integrations> integrations;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Events copy$default(Events events, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = events.eventName;
        }
        if ((i & 2) != 0) {
            bool = events.enabled;
        }
        if ((i & 4) != 0) {
            list = events.integrations;
        }
        return events.copy(str, bool, list);
    }

    public final String component1() {
        return this.eventName;
    }

    public final Boolean component2() {
        return this.enabled;
    }

    public final List<Integrations> component3() {
        return this.integrations;
    }

    public final Events copy(String str, Boolean bool, List<Integrations> list) {
        return new Events(str, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Events) {
            Events events = (Events) obj;
            return runAnimators.values((Object) this.eventName, (Object) events.eventName) && runAnimators.values(this.enabled, events.enabled) && runAnimators.values(this.integrations, events.integrations);
        }
        return false;
    }

    public int hashCode() {
        String str = this.eventName;
        int hashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.enabled;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        List<Integrations> list = this.integrations;
        return (((hashCode * 31) + hashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.eventName;
        Boolean bool = this.enabled;
        List<Integrations> list = this.integrations;
        return "Events(eventName=" + str + ", enabled=" + bool + ", integrations=" + list + ")";
    }

    public Events(String str, Boolean bool, List<Integrations> list) {
        this.eventName = str;
        this.enabled = bool;
        this.integrations = list;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final List<Integrations> getIntegrations() {
        return this.integrations;
    }
}
