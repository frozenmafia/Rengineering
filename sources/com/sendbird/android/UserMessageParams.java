package com.sendbird.android;

import com.sendbird.android.BaseMessageParams;
import java.util.List;
/* loaded from: classes5.dex */
public class UserMessageParams extends BaseMessageParams {
    String mMessage;
    List<String> mTargetLanguages;

    @Override // com.sendbird.android.BaseMessageParams
    public /* bridge */ /* synthetic */ BaseMessageParams setMentionedUserIds(List list) {
        return setMentionedUserIds((List<String>) list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public /* bridge */ /* synthetic */ BaseMessageParams setMentionedUsers(List list) {
        return setMentionedUsers((List<User>) list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    @Deprecated
    public /* bridge */ /* synthetic */ BaseMessageParams setMetaArrayKeys(List list) {
        return setMetaArrayKeys((List<String>) list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public /* bridge */ /* synthetic */ BaseMessageParams setMetaArrays(List list) {
        return setMetaArrays((List<MessageMetaArray>) list);
    }

    public UserMessageParams() {
        this.mMessage = null;
    }

    public UserMessageParams(String str) {
        this.mMessage = str;
    }

    public UserMessageParams setMessage(String str) {
        this.mMessage = str;
        return this;
    }

    @Deprecated
    public UserMessageParams setTargetLanguages(List<String> list) {
        this.mTargetLanguages = list;
        return this;
    }

    public UserMessageParams setTranslationTargetLanguages(List<String> list) {
        this.mTargetLanguages = list;
        return this;
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setData(String str) {
        return (UserMessageParams) super.setData(str);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setCustomType(String str) {
        return (UserMessageParams) super.setCustomType(str);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setMentionType(BaseMessageParams.MentionType mentionType) {
        return (UserMessageParams) super.setMentionType(mentionType);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setMentionedUsers(List<User> list) {
        return (UserMessageParams) super.setMentionedUsers(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setMentionedUserIds(List<String> list) {
        return (UserMessageParams) super.setMentionedUserIds(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setPushNotificationDeliveryOption(BaseMessageParams.PushNotificationDeliveryOption pushNotificationDeliveryOption) {
        return (UserMessageParams) super.setPushNotificationDeliveryOption(pushNotificationDeliveryOption);
    }

    @Override // com.sendbird.android.BaseMessageParams
    @Deprecated
    public UserMessageParams setMetaArrayKeys(List<String> list) {
        return (UserMessageParams) super.setMetaArrayKeys(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setMetaArrays(List<MessageMetaArray> list) {
        return (UserMessageParams) super.setMetaArrays(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public UserMessageParams setParentMessageId(long j) {
        return (UserMessageParams) super.setParentMessageId(j);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public String toString() {
        return "UserMessageParams{mMessage='" + this.mMessage + "', mTargetLanguages=" + this.mTargetLanguages + ", mData='" + this.mData + "', mCustomType='" + this.mCustomType + "', mMentionType=" + this.mMentionType + ", mMentionedUserIds=" + this.mMentionedUserIds + ", mPushNotificationDeliveryOption=" + this.mPushNotificationDeliveryOption + ", mMetaArrays=" + this.mMetaArrays + ", parentMessageId=" + this.parentMessageId + '}';
    }
}
