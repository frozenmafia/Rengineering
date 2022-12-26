package com.app.dream11.core.service.graphql.api.Social.comments;

import com.app.dream11.core.service.graphql.api.Social.comments.GetCommentsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetCommentsQuery$Comments$Companion$invoke$1$edges$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, GetCommentsQuery.Edge> {
    public static final GetCommentsQuery$Comments$Companion$invoke$1$edges$1 INSTANCE = new GetCommentsQuery$Comments$Companion$invoke$1$edges$1();

    GetCommentsQuery$Comments$Companion$invoke$1$edges$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.Social.comments.GetCommentsQuery$Comments$Companion$invoke$1$edges$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetCommentsQuery.Edge> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final GetCommentsQuery.Edge invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return GetCommentsQuery.Edge.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final GetCommentsQuery.Edge invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (GetCommentsQuery.Edge) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
