package com.app.dream11.chat.groups;

import com.app.dream11.core.service.graphql.api.Social.GetMappedChatOfContestQuery;
import o.FrameworkSQLiteOpenHelperFactory;
import o.getStateSet;
/* loaded from: classes.dex */
public final /* synthetic */ class GroupsBottomSheetPresenter$$ExternalSyntheticLambda8 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ GroupsBottomSheetPresenter$$ExternalSyntheticLambda8 INSTANCE = new GroupsBottomSheetPresenter$$ExternalSyntheticLambda8();

    private /* synthetic */ GroupsBottomSheetPresenter$$ExternalSyntheticLambda8() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        getStateSet m363getLinkedContestChannel$lambda8;
        m363getLinkedContestChannel$lambda8 = GroupsBottomSheetPresenter.m363getLinkedContestChannel$lambda8((GetMappedChatOfContestQuery.Data) obj);
        return m363getLinkedContestChannel$lambda8;
    }
}
