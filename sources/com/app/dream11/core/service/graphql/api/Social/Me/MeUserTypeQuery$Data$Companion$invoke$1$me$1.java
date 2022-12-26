package com.app.dream11.core.service.graphql.api.Social.Me;

import com.app.dream11.core.service.graphql.api.Social.Me.MeUserTypeQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MeUserTypeQuery$Data$Companion$invoke$1$me$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MeUserTypeQuery.Me> {
    public static final MeUserTypeQuery$Data$Companion$invoke$1$me$1 INSTANCE = new MeUserTypeQuery$Data$Companion$invoke$1$me$1();

    MeUserTypeQuery$Data$Companion$invoke$1$me$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MeUserTypeQuery.Me invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MeUserTypeQuery.Me.Companion.invoke(removecancellable);
    }
}
