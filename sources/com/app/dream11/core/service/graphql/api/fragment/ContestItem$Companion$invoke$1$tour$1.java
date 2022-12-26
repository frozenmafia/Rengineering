package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestItem;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestItem$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestItem.Tour> {
    public static final ContestItem$Companion$invoke$1$tour$1 INSTANCE = new ContestItem$Companion$invoke$1$tour$1();

    ContestItem$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestItem.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestItem.Tour.Companion.invoke(removecancellable);
    }
}
