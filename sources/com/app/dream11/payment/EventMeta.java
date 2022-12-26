package com.app.dream11.payment;

import java.io.Serializable;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class EventMeta implements Serializable {
    private final String source;
    private final String timeToRoundLock;

    public static /* synthetic */ EventMeta copy$default(EventMeta eventMeta, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eventMeta.source;
        }
        if ((i & 2) != 0) {
            str2 = eventMeta.timeToRoundLock;
        }
        return eventMeta.copy(str, str2);
    }

    public final String component1() {
        return this.source;
    }

    public final String component2() {
        return this.timeToRoundLock;
    }

    public final EventMeta copy(String str, String str2) {
        return new EventMeta(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventMeta) {
            EventMeta eventMeta = (EventMeta) obj;
            return runAnimators.values((Object) this.source, (Object) eventMeta.source) && runAnimators.values((Object) this.timeToRoundLock, (Object) eventMeta.timeToRoundLock);
        }
        return false;
    }

    public int hashCode() {
        String str = this.source;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.timeToRoundLock;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.source;
        String str2 = this.timeToRoundLock;
        return "EventMeta(source=" + str + ", timeToRoundLock=" + str2 + ")";
    }

    public EventMeta(String str, String str2) {
        this.source = str;
        this.timeToRoundLock = str2;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTimeToRoundLock() {
        return this.timeToRoundLock;
    }
}
