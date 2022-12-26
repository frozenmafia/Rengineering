package com.app.dream11.core.service.graphql.api.Social;

import com.app.dream11.core.service.graphql.api.fragment.GPoll;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes6.dex */
final class FetchSinglePollQuery$Poll$Fragments$Companion$invoke$1$gPoll$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPoll> {
    public static final FetchSinglePollQuery$Poll$Fragments$Companion$invoke$1$gPoll$1 INSTANCE = new FetchSinglePollQuery$Poll$Fragments$Companion$invoke$1$gPoll$1();

    FetchSinglePollQuery$Poll$Fragments$Companion$invoke$1$gPoll$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPoll invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPoll.Companion.invoke(removecancellable);
    }
}
