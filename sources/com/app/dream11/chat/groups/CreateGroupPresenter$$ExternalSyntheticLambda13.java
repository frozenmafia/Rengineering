package com.app.dream11.chat.groups;

import com.app.dream11.core.service.graphql.api.Social.chat.IsUserBannedFromChatQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class CreateGroupPresenter$$ExternalSyntheticLambda13 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ CreateGroupPresenter$$ExternalSyntheticLambda13 INSTANCE = new CreateGroupPresenter$$ExternalSyntheticLambda13();

    private /* synthetic */ CreateGroupPresenter$$ExternalSyntheticLambda13() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m312getIsUserBannedFromChatObservable$lambda19;
        m312getIsUserBannedFromChatObservable$lambda19 = CreateGroupPresenter.m312getIsUserBannedFromChatObservable$lambda19((IsUserBannedFromChatQuery.Data) obj);
        return m312getIsUserBannedFromChatObservable$lambda19;
    }
}
