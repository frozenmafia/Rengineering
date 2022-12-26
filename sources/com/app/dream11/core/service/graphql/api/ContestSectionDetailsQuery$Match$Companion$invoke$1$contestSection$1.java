package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ContestSectionDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestSectionDetailsQuery$Match$Companion$invoke$1$contestSection$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestSectionDetailsQuery.ContestSection> {
    public static final ContestSectionDetailsQuery$Match$Companion$invoke$1$contestSection$1 INSTANCE = new ContestSectionDetailsQuery$Match$Companion$invoke$1$contestSection$1();

    ContestSectionDetailsQuery$Match$Companion$invoke$1$contestSection$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestSectionDetailsQuery.ContestSection invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestSectionDetailsQuery.ContestSection.Companion.invoke(removecancellable);
    }
}
