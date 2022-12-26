package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum ViewSection {
    MANAGE_PAYMENTS("MANAGE_PAYMENTS"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    ViewSection(String str) {
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

        public final ViewSection safeValueOf(String str) {
            ViewSection viewSection;
            runAnimators.ag$a(str, "rawValue");
            ViewSection[] values = ViewSection.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    viewSection = null;
                    break;
                }
                viewSection = values[i];
                if (runAnimators.values((Object) viewSection.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return viewSection == null ? ViewSection.UNKNOWN__ : viewSection;
        }
    }
}
