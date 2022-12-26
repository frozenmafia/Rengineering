package com.app.dream11.chat.models;

import com.app.dream11.chat.interfaces.IChatUser;
import com.app.dream11.chat.interfaces.IUnsupportedMessages;
import com.sendbird.android.BaseMessage;
import o.measureChildView;
import o.runAnimators;
/* loaded from: classes.dex */
public final class UnsupportedMessage extends BaseChatMessage implements IUnsupportedMessages {
    private measureChildView linkPreview;
    private final String localId;
    private String message;
    private ChatMessageState messageState;
    private IChatUser sender;
    private String senderId;
    private String senderName;
    private String senderTeamName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedMessage(BaseMessage baseMessage) {
        super(baseMessage);
        runAnimators.ag$a(baseMessage, "baseMessage");
        this.message = "You need the latest version of the app to view this.";
        this.localId = "";
        this.messageState = ChatMessageState.SENT;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public String getMessage() {
        return this.message;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setMessage(String str) {
        this.message = str;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public String getSenderName() {
        return this.senderName;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setSenderName(String str) {
        this.senderName = str;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public String getSenderId() {
        return this.senderId;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setSenderId(String str) {
        this.senderId = str;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public String getSenderTeamName() {
        return this.senderTeamName;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setSenderTeamName(String str) {
        this.senderTeamName = str;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public String getLocalId() {
        return this.localId;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public IChatUser getSender() {
        return this.sender;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setSender(IChatUser iChatUser) {
        this.sender = iChatUser;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public measureChildView getLinkPreview() {
        return this.linkPreview;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setLinkPreview(measureChildView measurechildview) {
        this.linkPreview = measurechildview;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public ChatMessageState getMessageState() {
        return this.messageState;
    }

    @Override // com.app.dream11.chat.interfaces.IMessage
    public void setMessageState(ChatMessageState chatMessageState) {
        runAnimators.ag$a(chatMessageState, "<set-?>");
        this.messageState = chatMessageState;
    }
}
