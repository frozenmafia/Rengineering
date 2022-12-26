package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GPlayer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GPlayer$Companion$invoke$1$squad$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPlayer.Squad> {
    public static final GPlayer$Companion$invoke$1$squad$1 INSTANCE = new GPlayer$Companion$invoke$1$squad$1();

    GPlayer$Companion$invoke$1$squad$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPlayer.Squad invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPlayer.Squad.Companion.invoke(removecancellable);
    }
}
