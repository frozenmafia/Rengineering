package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyContestsCarouselQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyContestsCarouselQuery$Site$Companion$invoke$1$myMatchesCarouselBG$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyContestsCarouselQuery.MyMatchesCarouselBG> {
    public static final MyContestsCarouselQuery$Site$Companion$invoke$1$myMatchesCarouselBG$1 INSTANCE = new MyContestsCarouselQuery$Site$Companion$invoke$1$myMatchesCarouselBG$1();

    MyContestsCarouselQuery$Site$Companion$invoke$1$myMatchesCarouselBG$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyContestsCarouselQuery$Site$Companion$invoke$1$myMatchesCarouselBG$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyContestsCarouselQuery.MyMatchesCarouselBG> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyContestsCarouselQuery.MyMatchesCarouselBG invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyContestsCarouselQuery.MyMatchesCarouselBG.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyContestsCarouselQuery.MyMatchesCarouselBG invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyContestsCarouselQuery.MyMatchesCarouselBG) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
