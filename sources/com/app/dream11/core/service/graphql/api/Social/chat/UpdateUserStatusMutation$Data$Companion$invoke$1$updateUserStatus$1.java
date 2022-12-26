package com.app.dream11.core.service.graphql.api.Social.chat;

import com.app.dream11.core.service.graphql.api.Social.chat.UpdateUserStatusMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UpdateUserStatusMutation$Data$Companion$invoke$1$updateUserStatus$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpdateUserStatusMutation.UpdateUserStatus> {
    public static final UpdateUserStatusMutation$Data$Companion$invoke$1$updateUserStatus$1 INSTANCE = new UpdateUserStatusMutation$Data$Companion$invoke$1$updateUserStatus$1();

    UpdateUserStatusMutation$Data$Companion$invoke$1$updateUserStatus$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpdateUserStatusMutation.UpdateUserStatus invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpdateUserStatusMutation.UpdateUserStatus.Companion.invoke(removecancellable);
    }
}
