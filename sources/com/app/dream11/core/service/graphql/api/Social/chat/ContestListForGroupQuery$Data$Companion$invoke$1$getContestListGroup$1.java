package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ContestListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestListForGroupQuery$Data$Companion$invoke$1$getContestListGroup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestListForGroupQuery.GetContestListGroup> {
    public static final ContestListForGroupQuery$Data$Companion$invoke$1$getContestListGroup$1 INSTANCE = new ContestListForGroupQuery$Data$Companion$invoke$1$getContestListGroup$1();

    ContestListForGroupQuery$Data$Companion$invoke$1$getContestListGroup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestListForGroupQuery.GetContestListGroup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestListForGroupQuery.GetContestListGroup.Companion.invoke(removecancellable);
    }
}
