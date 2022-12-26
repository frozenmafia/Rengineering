package com.app.dream11.ui;

import com.app.dream11.chat.gif.IGifMediaListener;
import com.giphy.sdk.core.network.response.MediaResponse;
import kotlin.jvm.internal.Lambda;
import o.Transition;
import o.setAnimationMatrix;
/* loaded from: classes3.dex */
public final class BindingAdapters$setGifView$1$1 extends Lambda implements Transition<MediaResponse, Throwable, setAnimationMatrix> {
    final /* synthetic */ IGifMediaListener $gifMediaListener;
    final /* synthetic */ String $mediaId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingAdapters$setGifView$1$1(IGifMediaListener iGifMediaListener, String str) {
        super(2);
        this.$gifMediaListener = iGifMediaListener;
        this.$mediaId = str;
    }

    @Override // o.Transition
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(MediaResponse mediaResponse, Throwable th) {
        invoke2(mediaResponse, th);
        return setAnimationMatrix.ag$a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MediaResponse mediaResponse, Throwable th) {
        IGifMediaListener iGifMediaListener = this.$gifMediaListener;
        if (iGifMediaListener == null) {
            return;
        }
        String str = this.$mediaId;
        if (str == null) {
            str = "";
        }
        iGifMediaListener.onMediaResponse(str, th);
    }
}
