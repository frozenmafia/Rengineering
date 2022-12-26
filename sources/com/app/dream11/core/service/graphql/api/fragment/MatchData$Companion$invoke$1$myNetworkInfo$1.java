package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.MatchData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MatchData$Companion$invoke$1$myNetworkInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MatchData.MyNetworkInfo> {
    public static final MatchData$Companion$invoke$1$myNetworkInfo$1 INSTANCE = new MatchData$Companion$invoke$1$myNetworkInfo$1();

    MatchData$Companion$invoke$1$myNetworkInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MatchData.MyNetworkInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MatchData.MyNetworkInfo.Companion.invoke(removecancellable);
    }
}
