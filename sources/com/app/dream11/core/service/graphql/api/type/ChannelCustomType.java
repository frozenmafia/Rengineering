package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ChannelCustomType {
    DM("DM"),
    X("X"),
    GROUP_CHAT("GROUP_CHAT"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ChannelCustomType(String str) {
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

        public final ChannelCustomType safeValueOf(String str) {
            ChannelCustomType channelCustomType;
            runAnimators.ag$a(str, "rawValue");
            ChannelCustomType[] values = ChannelCustomType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    channelCustomType = null;
                    break;
                }
                channelCustomType = values[i];
                if (runAnimators.values((Object) channelCustomType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return channelCustomType == null ? ChannelCustomType.UNKNOWN__ : channelCustomType;
        }
    }
}
