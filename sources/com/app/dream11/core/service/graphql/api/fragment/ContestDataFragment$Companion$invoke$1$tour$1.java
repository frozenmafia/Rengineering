package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestDataFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestDataFragment$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestDataFragment.Tour> {
    public static final ContestDataFragment$Companion$invoke$1$tour$1 INSTANCE = new ContestDataFragment$Companion$invoke$1$tour$1();

    ContestDataFragment$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestDataFragment.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestDataFragment.Tour.Companion.invoke(removecancellable);
    }
}
