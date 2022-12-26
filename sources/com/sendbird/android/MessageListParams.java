package com.sendbird.android;

import com.sendbird.android.BaseChannel;
import java.util.List;
/* loaded from: classes7.dex */
public class MessageListParams extends BaseMessageListParams {
    protected boolean includeReplies;
    protected boolean includeThreadInfo;
    protected boolean showSubchannelMessagesOnly;

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ String getCustomType() {
        return super.getCustomType();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ BaseChannel.MessageTypeFilter getMessageType() {
        return super.getMessageType();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ int getNextResultSize() {
        return super.getNextResultSize();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ int getPreviousResultSize() {
        return super.getPreviousResultSize();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ List getSenderUserIds() {
        return super.getSenderUserIds();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ boolean isInclusive() {
        return super.isInclusive();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setCustomType(String str) {
        super.setCustomType(str);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setIncludeMetaArray(boolean z) {
        super.setIncludeMetaArray(z);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setIncludeParentMessageText(boolean z) {
        super.setIncludeParentMessageText(z);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setIncludeReactions(boolean z) {
        super.setIncludeReactions(z);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setInclusive(boolean z) {
        super.setInclusive(z);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setMessageType(BaseChannel.MessageTypeFilter messageTypeFilter) {
        super.setMessageType(messageTypeFilter);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setNextResultSize(int i) {
        super.setNextResultSize(i);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setPreviousResultSize(int i) {
        super.setPreviousResultSize(i);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setReverse(boolean z) {
        super.setReverse(z);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ void setSenderUserIds(List list) {
        super.setSenderUserIds(list);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ boolean shouldIncludeMetaArray() {
        return super.shouldIncludeMetaArray();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ boolean shouldIncludeParentMessageText() {
        return super.shouldIncludeParentMessageText();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ boolean shouldIncludeReactions() {
        return super.shouldIncludeReactions();
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public /* bridge */ /* synthetic */ boolean shouldReverse() {
        return super.shouldReverse();
    }

    public MessageListParams() {
        this.showSubchannelMessagesOnly = false;
        this.includeThreadInfo = false;
        this.includeReplies = false;
    }

    public MessageListParams(int i, int i2, BaseChannel.MessageTypeFilter messageTypeFilter, String str, List<String> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(i, i2, messageTypeFilter, str, list, z, z2, z3, z4, z5);
        this.showSubchannelMessagesOnly = false;
        this.includeThreadInfo = z6;
        this.includeReplies = z7;
    }

    public void setIncludeThreadInfo(boolean z) {
        this.includeThreadInfo = z;
    }

    public void setIncludeReplies(boolean z) {
        this.includeReplies = z;
    }

    public void setShowSubchannelMessagesOnly(boolean z) {
        this.showSubchannelMessagesOnly = z;
    }

    public boolean shouldIncludeThreadInfo() {
        return this.includeThreadInfo;
    }

    public boolean shouldIncludeReplies() {
        return this.includeReplies;
    }

    public boolean shouldShowSubchannelMessagesOnly() {
        return this.showSubchannelMessagesOnly;
    }

    /* renamed from: clone */
    public MessageListParams m1227clone() {
        return new MessageListParams(this.previousResultSize, this.nextResultSize, this.messageType, this.customType, this.senderUserIds, this.isInclusive, this.reverse, this.includeMetaArray, this.includeReactions, this.includeParentMessageText, this.includeThreadInfo, this.includeReplies);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public String toString() {
        return "MessageListParams{includeThreadInfo=" + this.includeThreadInfo + ", includeReplies=" + this.includeReplies + ", previousResultSize=" + this.previousResultSize + ", nextResultSize=" + this.nextResultSize + ", messageType=" + this.messageType + ", customType='" + this.customType + "', senderUserIds=" + this.senderUserIds + ", isInclusive=" + this.isInclusive + ", reverse=" + this.reverse + ", includeMetaArray=" + this.includeMetaArray + ", includeReactions=" + this.includeReactions + ", includeParentMessageText=" + this.includeParentMessageText + ", showSubchannelMessagesOnly=" + this.showSubchannelMessagesOnly + '}';
    }
}
