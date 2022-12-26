package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda6 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda6 INSTANCE = new SideNavVm$$ExternalSyntheticLambda6();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda6() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m1014url$lambda2;
        m1014url$lambda2 = SideNavVm.m1014url$lambda2((SideNavQuery.Data) obj);
        return m1014url$lambda2;
    }
}
