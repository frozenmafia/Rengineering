package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ContestDataFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ContestDataFragment$Promotions$Companion$invoke$1$allPromotions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ContestDataFragment.AllPromotion> {
    public static final ContestDataFragment$Promotions$Companion$invoke$1$allPromotions$1 INSTANCE = new ContestDataFragment$Promotions$Companion$invoke$1$allPromotions$1();

    ContestDataFragment$Promotions$Companion$invoke$1$allPromotions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.ContestDataFragment$Promotions$Companion$invoke$1$allPromotions$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ContestDataFragment.AllPromotion> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ContestDataFragment.AllPromotion invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ContestDataFragment.AllPromotion.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ContestDataFragment.AllPromotion invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ContestDataFragment.AllPromotion) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
