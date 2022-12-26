package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.Lambda;
import o.AudioFocusRequestCompat;
import o.Styleable;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class SmartGridAdapter$userProfileInfoPressListener$1 extends Lambda implements Styleable.ChangeBounds<AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat, setAnimationMatrix> {
    public static final SmartGridAdapter$userProfileInfoPressListener$1 INSTANCE = new SmartGridAdapter$userProfileInfoPressListener$1();

    SmartGridAdapter$userProfileInfoPressListener$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat) {
        runAnimators.ag$a(onAudioFocusChangeListenerHandlerCompat, "<anonymous parameter 0>");
    }

    @Override // o.Styleable.ChangeBounds
    public /* bridge */ /* synthetic */ setAnimationMatrix invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat) {
        invoke2(onAudioFocusChangeListenerHandlerCompat);
        return setAnimationMatrix.ag$a;
    }
}
