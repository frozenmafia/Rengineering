package com.app.dream11.core.service.graphql.api.type;

import com.sendbird.android.constant.StringSet;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes6.dex */
public enum RulesRelation {
    AND(StringSet.AND),
    OR(StringSet.OR),
    NONE("NONE"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    RulesRelation(String str) {
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

        public final RulesRelation safeValueOf(String str) {
            RulesRelation rulesRelation;
            runAnimators.ag$a(str, "rawValue");
            RulesRelation[] values = RulesRelation.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    rulesRelation = null;
                    break;
                }
                rulesRelation = values[i];
                if (runAnimators.values((Object) rulesRelation.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return rulesRelation == null ? RulesRelation.UNKNOWN__ : rulesRelation;
        }
    }
}
