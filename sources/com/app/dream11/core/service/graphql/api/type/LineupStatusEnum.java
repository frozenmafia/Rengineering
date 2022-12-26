package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
import org.apache.http.util.VersionInfo;
/* loaded from: classes2.dex */
public enum LineupStatusEnum {
    PLAYING("PLAYING"),
    NOT_PLAYING("NOT_PLAYING"),
    BENCHED("BENCHED"),
    X_FACTOR_SUBSTITUTE("X_FACTOR_SUBSTITUTE"),
    USED_X_FACTOR_SUBSTITUTE("USED_X_FACTOR_SUBSTITUTE"),
    UNAVAILABLE(VersionInfo.UNAVAILABLE),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    LineupStatusEnum(String str) {
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

        public final LineupStatusEnum safeValueOf(String str) {
            LineupStatusEnum lineupStatusEnum;
            runAnimators.ag$a(str, "rawValue");
            LineupStatusEnum[] values = LineupStatusEnum.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    lineupStatusEnum = null;
                    break;
                }
                lineupStatusEnum = values[i];
                if (runAnimators.values((Object) lineupStatusEnum.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return lineupStatusEnum == null ? LineupStatusEnum.UNKNOWN__ : lineupStatusEnum;
        }
    }
}
