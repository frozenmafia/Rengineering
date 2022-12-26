package com.dreampay.graphql.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum ViewType {
    DRILLDOWN("DRILLDOWN"),
    VERTICAL_LIST("VERTICAL_LIST"),
    HORIZONTAL_LIST("HORIZONTAL_LIST"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ViewType(String str) {
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

        public final ViewType safeValueOf(String str) {
            ViewType viewType;
            runAnimators.ag$a(str, "rawValue");
            ViewType[] values = ViewType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    viewType = null;
                    break;
                }
                viewType = values[i];
                if (runAnimators.values((Object) viewType.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return viewType == null ? ViewType.UNKNOWN__ : viewType;
        }
    }
}
