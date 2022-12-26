package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum Channel {
    WHATSAPP("WHATSAPP"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Channel(String str) {
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

        public final Channel safeValueOf(String str) {
            Channel channel;
            runAnimators.ag$a(str, "rawValue");
            Channel[] values = Channel.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    channel = null;
                    break;
                }
                channel = values[i];
                if (runAnimators.values((Object) channel.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return channel == null ? Channel.UNKNOWN__ : channel;
        }
    }
}
