package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ContestListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestListForGroupQuery.InviterInfo> {
    public static final ContestListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1 INSTANCE = new ContestListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1();

    ContestListForGroupQuery$Edge$Companion$invoke$1$inviterInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestListForGroupQuery.InviterInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestListForGroupQuery.InviterInfo.Companion.invoke(removecancellable);
    }
}
