package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyPromotionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyPromotionsQuery$Site$Companion$invoke$1$promotionFeedBanners$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyPromotionsQuery.PromotionFeedBanner> {
    public static final MyPromotionsQuery$Site$Companion$invoke$1$promotionFeedBanners$1 INSTANCE = new MyPromotionsQuery$Site$Companion$invoke$1$promotionFeedBanners$1();

    MyPromotionsQuery$Site$Companion$invoke$1$promotionFeedBanners$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyPromotionsQuery$Site$Companion$invoke$1$promotionFeedBanners$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyPromotionsQuery.PromotionFeedBanner> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyPromotionsQuery.PromotionFeedBanner invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyPromotionsQuery.PromotionFeedBanner.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyPromotionsQuery.PromotionFeedBanner invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyPromotionsQuery.PromotionFeedBanner) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
