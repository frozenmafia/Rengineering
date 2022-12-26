package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda12 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda12 INSTANCE = new SideNavVm$$ExternalSyntheticLambda12();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda12() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1002isBadgesUnseen$lambda10;
        m1002isBadgesUnseen$lambda10 = SideNavVm.m1002isBadgesUnseen$lambda10((SideNavQuery.Data) obj);
        return m1002isBadgesUnseen$lambda10;
    }
}
