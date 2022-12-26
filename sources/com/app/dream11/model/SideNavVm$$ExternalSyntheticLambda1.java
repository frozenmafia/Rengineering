package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda1 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda1 INSTANCE = new SideNavVm$$ExternalSyntheticLambda1();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda1() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m1001badgesText$lambda8;
        m1001badgesText$lambda8 = SideNavVm.m1001badgesText$lambda8((SideNavQuery.Data) obj);
        return m1001badgesText$lambda8;
    }
}
