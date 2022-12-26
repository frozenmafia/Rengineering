package com.app.dream11.core.service.graphql.api.type;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes2.dex */
public enum DepositOptionStatus {
    DOWN("DOWN"),
    FLUCTUATING("FLUCTUATING"),
    UP("UP"),
    UNKNOWN__("UNKNOWN__");
    
    public static final Companion Companion = new Companion(null);
    private final String rawValue;

    DepositOptionStatus(String str) {
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

        public final DepositOptionStatus safeValueOf(String str) {
            DepositOptionStatus depositOptionStatus;
            runAnimators.ag$a(str, "rawValue");
            DepositOptionStatus[] values = DepositOptionStatus.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    depositOptionStatus = null;
                    break;
                }
                depositOptionStatus = values[i];
                if (runAnimators.values((Object) depositOptionStatus.getRawValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return depositOptionStatus == null ? DepositOptionStatus.UNKNOWN__ : depositOptionStatus;
        }
    }
}
