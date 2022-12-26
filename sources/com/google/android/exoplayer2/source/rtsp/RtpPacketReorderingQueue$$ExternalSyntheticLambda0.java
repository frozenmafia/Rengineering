package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.source.rtsp.RtpPacketReorderingQueue;
import java.util.Comparator;
/* loaded from: classes5.dex */
public final /* synthetic */ class RtpPacketReorderingQueue$$ExternalSyntheticLambda0 implements Comparator {
    public static final /* synthetic */ RtpPacketReorderingQueue$$ExternalSyntheticLambda0 INSTANCE = new RtpPacketReorderingQueue$$ExternalSyntheticLambda0();

    private /* synthetic */ RtpPacketReorderingQueue$$ExternalSyntheticLambda0() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int calculateSequenceNumberShift;
        calculateSequenceNumberShift = RtpPacketReorderingQueue.calculateSequenceNumberShift(((RtpPacketReorderingQueue.RtpPacketContainer) obj).packet.sequenceNumber, ((RtpPacketReorderingQueue.RtpPacketContainer) obj2).packet.sequenceNumber);
        return calculateSequenceNumberShift;
    }
}
