package com.giphy.sdk.ui.universallist;

import kotlin.jvm.internal.Lambda;
import o.AudioFocusRequestCompat;
import o.Styleable;
import o.runAnimators;
/* loaded from: classes4.dex */
final class SmartGridRecyclerView$loadGifs$1$onComplete$1$3 extends Lambda implements Styleable.ChangeBounds<AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat, Boolean> {
    public static final SmartGridRecyclerView$loadGifs$1$onComplete$1$3 INSTANCE = new SmartGridRecyclerView$loadGifs$1$onComplete$1$3();

    SmartGridRecyclerView$loadGifs$1$onComplete$1$3() {
        super(1);
    }

    @Override // o.Styleable.ChangeBounds
    public /* synthetic */ Boolean invoke(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat) {
        return Boolean.valueOf(invoke2(onAudioFocusChangeListenerHandlerCompat));
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(AudioFocusRequestCompat.OnAudioFocusChangeListenerHandlerCompat onAudioFocusChangeListenerHandlerCompat) {
        runAnimators.ag$a(onAudioFocusChangeListenerHandlerCompat, "it");
        return onAudioFocusChangeListenerHandlerCompat.values().ordinal() == SmartItemType.UserProfile.ordinal();
    }
}
