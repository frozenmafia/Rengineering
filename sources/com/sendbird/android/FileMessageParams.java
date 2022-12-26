package com.sendbird.android;

import com.sendbird.android.BaseMessageParams;
import com.sendbird.android.FileMessage;
import java.io.File;
import java.util.List;
/* loaded from: classes5.dex */
public class FileMessageParams extends BaseMessageParams {
    String mFileName;
    Integer mFileSize;
    Object mFileUrlOrFile;
    String mMimeType;
    List<FileMessage.ThumbnailSize> mThumbnailSizes;

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

    public FileMessageParams() {
        this.mFileUrlOrFile = null;
    }

    public FileMessageParams(String str) {
        this.mFileUrlOrFile = str;
    }

    public FileMessageParams(File file) {
        this.mFileUrlOrFile = file;
    }

    public FileMessageParams setFileUrl(String str) {
        this.mFileUrlOrFile = str;
        return this;
    }

    public FileMessageParams setFile(File file) {
        this.mFileUrlOrFile = file;
        return this;
    }

    public FileMessageParams setFileName(String str) {
        this.mFileName = str;
        return this;
    }

    public FileMessageParams setMimeType(String str) {
        this.mMimeType = str;
        return this;
    }

    public FileMessageParams setFileSize(int i) {
        this.mFileSize = Integer.valueOf(i);
        return this;
    }

    public FileMessageParams setThumbnailSizes(List<FileMessage.ThumbnailSize> list) {
        this.mThumbnailSizes = list;
        return this;
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setData(String str) {
        return (FileMessageParams) super.setData(str);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setCustomType(String str) {
        return (FileMessageParams) super.setCustomType(str);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setMentionType(BaseMessageParams.MentionType mentionType) {
        return (FileMessageParams) super.setMentionType(mentionType);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setMentionedUsers(List<User> list) {
        return (FileMessageParams) super.setMentionedUsers(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setMentionedUserIds(List<String> list) {
        return (FileMessageParams) super.setMentionedUserIds(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setPushNotificationDeliveryOption(BaseMessageParams.PushNotificationDeliveryOption pushNotificationDeliveryOption) {
        return (FileMessageParams) super.setPushNotificationDeliveryOption(pushNotificationDeliveryOption);
    }

    @Override // com.sendbird.android.BaseMessageParams
    @Deprecated
    public FileMessageParams setMetaArrayKeys(List<String> list) {
        return (FileMessageParams) super.setMetaArrayKeys(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setMetaArrays(List<MessageMetaArray> list) {
        return (FileMessageParams) super.setMetaArrays(list);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public FileMessageParams setParentMessageId(long j) {
        return (FileMessageParams) super.setParentMessageId(j);
    }

    @Override // com.sendbird.android.BaseMessageParams
    public String toString() {
        return "FileMessageParams{mFileUrlOrFile=" + this.mFileUrlOrFile + ", mFileName='" + this.mFileName + "', mMimeType='" + this.mMimeType + "', mFileSize=" + this.mFileSize + ", mThumbnailSizes=" + this.mThumbnailSizes + ", mData='" + this.mData + "', mCustomType='" + this.mCustomType + "', mMentionType=" + this.mMentionType + ", mMentionedUserIds=" + this.mMentionedUserIds + ", mPushNotificationDeliveryOption=" + this.mPushNotificationDeliveryOption + ", mMetaArrays=" + this.mMetaArrays + ", parentMessageId=" + this.parentMessageId + '}';
    }
}
