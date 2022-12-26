package com.app.dream11.chat.viewmodels;

import android.view.MotionEvent;
import com.app.dream11.chat.interfaces.IMessage;
import com.app.dream11.chat.models.ChatContestCard;
import com.app.dream11.chat.models.ReplyMessage;
import com.app.dream11.chat.reaction.ChatReactionItemVM;
/* loaded from: classes.dex */
public interface IMessageHandler {
    void onAdminMessageCTAClicked(String str, String str2);

    void onAppUpdateRequested();

    void onChatImageClicked(String str, IMessage iMessage);

    void onContestCardClicked(ChatContestCard chatContestCard);

    void onContestJoinRequested(ChatContestCard chatContestCard);

    void onGIFLoadingResponse(String str, Throwable th);

    void onGetSharedTeamClicked(IMessage iMessage, String str);

    void onGifPlayToggle(String str, String str2, String str3);

    void onLinkClicked(String str);

    void onLinkLongClicked(String str);

    void onMessageDoubleTapped(ChatMessageVM chatMessageVM, MotionEvent motionEvent);

    void onMessageLongClicked(ChatMessageVM chatMessageVM, MotionEvent motionEvent);

    void onMessageReactionClicked(ChatMessageVM chatMessageVM, ChatReactionItemVM chatReactionItemVM);

    void onReplyMessageClicked(String str, ReplyMessage replyMessage);

    void onTeamShareCardClicked(IMessage iMessage, String str, boolean z);

    void onUserProfileRequested(String str, String str2);

    void openReactionBottomSheet(ChatMessageVM chatMessageVM);

    void trackTeamCardLoaded(IMessage iMessage, boolean z);
}
