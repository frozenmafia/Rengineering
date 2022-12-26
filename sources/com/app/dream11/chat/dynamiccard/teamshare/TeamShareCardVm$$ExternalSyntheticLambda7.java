package com.app.dream11.chat.dynamiccard.teamshare;

import com.app.dream11.core.service.graphql.api.Social.chat.DynamicTeamShareChatCardQuery;
import java.util.Date;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class TeamShareCardVm$$ExternalSyntheticLambda7 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ TeamShareCardVm$$ExternalSyntheticLambda7 INSTANCE = new TeamShareCardVm$$ExternalSyntheticLambda7();

    private /* synthetic */ TeamShareCardVm$$ExternalSyntheticLambda7() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Date m291timeUntilRoundLock$lambda1;
        m291timeUntilRoundLock$lambda1 = TeamShareCardVm.m291timeUntilRoundLock$lambda1((DynamicTeamShareChatCardQuery.Data) obj);
        return m291timeUntilRoundLock$lambda1;
    }
}
