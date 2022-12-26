package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GIFeed$User$Fragments$Companion$invoke$1$gUser$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GUser> {
    public static final GIFeed$User$Fragments$Companion$invoke$1$gUser$1 INSTANCE = new GIFeed$User$Fragments$Companion$invoke$1$gUser$1();

    GIFeed$User$Fragments$Companion$invoke$1$gUser$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GUser invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GUser.Companion.invoke(removecancellable);
    }
}
