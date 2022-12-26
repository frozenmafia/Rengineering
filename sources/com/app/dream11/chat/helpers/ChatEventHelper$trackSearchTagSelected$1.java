package com.app.dream11.chat.helpers;

import com.app.dream11.integration.EventTracker;
import com.app.dream11.model.NewEvents;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class ChatEventHelper$trackSearchTagSelected$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ int $resultCount;
    final /* synthetic */ String $searchKeyword;
    final /* synthetic */ String $searchType;
    final /* synthetic */ ChatEventHelper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEventHelper$trackSearchTagSelected$1(ChatEventHelper chatEventHelper, String str, String str2, String str3, int i) {
        super(0);
        this.this$0 = chatEventHelper;
        this.$mediaType = str;
        this.$searchType = str2;
        this.$searchKeyword = str3;
        this.$resultCount = i;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NewEvents newEvents = new NewEvents("SearchTagSelected");
        this.this$0.addCommonProperties(newEvents);
        newEvents.addProperty("media_type", this.$mediaType);
        newEvents.addProperty("search_type", this.$searchType);
        newEvents.addProperty("search_keyword", this.$searchKeyword);
        newEvents.addProperty("search_result_count", Integer.valueOf(this.$resultCount));
        ChatEventHelper.access$getFeature$p(this.this$0).trackEvent(newEvents, new EventTracker[0]);
    }
}
