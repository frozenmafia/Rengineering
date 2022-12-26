package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.TotalUnreadMessageCountQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TotalUnreadMessageCountQuery$Data$Companion$invoke$1$totalUnreadMessageCount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, TotalUnreadMessageCountQuery.TotalUnreadMessageCount> {
    public static final TotalUnreadMessageCountQuery$Data$Companion$invoke$1$totalUnreadMessageCount$1 INSTANCE = new TotalUnreadMessageCountQuery$Data$Companion$invoke$1$totalUnreadMessageCount$1();

    TotalUnreadMessageCountQuery$Data$Companion$invoke$1$totalUnreadMessageCount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final TotalUnreadMessageCountQuery.TotalUnreadMessageCount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return TotalUnreadMessageCountQuery.TotalUnreadMessageCount.Companion.invoke(removecancellable);
    }
}
