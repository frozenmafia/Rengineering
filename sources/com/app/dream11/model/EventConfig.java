package com.app.dream11.model;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class EventConfig {
    private final boolean isEnabled;
    private final NewEvents newEvents;

    public static /* synthetic */ EventConfig copy$default(EventConfig eventConfig, boolean z, NewEvents newEvents, int i, Object obj) {
        if ((i & 1) != 0) {
            z = eventConfig.isEnabled;
        }
        if ((i & 2) != 0) {
            newEvents = eventConfig.newEvents;
        }
        return eventConfig.copy(z, newEvents);
    }

    public final boolean component1() {
        return this.isEnabled;
    }

    public final NewEvents component2() {
        return this.newEvents;
    }

    public final EventConfig copy(boolean z, NewEvents newEvents) {
        return new EventConfig(z, newEvents);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventConfig) {
            EventConfig eventConfig = (EventConfig) obj;
            return this.isEnabled == eventConfig.isEnabled && runAnimators.values(this.newEvents, eventConfig.newEvents);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.isEnabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        NewEvents newEvents = this.newEvents;
        return (r0 * 31) + (newEvents == null ? 0 : newEvents.hashCode());
    }

    public String toString() {
        boolean z = this.isEnabled;
        NewEvents newEvents = this.newEvents;
        return "EventConfig(isEnabled=" + z + ", newEvents=" + newEvents + ")";
    }

    public EventConfig(boolean z, NewEvents newEvents) {
        this.isEnabled = z;
        this.newEvents = newEvents;
    }

    public /* synthetic */ EventConfig(boolean z, NewEvents newEvents, int i, getTargetTypes gettargettypes) {
        this(z, (i & 2) != 0 ? null : newEvents);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final NewEvents getNewEvents() {
        return this.newEvents;
    }
}
