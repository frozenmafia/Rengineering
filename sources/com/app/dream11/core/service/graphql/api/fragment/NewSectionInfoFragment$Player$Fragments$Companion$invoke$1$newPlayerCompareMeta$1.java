package com.app.dream11.core.service.graphql.api.fragment;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NewSectionInfoFragment$Player$Fragments$Companion$invoke$1$newPlayerCompareMeta$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewPlayerCompareMeta> {
    public static final NewSectionInfoFragment$Player$Fragments$Companion$invoke$1$newPlayerCompareMeta$1 INSTANCE = new NewSectionInfoFragment$Player$Fragments$Companion$invoke$1$newPlayerCompareMeta$1();

    NewSectionInfoFragment$Player$Fragments$Companion$invoke$1$newPlayerCompareMeta$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewPlayerCompareMeta invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewPlayerCompareMeta.Companion.invoke(removecancellable);
    }
}
