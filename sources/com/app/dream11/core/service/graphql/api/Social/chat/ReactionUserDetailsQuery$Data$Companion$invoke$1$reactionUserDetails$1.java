package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.ReactionUserDetailsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ReactionUserDetailsQuery$Data$Companion$invoke$1$reactionUserDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ReactionUserDetailsQuery.ReactionUserDetail> {
    public static final ReactionUserDetailsQuery$Data$Companion$invoke$1$reactionUserDetails$1 INSTANCE = new ReactionUserDetailsQuery$Data$Companion$invoke$1$reactionUserDetails$1();

    ReactionUserDetailsQuery$Data$Companion$invoke$1$reactionUserDetails$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.chat.ReactionUserDetailsQuery$Data$Companion$invoke$1$reactionUserDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ReactionUserDetailsQuery.ReactionUserDetail> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ReactionUserDetailsQuery.ReactionUserDetail invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ReactionUserDetailsQuery.ReactionUserDetail.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ReactionUserDetailsQuery.ReactionUserDetail invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ReactionUserDetailsQuery.ReactionUserDetail) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
