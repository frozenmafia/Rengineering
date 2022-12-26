package com.app.dream11.core.service.graphql.api.preroundlocklivestreamingbanner;

import com.app.dream11.core.service.graphql.api.preroundlocklivestreamingbanner.GetLiveStreamBannerQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetLiveStreamBannerQuery$WatchLiveRuleInfo$Companion$invoke$1$progress$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetLiveStreamBannerQuery.Progress> {
    public static final GetLiveStreamBannerQuery$WatchLiveRuleInfo$Companion$invoke$1$progress$1 INSTANCE = new GetLiveStreamBannerQuery$WatchLiveRuleInfo$Companion$invoke$1$progress$1();

    GetLiveStreamBannerQuery$WatchLiveRuleInfo$Companion$invoke$1$progress$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetLiveStreamBannerQuery.Progress invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetLiveStreamBannerQuery.Progress.Companion.invoke(removecancellable);
    }
}
