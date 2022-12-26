package com.app.dream11.core.service.graphql.api.type;

import com.google.android.gms.common.Scopes;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum EventType {
    FEED("feed"),
    PROFILE(Scopes.PROFILE),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    EventType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final EventType safeValueOf(String str) {
            EventType eventType;
            runAnimators.ag$a(str, "rawValue");
            EventType[] values = EventType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    eventType = null;
                    break;
                }
                eventType = values[i];
                if (runAnimators.values((Object) eventType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return eventType == null ? EventType.UNKNOWN__ : eventType;
        }
    }
}
