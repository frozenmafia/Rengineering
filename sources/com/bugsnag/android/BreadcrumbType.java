package com.bugsnag.android;

import androidx.core.app.NotificationCompat;
import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes3.dex */
public enum BreadcrumbType {
    ERROR("error"),
    LOG("log"),
    MANUAL("manual"),
    NAVIGATION(NotificationCompat.CATEGORY_NAVIGATION),
    PROCESS("process"),
    REQUEST("request"),
    STATE("state"),
    USER("user");
    
    public static final values Companion = new values(null);
    private final String type;

    BreadcrumbType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }

    /* loaded from: classes3.dex */
    public static final class values {
        private values() {
        }

        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        public final BreadcrumbType valueOf(String str) {
            BreadcrumbType[] values;
            runAnimators.valueOf(str, "type");
            BreadcrumbType breadcrumbType = null;
            boolean z = false;
            for (BreadcrumbType breadcrumbType2 : BreadcrumbType.values()) {
                if (runAnimators.values((Object) breadcrumbType2.type, (Object) str)) {
                    if (z) {
                        return null;
                    }
                    z = true;
                    breadcrumbType = breadcrumbType2;
                }
            }
            if (z) {
                return breadcrumbType;
            }
            return null;
        }
    }
}
