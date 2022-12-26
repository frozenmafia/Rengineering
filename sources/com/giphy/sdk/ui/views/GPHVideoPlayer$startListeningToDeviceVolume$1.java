package com.giphy.sdk.ui.views;

import android.media.AudioManager;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class GPHVideoPlayer$startListeningToDeviceVolume$1 extends Lambda implements Styleable.ArcMotion<setAnimationMatrix> {
    final /* synthetic */ GPHVideoPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPHVideoPlayer$startListeningToDeviceVolume$1(GPHVideoPlayer gPHVideoPlayer) {
        super(0);
        this.this$0 = gPHVideoPlayer;
    }

    @Override // o.Styleable.ArcMotion
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke() {
        invoke2();
        return setAnimationMatrix.ag$a;
    }

    @Override // o.Styleable.ArcMotion
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AudioManager audioManager = this.this$0.getAudioManager();
        runAnimators.toString(audioManager);
        float f = audioManager.getStreamVolume(3) > 0 ? 1.0f : 0.0f;
        this.this$0.isDeviceMuted = f == 0.0f;
        this.this$0.setVolume(f);
    }
}
