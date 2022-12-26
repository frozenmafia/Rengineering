package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Edge$Companion$invoke$1$amount$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.Amount> {
    public static final NewMyProfileQuery$Edge$Companion$invoke$1$amount$1 INSTANCE = new NewMyProfileQuery$Edge$Companion$invoke$1$amount$1();

    NewMyProfileQuery$Edge$Companion$invoke$1$amount$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.Amount invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewMyProfileQuery.Amount.Companion.invoke(removecancellable);
    }
}
