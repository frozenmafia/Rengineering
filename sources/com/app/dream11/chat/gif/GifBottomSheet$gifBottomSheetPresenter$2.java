package com.app.dream11.chat.gif;

import com.app.dream11.chat.presenters.GifBottomSheetPresenter;
import kotlin.jvm.internal.Lambda;
import o.ActionMenuItem;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class GifBottomSheet$gifBottomSheetPresenter$2 extends Lambda implements Styleable.ArcMotion<GifBottomSheetPresenter> {
    final /* synthetic */ GifBottomSheet this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifBottomSheet$gifBottomSheetPresenter$2(GifBottomSheet gifBottomSheet) {
        super(0);
        this.this$0 = gifBottomSheet;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.Styleable.ArcMotion
    public final GifBottomSheetPresenter invoke() {
        GifBottomSheetPresenter IPostMessageService = ActionMenuItem.valueOf().IPostMessageService();
        IPostMessageService.setGifBottomSheetListener(this.this$0.getMListener());
        return IPostMessageService;
    }
}
