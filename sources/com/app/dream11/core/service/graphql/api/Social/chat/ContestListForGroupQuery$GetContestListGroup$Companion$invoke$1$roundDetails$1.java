package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ContestListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestListForGroupQuery$GetContestListGroup$Companion$invoke$1$roundDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestListForGroupQuery.RoundDetails> {
    public static final ContestListForGroupQuery$GetContestListGroup$Companion$invoke$1$roundDetails$1 INSTANCE = new ContestListForGroupQuery$GetContestListGroup$Companion$invoke$1$roundDetails$1();

    ContestListForGroupQuery$GetContestListGroup$Companion$invoke$1$roundDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestListForGroupQuery.RoundDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestListForGroupQuery.RoundDetails.Companion.invoke(removecancellable);
    }
}
