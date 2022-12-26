package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum EntityType {
    FEED_POST("FEED_POST"),
    COMMENT("COMMENT"),
    MESSAGE("MESSAGE"),
    PROFILE_PICTURE("PROFILE_PICTURE"),
    TEAMNAME("TEAMNAME"),
    MESSAGE_DM("MESSAGE_DM"),
    MESSAGE_GROUP("MESSAGE_GROUP"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    EntityType(String str) {
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

        public final EntityType safeValueOf(String str) {
            EntityType entityType;
            runAnimators.ag$a(str, "rawValue");
            EntityType[] values = EntityType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    entityType = null;
                    break;
                }
                entityType = values[i];
                if (runAnimators.values((Object) entityType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return entityType == null ? EntityType.UNKNOWN__ : entityType;
        }
    }
}
