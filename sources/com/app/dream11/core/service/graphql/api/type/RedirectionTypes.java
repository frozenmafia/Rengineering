package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum RedirectionTypes {
    DEEPLINK("DEEPLINK"),
    EXT_INSIDEAPP("EXT_INSIDEAPP"),
    EXT_OUTSIDEAPP("EXT_OUTSIDEAPP"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    RedirectionTypes(String str) {
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

        public final RedirectionTypes safeValueOf(String str) {
            RedirectionTypes redirectionTypes;
            runAnimators.ag$a(str, "rawValue");
            RedirectionTypes[] values = RedirectionTypes.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    redirectionTypes = null;
                    break;
                }
                redirectionTypes = values[i];
                if (runAnimators.values((Object) redirectionTypes.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return redirectionTypes == null ? RedirectionTypes.UNKNOWN__ : redirectionTypes;
        }
    }
}
