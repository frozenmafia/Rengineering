package com.app.dream11.core.service.graphql.api.postroundlock;

import com.app.dream11.core.service.graphql.api.postroundlock.HeadToHeadRematchQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class HeadToHeadRematchQuery$Data$Companion$invoke$1$isUserBannedFromChat$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, HeadToHeadRematchQuery.IsUserBannedFromChat> {
    public static final HeadToHeadRematchQuery$Data$Companion$invoke$1$isUserBannedFromChat$1 INSTANCE = new HeadToHeadRematchQuery$Data$Companion$invoke$1$isUserBannedFromChat$1();

    HeadToHeadRematchQuery$Data$Companion$invoke$1$isUserBannedFromChat$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final HeadToHeadRematchQuery.IsUserBannedFromChat invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return HeadToHeadRematchQuery.IsUserBannedFromChat.Companion.invoke(removecancellable);
    }
}
