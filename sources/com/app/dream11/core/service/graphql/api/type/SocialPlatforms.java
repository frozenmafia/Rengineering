package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum SocialPlatforms {
    GOOGLE("GOOGLE"),
    FACEBOOK("FACEBOOK"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    SocialPlatforms(String str) {
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

        public final SocialPlatforms safeValueOf(String str) {
            SocialPlatforms socialPlatforms;
            runAnimators.ag$a(str, "rawValue");
            SocialPlatforms[] values = SocialPlatforms.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    socialPlatforms = null;
                    break;
                }
                socialPlatforms = values[i];
                if (runAnimators.values((Object) socialPlatforms.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return socialPlatforms == null ? SocialPlatforms.UNKNOWN__ : socialPlatforms;
        }
    }
}
