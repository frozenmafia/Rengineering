package com.sendbird.android;

import com.sendbird.android.constant.StringSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class BaseMessageParams {
    String mCustomType;
    String mData;
    List<String> mMentionedUserIds;
    List<MessageMetaArray> mMetaArrays;
    PushNotificationDeliveryOption mPushNotificationDeliveryOption;
    MentionType mMentionType = MentionType.USERS;
    long rootMessageId = 0;
    long parentMessageId = 0;

    /* loaded from: classes5.dex */
    public enum PushNotificationDeliveryOption {
        DEFAULT,
        SUPPRESS
    }

    /* loaded from: classes5.dex */
    public enum MentionType {
        USERS(StringSet.users),
        CHANNEL("channel");
        
        private String value;

        MentionType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }

        public static MentionType from(String str) {
            MentionType[] values;
            for (MentionType mentionType : values()) {
                if (mentionType.value.equalsIgnoreCase(str)) {
                    return mentionType;
                }
            }
            return USERS;
        }
    }

    BaseMessageParams setRootMessageId(long j) {
        this.rootMessageId = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setParentMessageId(long j) {
        this.parentMessageId = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setData(String str) {
        this.mData = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setCustomType(String str) {
        this.mCustomType = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setMentionType(MentionType mentionType) {
        this.mMentionType = mentionType;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setMentionedUsers(List<User> list) {
        String userId;
        if (this.mMentionedUserIds == null) {
            this.mMentionedUserIds = new ArrayList();
        }
        this.mMentionedUserIds.clear();
        if (list != null && list.size() > 0) {
            ArrayList<User> arrayList = new ArrayList(new LinkedHashSet(list));
            String userId2 = SendBird.getCurrentUser() != null ? SendBird.getCurrentUser().getUserId() : null;
            for (User user : arrayList) {
                if (user != null && (userId = user.getUserId()) != null && userId.length() > 0 && (userId2 == null || !userId2.equals(userId))) {
                    this.mMentionedUserIds.add(user.getUserId());
                }
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setMentionedUserIds(List<String> list) {
        if (this.mMentionedUserIds == null) {
            this.mMentionedUserIds = new ArrayList();
        }
        this.mMentionedUserIds.clear();
        if (list != null && list.size() > 0) {
            ArrayList<String> arrayList = new ArrayList(new LinkedHashSet(list));
            String userId = SendBird.getCurrentUser() != null ? SendBird.getCurrentUser().getUserId() : null;
            for (String str : arrayList) {
                if (str != null && str.length() > 0 && (userId == null || !userId.equals(str))) {
                    this.mMentionedUserIds.add(str);
                }
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setPushNotificationDeliveryOption(PushNotificationDeliveryOption pushNotificationDeliveryOption) {
        this.mPushNotificationDeliveryOption = pushNotificationDeliveryOption;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public BaseMessageParams setMetaArrayKeys(List<String> list) {
        synchronized (this) {
            if (list != null) {
                if (list.size() > 0) {
                    ArrayList<String> arrayList = new ArrayList(new LinkedHashSet(list));
                    if (this.mMetaArrays == null) {
                        this.mMetaArrays = new ArrayList();
                    }
                    for (String str : arrayList) {
                        if (str != null) {
                            this.mMetaArrays.add(new MessageMetaArray(str));
                        }
                    }
                }
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseMessageParams setMetaArrays(List<MessageMetaArray> list) {
        synchronized (this) {
            this.mMetaArrays = new ArrayList();
            if (list != null && !list.isEmpty()) {
                for (MessageMetaArray messageMetaArray : list) {
                    int indexOf = this.mMetaArrays.indexOf(messageMetaArray);
                    if (indexOf != -1) {
                        this.mMetaArrays.get(indexOf).addValue(messageMetaArray.getValue());
                    } else {
                        this.mMetaArrays.add(messageMetaArray);
                    }
                }
            }
        }
        return this;
    }

    public String toString() {
        return "BaseMessageParams{mData='" + this.mData + "', mCustomType='" + this.mCustomType + "', mMentionType=" + this.mMentionType + ", mMentionedUserIds=" + this.mMentionedUserIds + ", mPushNotificationDeliveryOption=" + this.mPushNotificationDeliveryOption + ", mMetaArrays=" + this.mMetaArrays + '}';
    }
}
