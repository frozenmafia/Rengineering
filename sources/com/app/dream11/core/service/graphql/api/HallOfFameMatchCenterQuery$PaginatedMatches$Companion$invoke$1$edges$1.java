package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, HallOfFameMatchCenterQuery.Edge> {
    public static final HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$edges$1 INSTANCE = new HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$edges$1();

    HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.HallOfFameMatchCenterQuery$PaginatedMatches$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HallOfFameMatchCenterQuery.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final HallOfFameMatchCenterQuery.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return HallOfFameMatchCenterQuery.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final HallOfFameMatchCenterQuery.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (HallOfFameMatchCenterQuery.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
