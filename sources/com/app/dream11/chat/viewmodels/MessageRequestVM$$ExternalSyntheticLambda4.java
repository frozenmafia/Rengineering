package com.app.dream11.chat.viewmodels;

import com.app.dream11.core.service.graphql.api.MessageRequestFormDataQuery;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class MessageRequestVM$$ExternalSyntheticLambda4 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ MessageRequestVM$$ExternalSyntheticLambda4 INSTANCE = new MessageRequestVM$$ExternalSyntheticLambda4();

    private /* synthetic */ MessageRequestVM$$ExternalSyntheticLambda4() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        String m944profilePicUrl$lambda2;
        m944profilePicUrl$lambda2 = MessageRequestVM.m944profilePicUrl$lambda2((MessageRequestFormDataQuery.Data) obj);
        return m944profilePicUrl$lambda2;
    }
}
