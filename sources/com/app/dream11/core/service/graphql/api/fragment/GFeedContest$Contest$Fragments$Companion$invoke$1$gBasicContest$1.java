package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedContest$Contest$Fragments$Companion$invoke$1$gBasicContest$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBasicContest> {
    public static final GFeedContest$Contest$Fragments$Companion$invoke$1$gBasicContest$1 INSTANCE = new GFeedContest$Contest$Fragments$Companion$invoke$1$gBasicContest$1();

    GFeedContest$Contest$Fragments$Companion$invoke$1$gBasicContest$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GBasicContest invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GBasicContest.Companion.invoke(removecancellable);
    }
}
