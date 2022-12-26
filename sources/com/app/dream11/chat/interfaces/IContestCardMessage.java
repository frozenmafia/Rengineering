package com.app.dream11.chat.interfaces;

import com.app.dream11.chat.models.ChatContestCard;
import com.app.dream11.core.service.graphql.api.Social.chat.DynamicContestChatCardQuery;
import o.Styleable;
import o.SupportSQLiteQuery;
/* loaded from: classes.dex */
public interface IContestCardMessage extends ITextMessage {
    ChatContestCard getContestCard();

    Styleable.ChangeBounds<ChatContestCard, SupportSQLiteQuery<DynamicContestChatCardQuery.Data>> getQueryObservable();
}
