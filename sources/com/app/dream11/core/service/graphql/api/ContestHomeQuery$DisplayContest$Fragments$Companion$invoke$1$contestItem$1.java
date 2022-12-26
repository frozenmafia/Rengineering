package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeQuery$DisplayContest$Fragments$Companion$invoke$1$contestItem$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem> {
    public static final ContestHomeQuery$DisplayContest$Fragments$Companion$invoke$1$contestItem$1 INSTANCE = new ContestHomeQuery$DisplayContest$Fragments$Companion$invoke$1$contestItem$1();

    ContestHomeQuery$DisplayContest$Fragments$Companion$invoke$1$contestItem$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestItem.Companion.invoke(removecancellable);
    }
}
