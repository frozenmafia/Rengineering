package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.DynamicContestChatCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DynamicContestChatCardQuery$Contest$Companion$invoke$1$myTeams$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DynamicContestChatCardQuery.MyTeam> {
    public static final DynamicContestChatCardQuery$Contest$Companion$invoke$1$myTeams$1 INSTANCE = new DynamicContestChatCardQuery$Contest$Companion$invoke$1$myTeams$1();

    DynamicContestChatCardQuery$Contest$Companion$invoke$1$myTeams$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.chat.DynamicContestChatCardQuery$Contest$Companion$invoke$1$myTeams$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DynamicContestChatCardQuery.MyTeam> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DynamicContestChatCardQuery.MyTeam invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DynamicContestChatCardQuery.MyTeam.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DynamicContestChatCardQuery.MyTeam invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DynamicContestChatCardQuery.MyTeam) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
