package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ContestListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestListForGroupQuery$Edge$Companion$invoke$1$contest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestListForGroupQuery.Contest> {
    public static final ContestListForGroupQuery$Edge$Companion$invoke$1$contest$1 INSTANCE = new ContestListForGroupQuery$Edge$Companion$invoke$1$contest$1();

    ContestListForGroupQuery$Edge$Companion$invoke$1$contest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestListForGroupQuery.Contest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestListForGroupQuery.Contest.Companion.invoke(removecancellable);
    }
}
