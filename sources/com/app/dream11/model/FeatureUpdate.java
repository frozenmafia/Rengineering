package com.app.dream11.model;

import com.app.dream11.core.event.EventType;
/* loaded from: classes.dex */
public class FeatureUpdate {
    private EventType eventType;

    public FeatureUpdate(EventType eventType) {
        this.eventType = eventType;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
