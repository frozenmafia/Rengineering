package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda3 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda3 INSTANCE = new SideNavVm$$ExternalSyntheticLambda3();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda3() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Integer m1013skillScore$lambda4;
        m1013skillScore$lambda4 = SideNavVm.m1013skillScore$lambda4((SideNavQuery.Data) obj);
        return m1013skillScore$lambda4;
    }
}
