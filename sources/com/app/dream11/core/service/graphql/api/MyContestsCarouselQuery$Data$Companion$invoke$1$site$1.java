package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsCarouselQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyContestsCarouselQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyContestsCarouselQuery.Site> {
    public static final MyContestsCarouselQuery$Data$Companion$invoke$1$site$1 INSTANCE = new MyContestsCarouselQuery$Data$Companion$invoke$1$site$1();

    MyContestsCarouselQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyContestsCarouselQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyContestsCarouselQuery.Site.Companion.invoke(removecancellable);
    }
}
