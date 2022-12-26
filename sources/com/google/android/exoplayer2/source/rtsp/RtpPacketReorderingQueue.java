package com.google.android.exoplayer2.source.rtsp;

import java.util.TreeSet;
/* loaded from: classes5.dex */
final class RtpPacketReorderingQueue {
    static final int MAX_SEQUENCE_LEAP_ALLOWED = 1000;
    private static final int QUEUE_SIZE_THRESHOLD_FOR_RESET = 5000;
    private int lastDequeuedSequenceNumber;
    private int lastReceivedSequenceNumber;
    private final TreeSet<RtpPacketContainer> packetQueue = new TreeSet<>(RtpPacketReorderingQueue$$ExternalSyntheticLambda0.INSTANCE);
    private boolean started;

    public RtpPacketReorderingQueue() {
        reset();
    }

    public void reset() {
        synchronized (this) {
            this.packetQueue.clear();
            this.started = false;
            this.lastDequeuedSequenceNumber = -1;
            this.lastReceivedSequenceNumber = -1;
        }
    }

    public boolean offer(RtpPacket rtpPacket, long j) {
        synchronized (this) {
            if (this.packetQueue.size() >= 5000) {
                throw new IllegalStateException("Queue size limit of 5000 reached.");
            }
            int i = rtpPacket.sequenceNumber;
            if (!this.started) {
                reset();
                this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i);
                this.started = true;
                addToQueue(new RtpPacketContainer(rtpPacket, j));
                return true;
            } else if (Math.abs(calculateSequenceNumberShift(i, RtpPacket.getNextSequenceNumber(this.lastReceivedSequenceNumber))) < 1000) {
                if (calculateSequenceNumberShift(i, this.lastDequeuedSequenceNumber) > 0) {
                    addToQueue(new RtpPacketContainer(rtpPacket, j));
                    return true;
                }
                return false;
            } else {
                this.lastDequeuedSequenceNumber = RtpPacket.getPreviousSequenceNumber(i);
                this.packetQueue.clear();
                addToQueue(new RtpPacketContainer(rtpPacket, j));
                return true;
            }
        }
    }

    public RtpPacket poll(long j) {
        synchronized (this) {
            if (this.packetQueue.isEmpty()) {
                return null;
            }
            RtpPacketContainer first = this.packetQueue.first();
            int i = first.packet.sequenceNumber;
            if (i == RtpPacket.getNextSequenceNumber(this.lastDequeuedSequenceNumber) || j >= first.receivedTimestampMs) {
                this.packetQueue.pollFirst();
                this.lastDequeuedSequenceNumber = i;
                return first.packet;
            }
            return null;
        }
    }

    private void addToQueue(RtpPacketContainer rtpPacketContainer) {
        synchronized (this) {
            this.lastReceivedSequenceNumber = rtpPacketContainer.packet.sequenceNumber;
            this.packetQueue.add(rtpPacketContainer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class RtpPacketContainer {
        public final RtpPacket packet;
        public final long receivedTimestampMs;

        public RtpPacketContainer(RtpPacket rtpPacket, long j) {
            this.packet = rtpPacket;
            this.receivedTimestampMs = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int calculateSequenceNumberShift(int i, int i2) {
        int min;
        int i3 = i - i2;
        return (Math.abs(i3) <= 1000 || (min = (Math.min(i, i2) - Math.max(i, i2)) + 65535) >= 1000) ? i3 : i < i2 ? min : -min;
    }
}
