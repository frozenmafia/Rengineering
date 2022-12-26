package com.app.dream11.core.service.graphql.api.Social.reactions;

import com.app.dream11.core.service.graphql.api.Social.reactions.FetchReactionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FetchReactionsQuery$Data$Companion$invoke$1$fetchReactions$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FetchReactionsQuery.FetchReaction> {
    public static final FetchReactionsQuery$Data$Companion$invoke$1$fetchReactions$1 INSTANCE = new FetchReactionsQuery$Data$Companion$invoke$1$fetchReactions$1();

    FetchReactionsQuery$Data$Companion$invoke$1$fetchReactions$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.reactions.FetchReactionsQuery$Data$Companion$invoke$1$fetchReactions$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FetchReactionsQuery.FetchReaction> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FetchReactionsQuery.FetchReaction invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FetchReactionsQuery.FetchReaction.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FetchReactionsQuery.FetchReaction invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FetchReactionsQuery.FetchReaction) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
