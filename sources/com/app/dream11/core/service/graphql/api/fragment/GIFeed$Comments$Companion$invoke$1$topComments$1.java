package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GIFeed;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$Comments$Companion$invoke$1$topComments$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GIFeed.TopComment> {
    public static final GIFeed$Comments$Companion$invoke$1$topComments$1 INSTANCE = new GIFeed$Comments$Companion$invoke$1$topComments$1();

    GIFeed$Comments$Companion$invoke$1$topComments$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.fragment.GIFeed$Comments$Companion$invoke$1$topComments$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GIFeed.TopComment> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GIFeed.TopComment invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GIFeed.TopComment.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GIFeed.TopComment invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GIFeed.TopComment) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
