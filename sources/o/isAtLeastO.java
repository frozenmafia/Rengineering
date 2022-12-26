package o;
/* loaded from: classes3.dex */
public final class isAtLeastO {
    public int HaptikSDK$a;
    public int HaptikSDK$b;
    public int HaptikSDK$c;
    public long HaptikSDK$d;
    public int HaptikWebView;
    public int ag$a;
    public int ah$a;
    public int ah$b;
    public int invoke;
    public int toString;
    public int valueOf;
    public int values;

    public void ag$a() {
        synchronized (this) {
        }
    }

    public void ag$a(long j) {
        ah$a(j, 1);
    }

    private void ah$a(long j, int i) {
        this.HaptikSDK$d += j;
        this.HaptikWebView += i;
    }

    public String toString() {
        return getElevationDegrees.values("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.valueOf), Integer.valueOf(this.ah$a), Integer.valueOf(this.HaptikSDK$c), Integer.valueOf(this.ah$b), Integer.valueOf(this.HaptikSDK$b), Integer.valueOf(this.HaptikSDK$a), Integer.valueOf(this.ag$a), Integer.valueOf(this.values), Integer.valueOf(this.invoke), Integer.valueOf(this.toString), Long.valueOf(this.HaptikSDK$d), Integer.valueOf(this.HaptikWebView));
    }
}
