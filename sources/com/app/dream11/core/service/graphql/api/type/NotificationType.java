package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum NotificationType {
    SOCIAL("SOCIAL"),
    TRANS("TRANS"),
    PROMO("PROMO"),
    PROFILE("PROFILE"),
    GAMEPLAY("GAMEPLAY"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    NotificationType(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final NotificationType safeValueOf(String str) {
            NotificationType notificationType;
            runAnimators.ag$a(str, "rawValue");
            NotificationType[] values = NotificationType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notificationType = null;
                    break;
                }
                notificationType = values[i];
                if (runAnimators.values((Object) notificationType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return notificationType == null ? NotificationType.UNKNOWN__ : notificationType;
        }
    }
}
