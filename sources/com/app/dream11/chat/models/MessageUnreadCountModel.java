package com.app.dream11.chat.models;

import o.getTargetTypes;
import o.runAnimators;
/* loaded from: classes.dex */
public final class MessageUnreadCountModel {
    private final Integer dMRequestCount;
    private final Integer groupsTotalUnreadCount;

    public MessageUnreadCountModel() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ MessageUnreadCountModel copy$default(MessageUnreadCountModel messageUnreadCountModel, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = messageUnreadCountModel.groupsTotalUnreadCount;
        }
        if ((i & 2) != 0) {
            num2 = messageUnreadCountModel.dMRequestCount;
        }
        return messageUnreadCountModel.copy(num, num2);
    }

    public final Integer component1() {
        return this.groupsTotalUnreadCount;
    }

    public final Integer component2() {
        return this.dMRequestCount;
    }

    public final MessageUnreadCountModel copy(Integer num, Integer num2) {
        return new MessageUnreadCountModel(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageUnreadCountModel) {
            MessageUnreadCountModel messageUnreadCountModel = (MessageUnreadCountModel) obj;
            return runAnimators.values(this.groupsTotalUnreadCount, messageUnreadCountModel.groupsTotalUnreadCount) && runAnimators.values(this.dMRequestCount, messageUnreadCountModel.dMRequestCount);
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.groupsTotalUnreadCount;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.dMRequestCount;
        return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.groupsTotalUnreadCount;
        Integer num2 = this.dMRequestCount;
        return "MessageUnreadCountModel(groupsTotalUnreadCount=" + num + ", dMRequestCount=" + num2 + ")";
    }

    public MessageUnreadCountModel(Integer num, Integer num2) {
        this.groupsTotalUnreadCount = num;
        this.dMRequestCount = num2;
    }

    public /* synthetic */ MessageUnreadCountModel(Integer num, Integer num2, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }

    public final Integer getGroupsTotalUnreadCount() {
        return this.groupsTotalUnreadCount;
    }

    public final Integer getDMRequestCount() {
        return this.dMRequestCount;
    }
}
