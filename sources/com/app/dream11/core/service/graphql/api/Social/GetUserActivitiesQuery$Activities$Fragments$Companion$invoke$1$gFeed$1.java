package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.fragment.GFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class GetUserActivitiesQuery$Activities$Fragments$Companion$invoke$1$gFeed$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeed> {
    public static final GetUserActivitiesQuery$Activities$Fragments$Companion$invoke$1$gFeed$1 INSTANCE = new GetUserActivitiesQuery$Activities$Fragments$Companion$invoke$1$gFeed$1();

    GetUserActivitiesQuery$Activities$Fragments$Companion$invoke$1$gFeed$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeed invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeed.Companion.invoke(removecancellable);
    }
}
