package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.NewPlayerCompareMeta;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NewPlayerCompareMeta$Companion$invoke$1$role$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewPlayerCompareMeta.Role> {
    public static final NewPlayerCompareMeta$Companion$invoke$1$role$1 INSTANCE = new NewPlayerCompareMeta$Companion$invoke$1$role$1();

    NewPlayerCompareMeta$Companion$invoke$1$role$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewPlayerCompareMeta.Role invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewPlayerCompareMeta.Role.Companion.invoke(removecancellable);
    }
}
