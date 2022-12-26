package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetToursQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetToursQuery$Edge$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetToursQuery.Artwork> {
    public static final GetToursQuery$Edge$Companion$invoke$1$artwork$1 INSTANCE = new GetToursQuery$Edge$Companion$invoke$1$artwork$1();

    GetToursQuery$Edge$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.GetToursQuery$Edge$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetToursQuery.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetToursQuery.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetToursQuery.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetToursQuery.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetToursQuery.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
