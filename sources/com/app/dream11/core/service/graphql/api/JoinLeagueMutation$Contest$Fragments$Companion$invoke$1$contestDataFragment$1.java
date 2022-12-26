package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.ContestDataFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinLeagueMutation$Contest$Fragments$Companion$invoke$1$contestDataFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestDataFragment> {
    public static final JoinLeagueMutation$Contest$Fragments$Companion$invoke$1$contestDataFragment$1 INSTANCE = new JoinLeagueMutation$Contest$Fragments$Companion$invoke$1$contestDataFragment$1();

    JoinLeagueMutation$Contest$Fragments$Companion$invoke$1$contestDataFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestDataFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestDataFragment.Companion.invoke(removecancellable);
    }
}
