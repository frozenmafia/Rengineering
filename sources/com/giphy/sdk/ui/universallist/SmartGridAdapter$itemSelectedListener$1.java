package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.Lambda;
import o.AudioFocusRequestCompat;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* loaded from: classes7.dex */
public final class SmartGridAdapter$itemSelectedListener$1 extends Lambda implements Transition<AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat, Integer, setAnimationMatrix> {
    public static final SmartGridAdapter$itemSelectedListener$1 INSTANCE = new SmartGridAdapter$itemSelectedListener$1();

    SmartGridAdapter$itemSelectedListener$1() {
        super(2);
    }

    public final void invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat, int i) {
        runAnimators.ag$a(onAudioFocusChangeListenerHandlerCompat, "<anonymous parameter 0>");
    }

    @Override // o.Transition
    public /* synthetic */ setAnimationMatrix invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat, Integer num) {
        invoke(onAudioFocusChangeListenerHandlerCompat, num.intValue());
        return setAnimationMatrix.ag$a;
    }
}
