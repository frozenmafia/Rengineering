package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FullScoreCardQuery$Inning$Companion$invoke$1$batsmen$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FullScoreCardQuery.Batsmen> {
    public static final FullScoreCardQuery$Inning$Companion$invoke$1$batsmen$1 INSTANCE = new FullScoreCardQuery$Inning$Companion$invoke$1$batsmen$1();

    FullScoreCardQuery$Inning$Companion$invoke$1$batsmen$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery$Inning$Companion$invoke$1$batsmen$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FullScoreCardQuery.Batsmen> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FullScoreCardQuery.Batsmen invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FullScoreCardQuery.Batsmen.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FullScoreCardQuery.Batsmen invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FullScoreCardQuery.Batsmen) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
