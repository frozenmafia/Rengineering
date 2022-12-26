package com.app.dream11.chat.viewmodels;

import com.app.dream11.social.contactsync.viewmodels.SyncState;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class Dream11ContactsListVM$$ExternalSyntheticLambda5 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ Dream11ContactsListVM$$ExternalSyntheticLambda5 INSTANCE = new Dream11ContactsListVM$$ExternalSyntheticLambda5();

    private /* synthetic */ Dream11ContactsListVM$$ExternalSyntheticLambda5() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m869canUserSearch$lambda1;
        m869canUserSearch$lambda1 = Dream11ContactsListVM.m869canUserSearch$lambda1((SyncState) obj);
        return m869canUserSearch$lambda1;
    }
}
