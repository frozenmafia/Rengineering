package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeed$PageInfo$Fragments$Companion$invoke$1$gPageInfoCursor$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPageInfoCursor> {
    public static final GFeed$PageInfo$Fragments$Companion$invoke$1$gPageInfoCursor$1 INSTANCE = new GFeed$PageInfo$Fragments$Companion$invoke$1$gPageInfoCursor$1();

    GFeed$PageInfo$Fragments$Companion$invoke$1$gPageInfoCursor$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPageInfoCursor invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPageInfoCursor.Companion.invoke(removecancellable);
    }
}
