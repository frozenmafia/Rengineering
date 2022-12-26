package com.app.dream11.chat.helpers;

import com.app.dream11.chat.interfaces.IChatChannel;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.readFamily;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatEventHelper$sendGroupShareEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $source;
    final /* synthetic */ ChatEventHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEventHelper$sendGroupShareEvent$1(ChatEventHelper chatEventHelper, String str) {
        super(0);
        this.this$0 = chatEventHelper;
        this.$source = str;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String channelUrl;
        String channelType;
        TrustedWebActivityCallbackRemote access$getFeature$p = ChatEventHelper.access$getFeature$p(this.this$0);
        IChatChannel chatChannel = this.this$0.getChatChannel();
        boolean isUserOperator = chatChannel == null ? false : chatChannel.isUserOperator();
        IChatChannel chatChannel2 = this.this$0.getChatChannel();
        int memberCount = chatChannel2 == null ? -1 : chatChannel2.getMemberCount();
        IChatChannel chatChannel3 = this.this$0.getChatChannel();
        String str = (chatChannel3 == null || (channelType = chatChannel3.getChannelType()) == null) ? "" : channelType;
        IChatChannel chatChannel4 = this.this$0.getChatChannel();
        String channelName = chatChannel4 == null ? null : chatChannel4.getChannelName();
        IChatChannel chatChannel5 = this.this$0.getChatChannel();
        readFamily.toString(access$getFeature$p, channelName, isUserOperator, this.$source, str, memberCount, (chatChannel5 == null || (channelUrl = chatChannel5.getChannelUrl()) == null) ? "" : channelUrl);
    }
}
