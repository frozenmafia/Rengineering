package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class JoinedContestsQuery$Edge$Fragments$Companion$invoke$1$contestItem$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem> {
    public static final JoinedContestsQuery$Edge$Fragments$Companion$invoke$1$contestItem$1 INSTANCE = new JoinedContestsQuery$Edge$Fragments$Companion$invoke$1$contestItem$1();

    JoinedContestsQuery$Edge$Fragments$Companion$invoke$1$contestItem$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestItem.Companion.invoke(removecancellable);
    }
}
