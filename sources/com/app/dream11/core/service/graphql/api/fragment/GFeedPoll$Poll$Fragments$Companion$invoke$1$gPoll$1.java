package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GFeedPoll$Poll$Fragments$Companion$invoke$1$gPoll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPoll> {
    public static final GFeedPoll$Poll$Fragments$Companion$invoke$1$gPoll$1 INSTANCE = new GFeedPoll$Poll$Fragments$Companion$invoke$1$gPoll$1();

    GFeedPoll$Poll$Fragments$Companion$invoke$1$gPoll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPoll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPoll.Companion.invoke(removecancellable);
    }
}
