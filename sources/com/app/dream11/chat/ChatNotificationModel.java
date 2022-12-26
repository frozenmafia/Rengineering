package com.app.dream11.chat;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import com.app.dream11.chat.models.ChatMessageTypeSupportHelper;
import com.app.dream11.chat.models.ChatType;
import o.runAnimators;
/* loaded from: classes.dex */
public final class ChatNotificationModel {
    private final ChatChannelInfo chatChannelInfo;
    private final ChatMessageInfo chatMessageInfo;
    private final Spanned formattedText;
    private final long timestamp;

    public ChatNotificationModel(ChatChannelInfo chatChannelInfo, ChatMessageInfo chatMessageInfo) {
        Spanned fromHtml;
        runAnimators.ag$a(chatChannelInfo, "chatChannelInfo");
        runAnimators.ag$a(chatMessageInfo, "chatMessageInfo");
        this.chatChannelInfo = chatChannelInfo;
        this.chatMessageInfo = chatMessageInfo;
        this.timestamp = System.currentTimeMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            fromHtml = Html.fromHtml(getFinalMessageText(), 0);
        } else {
            fromHtml = Html.fromHtml(getFinalMessageText());
        }
        this.formattedText = fromHtml;
    }

    public final ChatChannelInfo getChatChannelInfo() {
        return this.chatChannelInfo;
    }

    public final ChatMessageInfo getChatMessageInfo() {
        return this.chatMessageInfo;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isNotificationDisplayable() {
        return ChatMessageTypeSupportHelper.Companion.isMessageCustomTypeSupportedForNotification(this.chatMessageInfo.getMessageCustomType());
    }

    public final String getChatNotificationTitle() {
        String teamName;
        if (isDM()) {
            ChatSenderInfo messageSender = this.chatMessageInfo.getMessageSender();
            return (messageSender == null || (teamName = messageSender.getTeamName()) == null) ? "" : teamName;
        }
        return this.chatChannelInfo.getName();
    }

    public final String getChatId() {
        return this.chatChannelInfo.getId();
    }

    private final String getFinalMessageText() {
        if (isDM()) {
            return this.chatMessageInfo.getMessageTextWithIcons();
        }
        if (runAnimators.values((Object) "DREAM11_ADMIN_MESSAGE", (Object) this.chatMessageInfo.getMessageCustomType())) {
            String messageTextWithIcons = this.chatMessageInfo.getMessageTextWithIcons();
            return "<i>" + messageTextWithIcons + "</i>";
        } else if (this.chatMessageInfo.getMessageSender() != null) {
            String teamName = this.chatMessageInfo.getMessageSender().getTeamName();
            String messageTextWithIcons2 = this.chatMessageInfo.getMessageTextWithIcons();
            return "<b>" + teamName + "</b> : " + messageTextWithIcons2;
        } else {
            return this.chatMessageInfo.getMessageTextWithIcons();
        }
    }

    public final Spanned getFormattedText() {
        return this.formattedText;
    }

    public final String getChatNotificationPicUrl() {
        String profilePic;
        if (isDM()) {
            ChatSenderInfo messageSender = this.chatMessageInfo.getMessageSender();
            return (messageSender == null || (profilePic = messageSender.getProfilePic()) == null) ? "" : profilePic;
        }
        return this.chatChannelInfo.getCoverUrl();
    }

    private final boolean isDM() {
        return runAnimators.values((Object) ChatType.DM.name(), (Object) this.chatChannelInfo.getCustomType());
    }
}
