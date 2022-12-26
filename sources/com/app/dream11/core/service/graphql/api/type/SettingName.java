package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum SettingName {
    SHOW_FULL_NAME("SHOW_FULL_NAME"),
    SHOW_PAST_TEAMS("SHOW_PAST_TEAMS"),
    SHOW_CONTEST_BREAKUP("SHOW_CONTEST_BREAKUP"),
    SHOW_BLOCKED_USERS("SHOW_BLOCKED_USERS"),
    MESSAGE_REQUEST("MESSAGE_REQUEST"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    SettingName(String str) {
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

        public final SettingName safeValueOf(String str) {
            SettingName settingName;
            runAnimators.ag$a(str, "rawValue");
            SettingName[] values = SettingName.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    settingName = null;
                    break;
                }
                settingName = values[i];
                if (runAnimators.values((Object) settingName.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return settingName == null ? SettingName.UNKNOWN__ : settingName;
        }
    }
}
