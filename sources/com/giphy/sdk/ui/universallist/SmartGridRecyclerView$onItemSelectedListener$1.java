package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.Lambda;
import o.AudioFocusRequestCompat;
import o.Transition;
import o.runAnimators;
import o.setAnimationMatrix;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class SmartGridRecyclerView$onItemSelectedListener$1 extends Lambda implements Transition<AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat, Integer, setAnimationMatrix> {
    final /* synthetic */ Transition $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmartGridRecyclerView$onItemSelectedListener$1(Transition transition) {
        super(2);
        this.$value = transition;
    }

    @Override // o.Transition
    public /* synthetic */ setAnimationMatrix invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat, Integer num) {
        invoke(onAudioFocusChangeListenerHandlerCompat, num.intValue());
        return setAnimationMatrix.ag$a;
    }

    public final void invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat, int i) {
        runAnimators.ag$a(onAudioFocusChangeListenerHandlerCompat, "item");
        Transition transition = this.$value;
        if (transition != null) {
            setAnimationMatrix setanimationmatrix = (setAnimationMatrix) transition.invoke(onAudioFocusChangeListenerHandlerCompat, Integer.valueOf(i));
        }
    }
}
