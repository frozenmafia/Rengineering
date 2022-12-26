package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.ReactionData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ReactionData$Companion$invoke$1$topReaction$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ReactionData.TopReaction> {
    public static final ReactionData$Companion$invoke$1$topReaction$1 INSTANCE = new ReactionData$Companion$invoke$1$topReaction$1();

    ReactionData$Companion$invoke$1$topReaction$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.ReactionData$Companion$invoke$1$topReaction$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactionData.TopReaction> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ReactionData.TopReaction invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ReactionData.TopReaction.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactionData.TopReaction invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ReactionData.TopReaction) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
