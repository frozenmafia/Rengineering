package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsCarouselQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyContestsCarouselQuery$Site$Companion$invoke$1$matches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyContestsCarouselQuery.Matches> {
    public static final MyContestsCarouselQuery$Site$Companion$invoke$1$matches$1 INSTANCE = new MyContestsCarouselQuery$Site$Companion$invoke$1$matches$1();

    MyContestsCarouselQuery$Site$Companion$invoke$1$matches$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyContestsCarouselQuery.Matches invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyContestsCarouselQuery.Matches.Companion.invoke(removecancellable);
    }
}
