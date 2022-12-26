package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class ContestDataFragment$Companion$invoke$1$teamIds$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, Integer> {
    public static final ContestDataFragment$Companion$invoke$1$teamIds$1 INSTANCE = new ContestDataFragment$Companion$invoke$1$teamIds$1();

    ContestDataFragment$Companion$invoke$1$teamIds$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final Integer invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return Integer.valueOf(valuesVar.values());
    }
}
