package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchData$Fragments$Companion$invoke$1$gUserSubscribedNotification$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUserSubscribedNotification> {
    public static final MatchData$Fragments$Companion$invoke$1$gUserSubscribedNotification$1 INSTANCE = new MatchData$Fragments$Companion$invoke$1$gUserSubscribedNotification$1();

    MatchData$Fragments$Companion$invoke$1$gUserSubscribedNotification$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GUserSubscribedNotification invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GUserSubscribedNotification.Companion.invoke(removecancellable);
    }
}
