package o;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.C;
/* loaded from: classes3.dex */
final class incrementOperationCount {
    private int HaptikSDK$a;
    private final values ag$a;
    private long ah$a;
    private long toString;
    private long valueOf;
    private long values;

    public incrementOperationCount(AudioTrack audioTrack) {
        if (getElevationDegrees.HaptikSDK$b >= 19) {
            this.ag$a = new values(audioTrack);
            ah$b();
            return;
        }
        this.ag$a = null;
        ag$a(3);
    }

    public boolean ag$a(long j) {
        values valuesVar = this.ag$a;
        if (valuesVar != null && j - this.valueOf >= this.values) {
            this.valueOf = j;
            boolean ah$a = valuesVar.ah$a();
            int i = this.HaptikSDK$a;
            if (i != 0) {
                if (i == 1) {
                    if (ah$a) {
                        if (this.ag$a.values() > this.toString) {
                            ag$a(2);
                            return ah$a;
                        }
                        return ah$a;
                    }
                    ah$b();
                    return ah$a;
                } else if (i == 2) {
                    if (ah$a) {
                        return ah$a;
                    }
                    ah$b();
                    return ah$a;
                } else if (i != 3) {
                    if (i == 4) {
                        return ah$a;
                    }
                    throw new IllegalStateException();
                } else if (ah$a) {
                    ah$b();
                    return ah$a;
                } else {
                    return ah$a;
                }
            } else if (ah$a) {
                if (this.ag$a.ag$a() >= this.ah$a) {
                    this.toString = this.ag$a.values();
                    ag$a(1);
                    return ah$a;
                }
            } else if (j - this.ah$a > 500000) {
                ag$a(3);
                return ah$a;
            } else {
                return ah$a;
            }
        }
        return false;
    }

    public void invoke() {
        ag$a(4);
    }

    public void values() {
        if (this.HaptikSDK$a == 4) {
            ah$b();
        }
    }

    public boolean valueOf() {
        return this.HaptikSDK$a == 2;
    }

    public void ah$b() {
        if (this.ag$a != null) {
            ag$a(0);
        }
    }

    public long ag$a() {
        values valuesVar = this.ag$a;
        return valuesVar != null ? valuesVar.ag$a() : C.TIME_UNSET;
    }

    public long ah$a() {
        values valuesVar = this.ag$a;
        if (valuesVar != null) {
            return valuesVar.values();
        }
        return -1L;
    }

    private void ag$a(int i) {
        this.HaptikSDK$a = i;
        if (i == 0) {
            this.valueOf = 0L;
            this.toString = -1L;
            this.ah$a = System.nanoTime() / 1000;
            this.values = WorkRequest.MIN_BACKOFF_MILLIS;
        } else if (i == 1) {
            this.values = WorkRequest.MIN_BACKOFF_MILLIS;
        } else if (i == 2 || i == 3) {
            this.values = 10000000L;
        } else if (i == 4) {
            this.values = 500000L;
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class values {
        private long ag$a;
        private long ah$a;
        private final AudioTrack toString;
        private long valueOf;
        private final AudioTimestamp values = new AudioTimestamp();

        public values(AudioTrack audioTrack) {
            this.toString = audioTrack;
        }

        public boolean ah$a() {
            boolean timestamp = this.toString.getTimestamp(this.values);
            if (timestamp) {
                long j = this.values.framePosition;
                if (this.ag$a > j) {
                    this.valueOf++;
                }
                this.ag$a = j;
                this.ah$a = j + (this.valueOf << 32);
            }
            return timestamp;
        }

        public long ag$a() {
            return this.values.nanoTime / 1000;
        }

        public long values() {
            return this.ah$a;
        }
    }
}
