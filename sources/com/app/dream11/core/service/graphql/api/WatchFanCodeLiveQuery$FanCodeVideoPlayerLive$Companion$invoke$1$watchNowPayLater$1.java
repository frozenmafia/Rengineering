package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WatchFanCodeLiveQuery$FanCodeVideoPlayerLive$Companion$invoke$1$watchNowPayLater$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WatchFanCodeLiveQuery.WatchNowPayLater> {
    public static final WatchFanCodeLiveQuery$FanCodeVideoPlayerLive$Companion$invoke$1$watchNowPayLater$1 INSTANCE = new WatchFanCodeLiveQuery$FanCodeVideoPlayerLive$Companion$invoke$1$watchNowPayLater$1();

    WatchFanCodeLiveQuery$FanCodeVideoPlayerLive$Companion$invoke$1$watchNowPayLater$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WatchFanCodeLiveQuery.WatchNowPayLater invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WatchFanCodeLiveQuery.WatchNowPayLater.Companion.invoke(removecancellable);
    }
}
