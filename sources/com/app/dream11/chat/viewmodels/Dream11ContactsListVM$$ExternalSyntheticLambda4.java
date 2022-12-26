package com.app.dream11.chat.viewmodels;

import com.app.dream11.social.contactsync.viewmodels.SyncState;
import o.FrameworkSQLiteOpenHelperFactory;
/* loaded from: classes.dex */
public final /* synthetic */ class Dream11ContactsListVM$$ExternalSyntheticLambda4 implements FrameworkSQLiteOpenHelperFactory {
    public static final /* synthetic */ Dream11ContactsListVM$$ExternalSyntheticLambda4 INSTANCE = new Dream11ContactsListVM$$ExternalSyntheticLambda4();

    private /* synthetic */ Dream11ContactsListVM$$ExternalSyntheticLambda4() {
    }

    @Override // o.FrameworkSQLiteOpenHelperFactory
    public final Object apply(Object obj) {
        Boolean m871hasSyncingFailed$lambda0;
        m871hasSyncingFailed$lambda0 = Dream11ContactsListVM.m871hasSyncingFailed$lambda0((SyncState) obj);
        return m871hasSyncingFailed$lambda0;
    }
}
