package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum Entity {
    USER("USER"),
    FEED_POST("FEED_POST"),
    MESSAGE_DM("MESSAGE_DM"),
    MESSAGE_GROUP("MESSAGE_GROUP"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Entity(String str) {
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

        public final Entity safeValueOf(String str) {
            Entity entity;
            runAnimators.ag$a(str, "rawValue");
            Entity[] values = Entity.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    entity = null;
                    break;
                }
                entity = values[i];
                if (runAnimators.values((Object) entity.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return entity == null ? Entity.UNKNOWN__ : entity;
        }
    }
}
