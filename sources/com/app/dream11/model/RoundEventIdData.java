package com.app.dream11.model;

import java.io.Serializable;
import o.isFullSpan;
/* loaded from: classes3.dex */
public class RoundEventIdData implements Serializable {
    private RoundEventDataWrapper success = new RoundEventDataWrapper();

    public int getLatestEventId() {
        RoundEventDataWrapper roundEventDataWrapper = this.success;
        if (roundEventDataWrapper != null) {
            return roundEventDataWrapper.getLatestEventId();
        }
        return -1;
    }

    /* loaded from: classes3.dex */
    public class RoundEventDataWrapper {
        @isFullSpan(valueOf = "eventId")
        int latestEventId = -1;

        public RoundEventDataWrapper() {
        }

        public int getLatestEventId() {
            return this.latestEventId;
        }
    }
}
