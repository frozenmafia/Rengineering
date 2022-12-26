package com.app.dream11.chat.helpers;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import com.dreampay.commons.constants.Constants;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.TrustedWebActivityCallbackRemote;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ChatEventHelper$sendGifLoadingFailedEvent$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $mediaId;
    final /* synthetic */ String $reason;
    final /* synthetic */ ChatEventHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEventHelper$sendGifLoadingFailedEvent$1(ChatEventHelper chatEventHelper, String str, String str2) {
        super(0);
        this.this$0 = chatEventHelper;
        this.$mediaId = str;
        this.$reason = str2;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TrustedWebActivityCallbackRemote access$getFeature$p = ChatEventHelper.access$getFeature$p(this.this$0);
        NewEvents newEvents = new NewEvents("MediaLoaded");
        String str = this.$mediaId;
        String str2 = this.$reason;
        newEvents.addProperty(Constants.RESULT, "failed");
        newEvents.addProperty("media_type", "gifs");
        newEvents.addProperty("media_url", str);
        newEvents.addProperty("errorMessage", str2);
        access$getFeature$p.trackEvent(newEvents, new EventTracker[0]);
    }
}
