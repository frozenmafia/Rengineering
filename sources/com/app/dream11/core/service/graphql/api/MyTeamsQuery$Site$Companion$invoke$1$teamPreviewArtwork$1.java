package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.MyTeamsQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class MyTeamsQuery$Site$Companion$invoke$1$teamPreviewArtwork$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable.values, MyTeamsQuery.TeamPreviewArtwork> {
    public static final MyTeamsQuery$Site$Companion$invoke$1$teamPreviewArtwork$1 INSTANCE = new MyTeamsQuery$Site$Companion$invoke$1$teamPreviewArtwork$1();

    MyTeamsQuery$Site$Companion$invoke$1$teamPreviewArtwork$1() {
        super(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.app.dream11.core.service.graphql.api.MyTeamsQuery$Site$Companion$invoke$1$teamPreviewArtwork$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, MyTeamsQuery.TeamPreviewArtwork> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // o.Styleable.ChangeBounds
        public final MyTeamsQuery.TeamPreviewArtwork invoke(removeCancellable removecancellable) {
            runAnimators.ag$a(removecancellable, "reader");
            return MyTeamsQuery.TeamPreviewArtwork.Companion.invoke(removecancellable);
        }
    }

    @Override // o.Styleable.ChangeBounds
    public final MyTeamsQuery.TeamPreviewArtwork invoke(removeCancellable.values valuesVar) {
        runAnimators.ag$a(valuesVar, "reader");
        return (MyTeamsQuery.TeamPreviewArtwork) valuesVar.ag$a(AnonymousClass1.INSTANCE);
    }
}
