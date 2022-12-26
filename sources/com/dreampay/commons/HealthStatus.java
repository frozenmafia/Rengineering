package com.dreampay.commons;

import android.text.TextUtils;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes4.dex */
public enum HealthStatus {
    UP(0),
    FLUCTUATING(1),
    DOWN(2);
    
    public static final Companion Companion = new Companion(null);
    private final int rank;

    HealthStatus(int i) {
        this.rank = i;
    }

    public final int getRank() {
        return this.rank;
    }

    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(getTargetTypes gettargettypes) {
            this();
        }

        private Companion() {
        }

        public final HealthStatus getObject(boolean z, String str) {
            runAnimators.ag$a(str, "healthMessage");
            if (z) {
                return HealthStatus.DOWN;
            }
            return !TextUtils.isEmpty(str) ? HealthStatus.FLUCTUATING : HealthStatus.UP;
        }
    }
}
