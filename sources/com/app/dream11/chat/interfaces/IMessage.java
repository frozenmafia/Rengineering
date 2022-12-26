package com.app.dream11.chat.interfaces;

import com.app.dream11.chat.models.ChatMessageState;
import com.app.dream11.chat.models.ReplyMessage;
import com.app.dream11.chat.reaction.ChatReactionData;
import com.sendbird.android.BaseMessage;
import o.measureChildView;
/* loaded from: classes.dex */
public interface IMessage {
    ReplyMessage convertToReplyMessage();

    String getCustomType();

    String getData();

    measureChildView getLinkPreview();

    String getLocalId();

    String getMessage();

    long getMessageId();

    ChatMessageState getMessageState();

    long getMessageTimestamp();

    ReplyMessage getParentMessage();

    ChatReactionData getReactionData(BaseMessage baseMessage);

    String getReadableTimestamp();

    BaseMessage getSendbirdBaseMessage();

    IChatUser getSender();

    String getSenderId();

    String getSenderName();

    String getSenderTeamName();

    void setCustomType(String str);

    void setData(String str);

    void setLinkPreview(measureChildView measurechildview);

    void setMessage(String str);

    void setMessageId(long j);

    void setMessageState(ChatMessageState chatMessageState);

    void setMessageTimestamp(long j);

    void setParentMessage(ReplyMessage replyMessage);

    void setReadableTimestamp(String str);

    void setSendbirdBaseMessage(BaseMessage baseMessage);

    void setSender(IChatUser iChatUser);

    void setSenderId(String str);

    void setSenderName(String str);

    void setSenderTeamName(String str);
}
