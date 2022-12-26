package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GPlayer;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GPlayer$Companion$invoke$1$type$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GPlayer.Type> {
    public static final GPlayer$Companion$invoke$1$type$1 INSTANCE = new GPlayer$Companion$invoke$1$type$1();

    GPlayer$Companion$invoke$1$type$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GPlayer.Type invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GPlayer.Type.Companion.invoke(removecancellable);
    }
}
