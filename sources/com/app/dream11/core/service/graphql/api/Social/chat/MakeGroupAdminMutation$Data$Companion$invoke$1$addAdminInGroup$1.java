package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.MakeGroupAdminMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MakeGroupAdminMutation$Data$Companion$invoke$1$addAdminInGroup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MakeGroupAdminMutation.AddAdminInGroup> {
    public static final MakeGroupAdminMutation$Data$Companion$invoke$1$addAdminInGroup$1 INSTANCE = new MakeGroupAdminMutation$Data$Companion$invoke$1$addAdminInGroup$1();

    MakeGroupAdminMutation$Data$Companion$invoke$1$addAdminInGroup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MakeGroupAdminMutation.AddAdminInGroup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MakeGroupAdminMutation.AddAdminInGroup.Companion.invoke(removecancellable);
    }
}
