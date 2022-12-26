package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.FullScoreCardQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FullScoreCardQuery$ComponentHeaders$Companion$invoke$1$bowlerHeaders$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, FullScoreCardQuery.BowlerHeaders> {
    public static final FullScoreCardQuery$ComponentHeaders$Companion$invoke$1$bowlerHeaders$1 INSTANCE = new FullScoreCardQuery$ComponentHeaders$Companion$invoke$1$bowlerHeaders$1();

    FullScoreCardQuery$ComponentHeaders$Companion$invoke$1$bowlerHeaders$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final FullScoreCardQuery.BowlerHeaders invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return FullScoreCardQuery.BowlerHeaders.Companion.invoke(removecancellable);
    }
}
