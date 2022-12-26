package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum Tab {
    LIVE("LIVE"),
    UPCOMING("UPCOMING"),
    COMPLETED("COMPLETED"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    Tab(String str) {
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

        public final Tab safeValueOf(String str) {
            Tab tab;
            runAnimators.ag$a(str, "rawValue");
            Tab[] values = Tab.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    tab = null;
                    break;
                }
                tab = values[i];
                if (runAnimators.values((Object) tab.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return tab == null ? Tab.UNKNOWN__ : tab;
        }
    }
}
