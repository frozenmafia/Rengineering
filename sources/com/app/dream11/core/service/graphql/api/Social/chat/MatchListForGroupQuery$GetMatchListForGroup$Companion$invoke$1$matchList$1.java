package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchListForGroupQuery$GetMatchListForGroup$Companion$invoke$1$matchList$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MatchListForGroupQuery.MatchList> {
    public static final MatchListForGroupQuery$GetMatchListForGroup$Companion$invoke$1$matchList$1 INSTANCE = new MatchListForGroupQuery$GetMatchListForGroup$Companion$invoke$1$matchList$1();

    MatchListForGroupQuery$GetMatchListForGroup$Companion$invoke$1$matchList$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.chat.MatchListForGroupQuery$GetMatchListForGroup$Companion$invoke$1$matchList$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchListForGroupQuery.MatchList> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MatchListForGroupQuery.MatchList invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MatchListForGroupQuery.MatchList.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchListForGroupQuery.MatchList invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MatchListForGroupQuery.MatchList) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
