package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestListForGroupQuery$Contest$Fragments$Companion$invoke$1$contestItem$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem> {
    public static final ContestListForGroupQuery$Contest$Fragments$Companion$invoke$1$contestItem$1 INSTANCE = new ContestListForGroupQuery$Contest$Fragments$Companion$invoke$1$contestItem$1();

    ContestListForGroupQuery$Contest$Fragments$Companion$invoke$1$contestItem$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestItem.Companion.invoke(removecancellable);
    }
}
