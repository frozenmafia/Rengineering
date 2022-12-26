package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchGFragment$Companion$invoke$1$squads$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HallOfFameMatchGFragment.Squad> {
    public static final HallOfFameMatchGFragment$Companion$invoke$1$squads$1 INSTANCE = new HallOfFameMatchGFragment$Companion$invoke$1$squads$1();

    HallOfFameMatchGFragment$Companion$invoke$1$squads$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.HallOfFameMatchGFragment$Companion$invoke$1$squads$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchGFragment.Squad> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HallOfFameMatchGFragment.Squad invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HallOfFameMatchGFragment.Squad.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchGFragment.Squad invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HallOfFameMatchGFragment.Squad) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
