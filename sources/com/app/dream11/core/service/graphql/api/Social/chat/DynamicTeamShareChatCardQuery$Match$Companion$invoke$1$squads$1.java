package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.DynamicTeamShareChatCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class DynamicTeamShareChatCardQuery$Match$Companion$invoke$1$squads$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DynamicTeamShareChatCardQuery.Squad> {
    public static final DynamicTeamShareChatCardQuery$Match$Companion$invoke$1$squads$1 INSTANCE = new DynamicTeamShareChatCardQuery$Match$Companion$invoke$1$squads$1();

    DynamicTeamShareChatCardQuery$Match$Companion$invoke$1$squads$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.chat.DynamicTeamShareChatCardQuery$Match$Companion$invoke$1$squads$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DynamicTeamShareChatCardQuery.Squad> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DynamicTeamShareChatCardQuery.Squad invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DynamicTeamShareChatCardQuery.Squad.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DynamicTeamShareChatCardQuery.Squad invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DynamicTeamShareChatCardQuery.Squad) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
