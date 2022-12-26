package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetToursQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetToursQuery$Site$Companion$invoke$1$myTours$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetToursQuery.MyTours> {
    public static final GetToursQuery$Site$Companion$invoke$1$myTours$1 INSTANCE = new GetToursQuery$Site$Companion$invoke$1$myTours$1();

    GetToursQuery$Site$Companion$invoke$1$myTours$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetToursQuery.MyTours invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetToursQuery.MyTours.Companion.invoke(removecancellable);
    }
}
