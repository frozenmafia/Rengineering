package com.app.dream11.chat.dynamiccard.teamshare;

import com.app.dream11.core.service.graphql.api.Social.chat.DynamicTeamShareChatCardQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class TeamShareCardVm$$ExternalSyntheticLambda6 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ TeamShareCardVm$$ExternalSyntheticLambda6 INSTANCE = new TeamShareCardVm$$ExternalSyntheticLambda6();

    private /* synthetic */ TeamShareCardVm$$ExternalSyntheticLambda6() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m290sharedTeamPoints$lambda2;
        m290sharedTeamPoints$lambda2 = TeamShareCardVm.m290sharedTeamPoints$lambda2((DynamicTeamShareChatCardQuery.Data) obj);
        return m290sharedTeamPoints$lambda2;
    }
}
