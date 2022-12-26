package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GFeedData;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedData$Companion$invoke$1$asFeedGeneral$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GFeedData.AsFeedGeneral> {
    public static final GFeedData$Companion$invoke$1$asFeedGeneral$1 INSTANCE = new GFeedData$Companion$invoke$1$asFeedGeneral$1();

    GFeedData$Companion$invoke$1$asFeedGeneral$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GFeedData.AsFeedGeneral invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GFeedData.AsFeedGeneral.Companion.invoke(removecancellable);
    }
}
