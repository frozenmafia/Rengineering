package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda8 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda8 INSTANCE = new SideNavVm$$ExternalSyntheticLambda8();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda8() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m1011officialTickUrl$lambda12;
        m1011officialTickUrl$lambda12 = SideNavVm.m1011officialTickUrl$lambda12((SideNavQuery.Data) obj);
        return m1011officialTickUrl$lambda12;
    }
}
