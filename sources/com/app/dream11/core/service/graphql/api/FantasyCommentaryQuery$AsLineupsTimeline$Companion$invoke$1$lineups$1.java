package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.FantasyCommentaryQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyCommentaryQuery$AsLineupsTimeline$Companion$invoke$1$lineups$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, FantasyCommentaryQuery.Lineup> {
    public static final FantasyCommentaryQuery$AsLineupsTimeline$Companion$invoke$1$lineups$1 INSTANCE = new FantasyCommentaryQuery$AsLineupsTimeline$Companion$invoke$1$lineups$1();

    FantasyCommentaryQuery$AsLineupsTimeline$Companion$invoke$1$lineups$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.FantasyCommentaryQuery$AsLineupsTimeline$Companion$invoke$1$lineups$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FantasyCommentaryQuery.Lineup> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final FantasyCommentaryQuery.Lineup invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return FantasyCommentaryQuery.Lineup.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final FantasyCommentaryQuery.Lineup invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (FantasyCommentaryQuery.Lineup) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
