package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.WatchFanCodeLiveQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WatchFanCodeLiveQuery$Data$Companion$invoke$1$fanCodeVideoPlayerLive$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, WatchFanCodeLiveQuery.FanCodeVideoPlayerLive> {
    public static final WatchFanCodeLiveQuery$Data$Companion$invoke$1$fanCodeVideoPlayerLive$1 INSTANCE = new WatchFanCodeLiveQuery$Data$Companion$invoke$1$fanCodeVideoPlayerLive$1();

    WatchFanCodeLiveQuery$Data$Companion$invoke$1$fanCodeVideoPlayerLive$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final WatchFanCodeLiveQuery.FanCodeVideoPlayerLive invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return WatchFanCodeLiveQuery.FanCodeVideoPlayerLive.Companion.invoke(removecancellable);
    }
}
