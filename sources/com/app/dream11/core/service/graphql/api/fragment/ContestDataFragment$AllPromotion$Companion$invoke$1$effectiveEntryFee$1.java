package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestDataFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestDataFragment$AllPromotion$Companion$invoke$1$effectiveEntryFee$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestDataFragment.EffectiveEntryFee> {
    public static final ContestDataFragment$AllPromotion$Companion$invoke$1$effectiveEntryFee$1 INSTANCE = new ContestDataFragment$AllPromotion$Companion$invoke$1$effectiveEntryFee$1();

    ContestDataFragment$AllPromotion$Companion$invoke$1$effectiveEntryFee$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestDataFragment.EffectiveEntryFee invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ContestDataFragment.EffectiveEntryFee.Companion.invoke(removecancellable);
    }
}
