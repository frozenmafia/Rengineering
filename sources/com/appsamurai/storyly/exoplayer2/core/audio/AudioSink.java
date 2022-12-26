package com.appsamurai.storyly.exoplayer2.core.audio;

import java.nio.ByteBuffer;
import o.createFromIcon;
import o.sendUrgentData;
import o.setCircular;
import o.setTargetDensity;
import o.typeToString;
/* loaded from: classes3.dex */
public interface AudioSink {

    /* loaded from: classes3.dex */
    public interface toString {
        void ag$a();

        void ah$a();

        void ah$a(long j);

        void ah$a(Exception exc);

        void valueOf(int i, long j, long j2);

        void valueOf(boolean z);

        void values();
    }

    boolean HaptikSDK$a();

    void HaptikSDK$b();

    boolean HaptikSDK$c();

    void HaptikSDK$e();

    void ag$a();

    void ag$a(setCircular setcircular);

    void ag$a(typeToString typetostring);

    boolean ag$a(ByteBuffer byteBuffer, long j, int i) throws InitializationException, WriteException;

    void ah$a();

    void ah$a(int i);

    void ah$a(toString tostring);

    void ah$a(sendUrgentData sendurgentdata);

    void ah$a(boolean z);

    boolean ah$a(createFromIcon createfromicon);

    typeToString ah$b();

    void getInitSettings();

    void getSignupData() throws WriteException;

    void invoke();

    long toString(boolean z);

    int valueOf(createFromIcon createfromicon);

    void valueOf();

    void valueOf(createFromIcon createfromicon, int i, int[] iArr) throws ConfigurationException;

    void values();

    void values(float f);

    void values(setTargetDensity settargetdensity);

    /* loaded from: classes3.dex */
    public static final class ConfigurationException extends Exception {
        public final createFromIcon format;

        public ConfigurationException(Throwable th, createFromIcon createfromicon) {
            super(th);
            this.format = createfromicon;
        }

        public ConfigurationException(String str, createFromIcon createfromicon) {
            super(str);
            this.format = createfromicon;
        }
    }

    /* loaded from: classes3.dex */
    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final createFromIcon format;
        public final boolean isRecoverable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public InitializationException(int r3, int r4, int r5, int r6, o.createFromIcon r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AudioTrack init failed "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = "Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L32
                java.lang.String r4 = " (recoverable)"
                goto L34
            L32:
                java.lang.String r4 = ""
            L34:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.audioTrackState = r3
                r2.isRecoverable = r8
                r2.format = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsamurai.storyly.exoplayer2.core.audio.AudioSink.InitializationException.<init>(int, int, int, int, o.createFromIcon, boolean, java.lang.Exception):void");
        }
    }

    /* loaded from: classes3.dex */
    public static final class WriteException extends Exception {
        public final int errorCode;
        public final createFromIcon format;
        public final boolean isRecoverable;

        public WriteException(int i, createFromIcon createfromicon, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = createfromicon;
        }
    }

    /* loaded from: classes3.dex */
    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }
}
