package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyPromotionsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MyPromotionsQuery$Data$Companion$invoke$1$site$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyPromotionsQuery.Site> {
    public static final MyPromotionsQuery$Data$Companion$invoke$1$site$1 INSTANCE = new MyPromotionsQuery$Data$Companion$invoke$1$site$1();

    MyPromotionsQuery$Data$Companion$invoke$1$site$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyPromotionsQuery.Site invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyPromotionsQuery.Site.Companion.invoke(removecancellable);
    }
}
