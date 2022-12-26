package com.app.dream11.model;

import com.app.dream11.core.service.graphql.api.SideNavQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes3.dex */
public final /* synthetic */ class SideNavVm$$ExternalSyntheticLambda13 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ SideNavVm$$ExternalSyntheticLambda13 INSTANCE = new SideNavVm$$ExternalSyntheticLambda13();

    private /* synthetic */ SideNavVm$$ExternalSyntheticLambda13() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m1007isSkillScoreLocked$lambda6;
        m1007isSkillScoreLocked$lambda6 = SideNavVm.m1007isSkillScoreLocked$lambda6((SideNavQuery.Data) obj);
        return m1007isSkillScoreLocked$lambda6;
    }
}
