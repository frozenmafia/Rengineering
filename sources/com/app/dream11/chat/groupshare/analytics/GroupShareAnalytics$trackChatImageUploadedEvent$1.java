package com.app.dream11.chat.groupshare.analytics;

import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GroupShareAnalytics$trackChatImageUploadedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $channelType;
    final /* synthetic */ String $channelUrl;
    final /* synthetic */ boolean $hasCaption;
    final /* synthetic */ int $memberCount;
    final /* synthetic */ Long $otherUserId;
    final /* synthetic */ String $screenName;
    final /* synthetic */ boolean $userOperator;
    final /* synthetic */ GroupShareAnalytics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupShareAnalytics$trackChatImageUploadedEvent$1(GroupShareAnalytics groupShareAnalytics, Long l, String str, boolean z, String str2, String str3, int i, boolean z2) {
        super(0);
        this.this$0 = groupShareAnalytics;
        this.$otherUserId = l;
        this.$channelUrl = str;
        this.$hasCaption = z;
        this.$screenName = str2;
        this.$channelType = str3;
        this.$memberCount = i;
        this.$userOperator = z2;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TrustedWebActivityCallbackRemote feature = GroupShareAnalytics.access$getChatFeature$p(this.this$0).getFeature();
        Long l = this.$otherUserId;
        readFamily.toString(feature, this.$channelUrl, this.$hasCaption, this.$screenName, this.$channelType, this.$memberCount, l == null ? -1L : l.longValue(), this.$userOperator);
    }
}
