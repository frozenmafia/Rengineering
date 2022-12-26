package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ScreenEnum {
    FEED("FEED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ScreenEnum(String str) {
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

        public final ScreenEnum safeValueOf(String str) {
            ScreenEnum screenEnum;
            runAnimators.ag$a(str, "rawValue");
            ScreenEnum[] values = ScreenEnum.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    screenEnum = null;
                    break;
                }
                screenEnum = values[i];
                if (runAnimators.values((Object) screenEnum.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return screenEnum == null ? ScreenEnum.UNKNOWN__ : screenEnum;
        }
    }
}
