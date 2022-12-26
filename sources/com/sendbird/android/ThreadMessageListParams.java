package com.sendbird.android;

import com.sendbird.android.BaseChannel;
import java.util.List;
/* loaded from: classes7.dex */
public class ThreadMessageListParams extends BaseMessageListParams {
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

    public ThreadMessageListParams() {
    }

    public ThreadMessageListParams(int i, int i2, BaseChannel.MessageTypeFilter messageTypeFilter, String str, List<String> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(i, i2, messageTypeFilter, str, list, z, z2, z3, z4, z5);
    }

    /* renamed from: clone */
    public ThreadMessageListParams m1228clone() {
        return new ThreadMessageListParams(this.previousResultSize, this.nextResultSize, this.messageType, this.customType, this.senderUserIds, this.isInclusive, this.reverse, this.includeMetaArray, this.includeReactions, this.includeParentMessageText);
    }

    @Override // com.sendbird.android.BaseMessageListParams
    public String toString() {
        return "ThreadMessageListParams{previousResultSize=" + this.previousResultSize + ", nextResultSize=" + this.nextResultSize + ", messageType=" + this.messageType + ", customType='" + this.customType + "', senderUserIds=" + this.senderUserIds + ", isInclusive=" + this.isInclusive + ", reverse=" + this.reverse + ", includeMetaArray=" + this.includeMetaArray + ", includeReactions=" + this.includeReactions + ", includeParentMessageText=" + this.includeParentMessageText + '}';
    }
}
