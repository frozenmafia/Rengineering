package com.app.dream11.core.service.graphql.api;

import com.app.dream11.core.service.graphql.api.GetUrlForMediaUploadQuery;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class GetUrlForMediaUploadQuery$Data$Companion$invoke$1$getMediaUploadLink$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GetUrlForMediaUploadQuery.GetMediaUploadLink> {
    public static final GetUrlForMediaUploadQuery$Data$Companion$invoke$1$getMediaUploadLink$1 INSTANCE = new GetUrlForMediaUploadQuery$Data$Companion$invoke$1$getMediaUploadLink$1();

    GetUrlForMediaUploadQuery$Data$Companion$invoke$1$getMediaUploadLink$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GetUrlForMediaUploadQuery.GetMediaUploadLink invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GetUrlForMediaUploadQuery.GetMediaUploadLink.Companion.invoke(removecancellable);
    }
}
