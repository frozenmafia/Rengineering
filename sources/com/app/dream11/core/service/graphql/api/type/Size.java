package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum Size {
    BIG("BIG"),
    SMALL("SMALL"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Size(String str) {
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

        public final Size safeValueOf(String str) {
            Size size;
            runAnimators.ag$a(str, "rawValue");
            Size[] values = Size.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    size = null;
                    break;
                }
                size = values[i];
                if (runAnimators.values((Object) size.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return size == null ? Size.UNKNOWN__ : size;
        }
    }
}
