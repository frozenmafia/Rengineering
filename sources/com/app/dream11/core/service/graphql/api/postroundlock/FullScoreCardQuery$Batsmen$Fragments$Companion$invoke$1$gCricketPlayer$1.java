package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.fragment.GCricketPlayer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FullScoreCardQuery$Batsmen$Fragments$Companion$invoke$1$gCricketPlayer$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GCricketPlayer> {
    public static final FullScoreCardQuery$Batsmen$Fragments$Companion$invoke$1$gCricketPlayer$1 INSTANCE = new FullScoreCardQuery$Batsmen$Fragments$Companion$invoke$1$gCricketPlayer$1();

    FullScoreCardQuery$Batsmen$Fragments$Companion$invoke$1$gCricketPlayer$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GCricketPlayer invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GCricketPlayer.Companion.invoke(removecancellable);
    }
}
