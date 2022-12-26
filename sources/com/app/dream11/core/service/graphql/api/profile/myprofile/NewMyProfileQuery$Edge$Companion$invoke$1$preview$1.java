package com.app.dream11.core.service.graphql.api.profile.myprofile;

import com.app.dream11.core.service.graphql.api.profile.myprofile.NewMyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class NewMyProfileQuery$Edge$Companion$invoke$1$preview$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, NewMyProfileQuery.Preview> {
    public static final NewMyProfileQuery$Edge$Companion$invoke$1$preview$1 INSTANCE = new NewMyProfileQuery$Edge$Companion$invoke$1$preview$1();

    NewMyProfileQuery$Edge$Companion$invoke$1$preview$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final NewMyProfileQuery.Preview invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return NewMyProfileQuery.Preview.Companion.invoke(removecancellable);
    }
}
