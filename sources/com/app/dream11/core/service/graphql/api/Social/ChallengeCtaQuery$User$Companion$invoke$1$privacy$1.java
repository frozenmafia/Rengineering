package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.Social.ChallengeCtaQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ChallengeCtaQuery$User$Companion$invoke$1$privacy$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ChallengeCtaQuery.Privacy> {
    public static final ChallengeCtaQuery$User$Companion$invoke$1$privacy$1 INSTANCE = new ChallengeCtaQuery$User$Companion$invoke$1$privacy$1();

    ChallengeCtaQuery$User$Companion$invoke$1$privacy$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final ChallengeCtaQuery.Privacy invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return ChallengeCtaQuery.Privacy.Companion.invoke(removecancellable);
    }
}
