package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum PageDirection {
    UP("UP"),
    DOWN("DOWN"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    PageDirection(String str) {
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

        public final PageDirection safeValueOf(String str) {
            PageDirection pageDirection;
            runAnimators.ag$a(str, "rawValue");
            PageDirection[] values = PageDirection.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    pageDirection = null;
                    break;
                }
                pageDirection = values[i];
                if (runAnimators.values((Object) pageDirection.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return pageDirection == null ? PageDirection.UNKNOWN__ : pageDirection;
        }
    }
}
