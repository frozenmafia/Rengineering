package com.app.dream11.core.service.graphql.api.Social.recentsearch;

import com.app.dream11.core.service.graphql.api.Social.recentsearch.GetRecentSearchesQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GetRecentSearchesQuery$Edge$Companion$invoke$1$artwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetRecentSearchesQuery.Artwork> {
    public static final GetRecentSearchesQuery$Edge$Companion$invoke$1$artwork$1 INSTANCE = new GetRecentSearchesQuery$Edge$Companion$invoke$1$artwork$1();

    GetRecentSearchesQuery$Edge$Companion$invoke$1$artwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.recentsearch.GetRecentSearchesQuery$Edge$Companion$invoke$1$artwork$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetRecentSearchesQuery.Artwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetRecentSearchesQuery.Artwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetRecentSearchesQuery.Artwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetRecentSearchesQuery.Artwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetRecentSearchesQuery.Artwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
