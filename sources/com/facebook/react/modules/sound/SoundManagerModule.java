package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.fbreact.specs.NativeSoundManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = SoundManagerModule.NAME)
/* loaded from: classes4.dex */
public class SoundManagerModule extends NativeSoundManagerSpec {
    public static final String NAME = "SoundManager";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeSoundManagerSpec
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }
}
