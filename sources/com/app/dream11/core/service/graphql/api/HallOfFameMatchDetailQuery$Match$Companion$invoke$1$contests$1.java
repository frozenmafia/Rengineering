package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchDetailQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchDetailQuery$Match$Companion$invoke$1$contests$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HallOfFameMatchDetailQuery.Contest> {
    public static final HallOfFameMatchDetailQuery$Match$Companion$invoke$1$contests$1 INSTANCE = new HallOfFameMatchDetailQuery$Match$Companion$invoke$1$contests$1();

    HallOfFameMatchDetailQuery$Match$Companion$invoke$1$contests$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.HallOfFameMatchDetailQuery$Match$Companion$invoke$1$contests$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchDetailQuery.Contest> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HallOfFameMatchDetailQuery.Contest invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HallOfFameMatchDetailQuery.Contest.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchDetailQuery.Contest invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HallOfFameMatchDetailQuery.Contest) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
