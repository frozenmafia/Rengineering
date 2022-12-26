package com.app.dream11.core.service.graphql.api.preroundlocklivestreamingbanner;

import com.app.dream11.core.service.graphql.api.preroundlocklivestreamingbanner.GetLiveStreamBannerQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetLiveStreamBannerQuery$Data$Companion$invoke$1$watchLiveRuleInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetLiveStreamBannerQuery.WatchLiveRuleInfo> {
    public static final GetLiveStreamBannerQuery$Data$Companion$invoke$1$watchLiveRuleInfo$1 INSTANCE = new GetLiveStreamBannerQuery$Data$Companion$invoke$1$watchLiveRuleInfo$1();

    GetLiveStreamBannerQuery$Data$Companion$invoke$1$watchLiveRuleInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetLiveStreamBannerQuery.WatchLiveRuleInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetLiveStreamBannerQuery.WatchLiveRuleInfo.Companion.invoke(removecancellable);
    }
}
