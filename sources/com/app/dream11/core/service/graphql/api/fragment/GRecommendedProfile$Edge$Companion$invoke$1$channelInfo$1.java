package com.app.dream11.core.service.graphql.api.fragment;

import com.app.dream11.core.service.graphql.api.fragment.GRecommendedProfile;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.removeCancellable;
import o.runAnimators;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class GRecommendedProfile$Edge$Companion$invoke$1$channelInfo$1 extends Lambda implements Styleable.ChangeBounds<removeCancellable, GRecommendedProfile.ChannelInfo> {
    public static final GRecommendedProfile$Edge$Companion$invoke$1$channelInfo$1 INSTANCE = new GRecommendedProfile$Edge$Companion$invoke$1$channelInfo$1();

    GRecommendedProfile$Edge$Companion$invoke$1$channelInfo$1() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public final GRecommendedProfile.ChannelInfo invoke(removeCancellable removecancellable) {
        runAnimators.ag$a(removecancellable, "reader");
        return GRecommendedProfile.ChannelInfo.Companion.invoke(removecancellable);
    }
}
