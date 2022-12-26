package com.appsamurai.storyly.exoplayer2.core.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* loaded from: classes3.dex */
public interface AudioProcessor {
    public static final ByteBuffer toString = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void HaptikSDK$b();

    void ag$a();

    void ag$a(ByteBuffer byteBuffer);

    boolean ah$a();

    void ah$b();

    AudioProcessor$ag$a toString(AudioProcessor$ag$a audioProcessor$ag$a) throws UnhandledAudioFormatException;

    boolean valueOf();

    ByteBuffer values();

    /* loaded from: classes3.dex */
    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(AudioProcessor$ag$a audioProcessor$ag$a) {
            super("Unhandled format: " + audioProcessor$ag$a);
        }
    }
}
