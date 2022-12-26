package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.JoinedContestsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class JoinedContestsQuery$Site$Companion$invoke$1$tour$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, JoinedContestsQuery.Tour> {
    public static final JoinedContestsQuery$Site$Companion$invoke$1$tour$1 INSTANCE = new JoinedContestsQuery$Site$Companion$invoke$1$tour$1();

    JoinedContestsQuery$Site$Companion$invoke$1$tour$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final JoinedContestsQuery.Tour invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return JoinedContestsQuery.Tour.Companion.invoke(removecancellable);
    }
}
