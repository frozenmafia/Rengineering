package com.app.dream11.model;

import o.runAnimators;
/* loaded from: classes.dex */
public final class NotificationKey {
    private final String notificationKey;

    public static /* synthetic */ NotificationKey copy$default(NotificationKey notificationKey, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationKey.notificationKey;
        }
        return notificationKey.copy(str);
    }

    public final String component1() {
        return this.notificationKey;
    }

    public final NotificationKey copy(String str) {
        runAnimators.ag$a(str, "notificationKey");
        return new NotificationKey(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationKey) && runAnimators.values((Object) this.notificationKey, (Object) ((NotificationKey) obj).notificationKey);
    }

    public int hashCode() {
        return this.notificationKey.hashCode();
    }

    public String toString() {
        String str = this.notificationKey;
        return "NotificationKey(notificationKey=" + str + ")";
    }

    public NotificationKey(String str) {
        runAnimators.ag$a(str, "notificationKey");
        this.notificationKey = str;
    }

    public final String getNotificationKey() {
        return this.notificationKey;
    }
}
