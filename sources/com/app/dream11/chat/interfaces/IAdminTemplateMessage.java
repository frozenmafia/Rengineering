package com.app.dream11.chat.interfaces;

import com.app.dream11.chat.models.AdminMessageTemplate;
/* loaded from: classes.dex */
public interface IAdminTemplateMessage extends IMessage {
    AdminMessageTemplate getAdminMessageTemplateMessage();

    boolean getShouldShowPush();

    boolean isAutomaticContestAdminMessage();
}
