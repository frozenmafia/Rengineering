package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda7 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda7 INSTANCE = new SideNavVm$$ExternalSyntheticLambda7();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda7() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1012shouldShowSkillScore$lambda5;
        m1012shouldShowSkillScore$lambda5 = SideNavVm.m1012shouldShowSkillScore$lambda5((SideNavQuery.Data) obj);
        return m1012shouldShowSkillScore$lambda5;
    }
}
