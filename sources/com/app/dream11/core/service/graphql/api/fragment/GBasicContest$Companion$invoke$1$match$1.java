package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GBasicContest;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GBasicContest$Companion$invoke$1$match$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GBasicContest.Match> {
    public static final GBasicContest$Companion$invoke$1$match$1 INSTANCE = new GBasicContest$Companion$invoke$1$match$1();

    GBasicContest$Companion$invoke$1$match$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GBasicContest.Match invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GBasicContest.Match.Companion.invoke(removecancellable);
    }
}
