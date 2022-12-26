package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchListForGroupQuery.InviterInfo> {
    public static final MatchListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1 INSTANCE = new MatchListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1();

    MatchListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchListForGroupQuery.InviterInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchListForGroupQuery.InviterInfo.Companion.invoke(removecancellable);
    }
}
