package com.app.dream11.chat.viewmodels;

import com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class MessageRequestVM$$ExternalSyntheticLambda3 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ MessageRequestVM$$ExternalSyntheticLambda3 INSTANCE = new MessageRequestVM$$ExternalSyntheticLambda3();

    private /* synthetic */ MessageRequestVM$$ExternalSyntheticLambda3() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m946teamName$lambda0;
        m946teamName$lambda0 = MessageRequestVM.m946teamName$lambda0((MessageRequestFormDataQuery.Data) obj);
        return m946teamName$lambda0;
    }
}
