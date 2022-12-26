package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda9 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda9 INSTANCE = new SideNavVm$$ExternalSyntheticLambda9();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda9() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1003isBadgesVisible$lambda7;
        m1003isBadgesVisible$lambda7 = SideNavVm.m1003isBadgesVisible$lambda7((SideNavQuery.Data) obj);
        return m1003isBadgesVisible$lambda7;
    }
}
