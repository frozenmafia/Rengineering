package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FomoQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FomoQuery$Fomo$Companion$invoke$1$paidContestUserImageURL$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FomoQuery.PaidContestUserImageURL> {
    public static final FomoQuery$Fomo$Companion$invoke$1$paidContestUserImageURL$1 INSTANCE = new FomoQuery$Fomo$Companion$invoke$1$paidContestUserImageURL$1();

    FomoQuery$Fomo$Companion$invoke$1$paidContestUserImageURL$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FomoQuery$Fomo$Companion$invoke$1$paidContestUserImageURL$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FomoQuery.PaidContestUserImageURL> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FomoQuery.PaidContestUserImageURL invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FomoQuery.PaidContestUserImageURL.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FomoQuery.PaidContestUserImageURL invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FomoQuery.PaidContestUserImageURL) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
