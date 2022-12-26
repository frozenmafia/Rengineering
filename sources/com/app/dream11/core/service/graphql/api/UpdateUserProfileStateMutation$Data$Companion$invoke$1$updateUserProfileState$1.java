package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.UpdateUserProfileStateMutation;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class UpdateUserProfileStateMutation$Data$Companion$invoke$1$updateUserProfileState$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, UpdateUserProfileStateMutation.UpdateUserProfileState> {
    public static final UpdateUserProfileStateMutation$Data$Companion$invoke$1$updateUserProfileState$1 INSTANCE = new UpdateUserProfileStateMutation$Data$Companion$invoke$1$updateUserProfileState$1();

    UpdateUserProfileStateMutation$Data$Companion$invoke$1$updateUserProfileState$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final UpdateUserProfileStateMutation.UpdateUserProfileState invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return UpdateUserProfileStateMutation.UpdateUserProfileState.Companion.invoke(removecancellable);
    }
}
