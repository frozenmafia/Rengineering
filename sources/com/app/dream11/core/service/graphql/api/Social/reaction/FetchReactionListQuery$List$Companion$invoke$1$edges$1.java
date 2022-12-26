package com.app.dream11.core.service.graphql.api.Social.reaction;

import com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionListQuery$List$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchReactionListQuery.Edge> {
    public static final FetchReactionListQuery$List$Companion$invoke$1$edges$1 INSTANCE = new FetchReactionListQuery$List$Companion$invoke$1$edges$1();

    FetchReactionListQuery$List$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.reaction.FetchReactionListQuery$List$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionListQuery.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchReactionListQuery.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchReactionListQuery.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionListQuery.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchReactionListQuery.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
