package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum CustomChannelType {
    DM("DM"),
    GROUP_CHAT("GROUP_CHAT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    CustomChannelType(String str) {
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

        public final CustomChannelType safeValueOf(String str) {
            CustomChannelType customChannelType;
            runAnimators.ag$a(str, "rawValue");
            CustomChannelType[] values = CustomChannelType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    customChannelType = null;
                    break;
                }
                customChannelType = values[i];
                if (runAnimators.values((Object) customChannelType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return customChannelType == null ? CustomChannelType.UNKNOWN__ : customChannelType;
        }
    }
}
