package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchListForGroupQuery$Edge$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchListForGroupQuery.Contest> {
    public static final MatchListForGroupQuery$Edge$Companion$invoke$1$contest$1 INSTANCE = new MatchListForGroupQuery$Edge$Companion$invoke$1$contest$1();

    MatchListForGroupQuery$Edge$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchListForGroupQuery.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchListForGroupQuery.Contest.Companion.invoke(removecancellable);
    }
}
