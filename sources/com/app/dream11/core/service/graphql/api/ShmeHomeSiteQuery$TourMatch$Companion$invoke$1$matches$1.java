package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ShmeHomeSiteQuery$TourMatch$Companion$invoke$1$matches$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, ShmeHomeSiteQuery.Match> {
    public static final ShmeHomeSiteQuery$TourMatch$Companion$invoke$1$matches$1 INSTANCE = new ShmeHomeSiteQuery$TourMatch$Companion$invoke$1$matches$1();

    ShmeHomeSiteQuery$TourMatch$Companion$invoke$1$matches$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.ShmeHomeSiteQuery$TourMatch$Companion$invoke$1$matches$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, ShmeHomeSiteQuery.Match> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final ShmeHomeSiteQuery.Match invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return ShmeHomeSiteQuery.Match.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final ShmeHomeSiteQuery.Match invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (ShmeHomeSiteQuery.Match) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
