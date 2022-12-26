package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.RemoveAdminFromGroupMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RemoveAdminFromGroupMutation$Data$Companion$invoke$1$removeAdminFromGroup$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, RemoveAdminFromGroupMutation.RemoveAdminFromGroup> {
    public static final RemoveAdminFromGroupMutation$Data$Companion$invoke$1$removeAdminFromGroup$1 INSTANCE = new RemoveAdminFromGroupMutation$Data$Companion$invoke$1$removeAdminFromGroup$1();

    RemoveAdminFromGroupMutation$Data$Companion$invoke$1$removeAdminFromGroup$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final RemoveAdminFromGroupMutation.RemoveAdminFromGroup invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return RemoveAdminFromGroupMutation.RemoveAdminFromGroup.Companion.invoke(removecancellable);
    }
}
