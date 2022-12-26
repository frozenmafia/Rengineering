package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.BasicContestDetails;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class WinningBreakupQuery$Contest$Fragments$Companion$invoke$1$basicContestDetails$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, BasicContestDetails> {
    public static final WinningBreakupQuery$Contest$Fragments$Companion$invoke$1$basicContestDetails$1 INSTANCE = new WinningBreakupQuery$Contest$Fragments$Companion$invoke$1$basicContestDetails$1();

    WinningBreakupQuery$Contest$Fragments$Companion$invoke$1$basicContestDetails$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final BasicContestDetails invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return BasicContestDetails.Companion.invoke(removecancellable);
    }
}
