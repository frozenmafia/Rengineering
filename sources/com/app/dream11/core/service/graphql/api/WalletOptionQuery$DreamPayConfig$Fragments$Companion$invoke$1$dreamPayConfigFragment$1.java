package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.fragment.DreamPayConfigFragment;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* loaded from: classes2.dex */
final class WalletOptionQuery$DreamPayConfig$Fragments$Companion$invoke$1$dreamPayConfigFragment$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DreamPayConfigFragment> {
    public static final WalletOptionQuery$DreamPayConfig$Fragments$Companion$invoke$1$dreamPayConfigFragment$1 INSTANCE = new WalletOptionQuery$DreamPayConfig$Fragments$Companion$invoke$1$dreamPayConfigFragment$1();

    WalletOptionQuery$DreamPayConfig$Fragments$Companion$invoke$1$dreamPayConfigFragment$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final DreamPayConfigFragment invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return DreamPayConfigFragment.Companion.invoke(removecancellable);
    }
}
