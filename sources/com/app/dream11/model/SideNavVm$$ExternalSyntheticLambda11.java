package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda11 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda11 INSTANCE = new SideNavVm$$ExternalSyntheticLambda11();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda11() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1005isOfficialTickVisible$lambda14;
        m1005isOfficialTickVisible$lambda14 = SideNavVm.m1005isOfficialTickVisible$lambda14((SideNavQuery.Data) obj);
        return m1005isOfficialTickVisible$lambda14;
    }
}
