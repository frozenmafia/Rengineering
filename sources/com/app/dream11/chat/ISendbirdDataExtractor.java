package com.app.dream11.chat;

import com.app.dream11.chat.interfaces.IChatUser;
import com.app.dream11.chat.interfaces.IGroupUser;
import com.app.dream11.chat.interfaces.IMessage;
import com.app.dream11.model.ErrorModel;
import com.sendbird.android.BaseChannel;
import com.sendbird.android.BaseMessage;
import com.sendbird.android.Member;
import com.sendbird.android.User;
/* loaded from: classes.dex */
public interface ISendbirdDataExtractor {
    String getEncryptedData(String str);

    String getGroupUrl(String str);

    IGroupUser getGroupUser(Member member);

    IMessage getMessage(BaseMessage baseMessage);

    String getStringFromStorage(String str);

    IChatUser getUserInfo(User user);

    ErrorModel mapErrorFromSendbird(Throwable th);

    void onGroupMuteStatusChanged(BaseChannel baseChannel);

    void onMessageRead(BaseChannel baseChannel);

    void onMessageSent(BaseChannel baseChannel);

    void setStringToStorage(String str, String str2);
}
