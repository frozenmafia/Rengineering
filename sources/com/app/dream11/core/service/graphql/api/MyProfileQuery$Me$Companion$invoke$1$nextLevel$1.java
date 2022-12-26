package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyProfileQuery$Me$Companion$invoke$1$nextLevel$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyProfileQuery.NextLevel> {
    public static final MyProfileQuery$Me$Companion$invoke$1$nextLevel$1 INSTANCE = new MyProfileQuery$Me$Companion$invoke$1$nextLevel$1();

    MyProfileQuery$Me$Companion$invoke$1$nextLevel$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final MyProfileQuery.NextLevel invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return MyProfileQuery.NextLevel.Companion.invoke(removecancellable);
    }
}
