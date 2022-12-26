package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.GBallTimeline;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FantasyCommentaryQuery$AsBallTimeline$Fragments$Companion$invoke$1$gBallTimeline$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBallTimeline> {
    public static final FantasyCommentaryQuery$AsBallTimeline$Fragments$Companion$invoke$1$gBallTimeline$1 INSTANCE = new FantasyCommentaryQuery$AsBallTimeline$Fragments$Companion$invoke$1$gBallTimeline$1();

    FantasyCommentaryQuery$AsBallTimeline$Fragments$Companion$invoke$1$gBallTimeline$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GBallTimeline invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GBallTimeline.Companion.invoke(removecancellable);
    }
}
