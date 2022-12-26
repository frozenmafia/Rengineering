package com.app.dream11.core.service.graphql.api.profile;

import com.app.dream11.core.service.graphql.api.profile.DeletedProfileQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class DeletedProfileQuery$User$Companion$invoke$1$coverPic$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, DeletedProfileQuery.CoverPic> {
    public static final DeletedProfileQuery$User$Companion$invoke$1$coverPic$1 INSTANCE = new DeletedProfileQuery$User$Companion$invoke$1$coverPic$1();

    DeletedProfileQuery$User$Companion$invoke$1$coverPic$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.profile.DeletedProfileQuery$User$Companion$invoke$1$coverPic$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, DeletedProfileQuery.CoverPic> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final DeletedProfileQuery.CoverPic invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return DeletedProfileQuery.CoverPic.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final DeletedProfileQuery.CoverPic invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (DeletedProfileQuery.CoverPic) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
