package com.app.dream11.chat;
/* loaded from: classes6.dex */
public class ChannelEvent {
    private Event event;

    /* loaded from: classes6.dex */
    public enum Event {
        GROUP_AUTHORIZED,
        MESSAGE_RECEIVED,
        MESSAGE_HISTORY_RECEIVED,
        MESSAGE_SENT,
        TYPING_STATUS_UPDATED,
        ERROR
    }

    protected ChannelEvent(Event event) {
        this.event = event;
    }

    public Event getEvent() {
        return this.event;
    }
}
