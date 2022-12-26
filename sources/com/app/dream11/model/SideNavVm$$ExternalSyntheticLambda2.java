package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda2 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda2 INSTANCE = new SideNavVm$$ExternalSyntheticLambda2();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda2() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Double m1000amount$lambda1;
        m1000amount$lambda1 = SideNavVm.m1000amount$lambda1((SideNavQuery.Data) obj);
        return m1000amount$lambda1;
    }
}
