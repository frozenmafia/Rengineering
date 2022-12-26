package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestHomeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestHomeQuery$ContestSection$Companion$invoke$1$tag$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestHomeQuery.Tag> {
    public static final ContestHomeQuery$ContestSection$Companion$invoke$1$tag$1 INSTANCE = new ContestHomeQuery$ContestSection$Companion$invoke$1$tag$1();

    ContestHomeQuery$ContestSection$Companion$invoke$1$tag$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestHomeQuery.Tag invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestHomeQuery.Tag.Companion.invoke(removecancellable);
    }
}
