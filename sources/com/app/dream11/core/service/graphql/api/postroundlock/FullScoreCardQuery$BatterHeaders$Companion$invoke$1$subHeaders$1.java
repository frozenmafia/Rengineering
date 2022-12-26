package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FullScoreCardQuery$BatterHeaders$Companion$invoke$1$subHeaders$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FullScoreCardQuery.SubHeader> {
    public static final FullScoreCardQuery$BatterHeaders$Companion$invoke$1$subHeaders$1 INSTANCE = new FullScoreCardQuery$BatterHeaders$Companion$invoke$1$subHeaders$1();

    FullScoreCardQuery$BatterHeaders$Companion$invoke$1$subHeaders$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery$BatterHeaders$Companion$invoke$1$subHeaders$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FullScoreCardQuery.SubHeader> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FullScoreCardQuery.SubHeader invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FullScoreCardQuery.SubHeader.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FullScoreCardQuery.SubHeader invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FullScoreCardQuery.SubHeader) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
