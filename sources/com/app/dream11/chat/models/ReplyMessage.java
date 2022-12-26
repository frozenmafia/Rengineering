package com.app.dream11.chat.models;

import o.isFullSpan;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ReplyMessage {
    @isFullSpan(valueOf = "createdAt")
    private final long createdAt;
    @isFullSpan(valueOf = "customType")
    private final String customType;
    @isFullSpan(valueOf = "gifMediaId")
    private final String gifMediaId;
    private boolean isSupportedReplyMessage;
    @isFullSpan(valueOf = "mediaType")
    private final String mediaType;
    @isFullSpan(valueOf = "messageFilePath")
    private final String messageFilePath;
    @isFullSpan(valueOf = "messageId")
    private final long messageId;
    @isFullSpan(valueOf = "messageText")
    private final String messageText;
    @isFullSpan(valueOf = "messageSender")
    private final ReplyMessageSender senderReply;
    @isFullSpan(valueOf = "version")
    private final int version;

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.customType;
    }

    public final String component3() {
        return this.messageText;
    }

    public final String component4() {
        return this.messageFilePath;
    }

    public final long component5() {
        return this.messageId;
    }

    public final long component6() {
        return this.createdAt;
    }

    public final ReplyMessageSender component7() {
        return this.senderReply;
    }

    public final String component8() {
        return this.mediaType;
    }

    public final String component9() {
        return this.gifMediaId;
    }

    public final ReplyMessage copy(int i, String str, String str2, String str3, long j, long j2, ReplyMessageSender replyMessageSender, String str4, String str5) {
        runAnimators.ag$a(str, "customType");
        runAnimators.ag$a(replyMessageSender, "senderReply");
        return new ReplyMessage(i, str, str2, str3, j, j2, replyMessageSender, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReplyMessage) {
            ReplyMessage replyMessage = (ReplyMessage) obj;
            return this.version == replyMessage.version && runAnimators.values((Object) this.customType, (Object) replyMessage.customType) && runAnimators.values((Object) this.messageText, (Object) replyMessage.messageText) && runAnimators.values((Object) this.messageFilePath, (Object) replyMessage.messageFilePath) && this.messageId == replyMessage.messageId && this.createdAt == replyMessage.createdAt && runAnimators.values(this.senderReply, replyMessage.senderReply) && runAnimators.values((Object) this.mediaType, (Object) replyMessage.mediaType) && runAnimators.values((Object) this.gifMediaId, (Object) replyMessage.gifMediaId);
        }
        return false;
    }

    public int hashCode() {
        int i = this.version;
        int hashCode = this.customType.hashCode();
        String str = this.messageText;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.messageFilePath;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int m = ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.messageId);
        int m2 = ChatMessageSectionKey$$ExternalSyntheticBackport0.m(this.createdAt);
        int hashCode4 = this.senderReply.hashCode();
        String str3 = this.mediaType;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.gifMediaId;
        return (((((((((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + m) * 31) + m2) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = this.version;
        String str = this.customType;
        String str2 = this.messageText;
        String str3 = this.messageFilePath;
        long j = this.messageId;
        long j2 = this.createdAt;
        ReplyMessageSender replyMessageSender = this.senderReply;
        String str4 = this.mediaType;
        String str5 = this.gifMediaId;
        return "ReplyMessage(version=" + i + ", customType=" + str + ", messageText=" + str2 + ", messageFilePath=" + str3 + ", messageId=" + j + ", createdAt=" + j2 + ", senderReply=" + replyMessageSender + ", mediaType=" + str4 + ", gifMediaId=" + str5 + ")";
    }

    public ReplyMessage(int i, String str, String str2, String str3, long j, long j2, ReplyMessageSender replyMessageSender, String str4, String str5) {
        runAnimators.ag$a(str, "customType");
        runAnimators.ag$a(replyMessageSender, "senderReply");
        this.version = i;
        this.customType = str;
        this.messageText = str2;
        this.messageFilePath = str3;
        this.messageId = j;
        this.createdAt = j2;
        this.senderReply = replyMessageSender;
        this.mediaType = str4;
        this.gifMediaId = str5;
        this.isSupportedReplyMessage = true;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getCustomType() {
        return this.customType;
    }

    public final String getMessageText() {
        return this.messageText;
    }

    public final String getMessageFilePath() {
        return this.messageFilePath;
    }

    public final long getMessageId() {
        return this.messageId;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final ReplyMessageSender getSenderReply() {
        return this.senderReply;
    }

    public final String getMediaType() {
        return this.mediaType;
    }

    public final String getGifMediaId() {
        return this.gifMediaId;
    }

    public final boolean isSupportedReplyMessage() {
        return this.isSupportedReplyMessage;
    }

    public final void setSupportedReplyMessage(boolean z) {
        this.isSupportedReplyMessage = z;
    }
}
