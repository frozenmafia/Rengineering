package o;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import java.lang.reflect.Method;
/* loaded from: classes3.dex */
public final class clearThreadStatsTag {
    private long HaptikSDK$a;
    private long HaptikSDK$b;
    private boolean HaptikSDK$c;
    private boolean HaptikSDK$d;
    private long HaptikSDK$e;
    private long HaptikWebView;
    private int ICustomTabsCallback;
    private long ICustomTabsCallback$Default;
    private long ICustomTabsCallback$Stub;
    private long a;
    private long ag$a;
    private incrementOperationCount ah$a;
    private Method ah$b;
    private boolean aj$a;
    private int ak;
    private int ak$a;
    private boolean ak$b;
    private long asInterface;
    private int extraCallback;
    private long extraCallbackWithResult;
    private long getInitSettings;
    private long getSignupData;
    private boolean invoke;
    private final clearThreadStatsTag$ag$a isLogoutPending;
    private final long[] onMessageChannelReady;
    private long onNavigationEvent;
    private long onPostMessage;
    private long onRelationshipValidationResult;
    private long onXdkEvent;
    private int toString;
    private float valueOf;
    private AudioTrack values;

    public clearThreadStatsTag(clearThreadStatsTag$ag$a clearthreadstatstag_ag_a) {
        this.isLogoutPending = (clearThreadStatsTag$ag$a) FingerprintManagerCompat.toString(clearthreadstatstag_ag_a);
        if (getElevationDegrees.HaptikSDK$b >= 18) {
            try {
                this.ah$b = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.onMessageChannelReady = new long[10];
    }

    public void ag$a(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.values = audioTrack;
        this.extraCallback = i2;
        this.toString = i3;
        this.ah$a = new incrementOperationCount(audioTrack);
        this.ak$a = audioTrack.getSampleRate();
        this.aj$a = z && ah$a(i);
        boolean HaptikSDK$b = getElevationDegrees.HaptikSDK$b(i);
        this.HaptikSDK$c = HaptikSDK$b;
        this.ag$a = HaptikSDK$b ? HaptikSDK$a(i3 / i2) : -9223372036854775807L;
        this.getInitSettings = 0L;
        this.onNavigationEvent = 0L;
        this.extraCallbackWithResult = 0L;
        this.invoke = false;
        this.asInterface = C.TIME_UNSET;
        this.HaptikSDK$b = C.TIME_UNSET;
        this.HaptikWebView = 0L;
        this.a = 0L;
        this.valueOf = 1.0f;
    }

    public void ag$a(float f) {
        this.valueOf = f;
        incrementOperationCount incrementoperationcount = this.ah$a;
        if (incrementoperationcount != null) {
            incrementoperationcount.ah$b();
        }
    }

    public long values(boolean z) {
        long j;
        if (((AudioTrack) FingerprintManagerCompat.toString(this.values)).getPlayState() == 3) {
            HaptikSDK$b();
        }
        long nanoTime = System.nanoTime() / 1000;
        incrementOperationCount incrementoperationcount = (incrementOperationCount) FingerprintManagerCompat.toString(this.ah$a);
        boolean valueOf = incrementoperationcount.valueOf();
        if (valueOf) {
            j = HaptikSDK$a(incrementoperationcount.ah$a()) + getElevationDegrees.ah$a(nanoTime - incrementoperationcount.ag$a(), this.valueOf);
        } else {
            if (this.ICustomTabsCallback == 0) {
                j = HaptikSDK$a();
            } else {
                j = this.onPostMessage + nanoTime;
            }
            if (!z) {
                j = Math.max(0L, j - this.a);
            }
        }
        if (this.HaptikSDK$d != valueOf) {
            this.onRelationshipValidationResult = this.onXdkEvent;
            this.ICustomTabsCallback$Default = this.getSignupData;
        }
        long j2 = nanoTime - this.onRelationshipValidationResult;
        if (j2 < 1000000) {
            long j3 = this.ICustomTabsCallback$Default;
            long ah$a = getElevationDegrees.ah$a(j2, this.valueOf);
            long j4 = (j2 * 1000) / 1000000;
            j = ((j * j4) + ((1000 - j4) * (j3 + ah$a))) / 1000;
        }
        if (!this.ak$b) {
            long j5 = this.getSignupData;
            if (j > j5) {
                this.ak$b = true;
                long ag$a = getElevationDegrees.ag$a(getElevationDegrees.ag$a(j - j5), this.valueOf);
                this.isLogoutPending.toString(System.currentTimeMillis() - getElevationDegrees.ag$a(ag$a));
            }
        }
        this.onXdkEvent = nanoTime;
        this.getSignupData = j;
        this.HaptikSDK$d = valueOf;
        return j;
    }

    public void values() {
        ((incrementOperationCount) FingerprintManagerCompat.toString(this.ah$a)).ah$b();
    }

    public boolean ag$a() {
        return ((AudioTrack) FingerprintManagerCompat.toString(this.values)).getPlayState() == 3;
    }

    public boolean toString(long j) {
        int playState = ((AudioTrack) FingerprintManagerCompat.toString(this.values)).getPlayState();
        if (this.aj$a) {
            if (playState == 2) {
                this.invoke = false;
                return false;
            } else if (playState == 1 && ah$b() == 0) {
                return false;
            }
        }
        boolean z = this.invoke;
        boolean ah$a = ah$a(j);
        this.invoke = ah$a;
        if (z && !ah$a && playState != 1) {
            this.isLogoutPending.valueOf(this.toString, getElevationDegrees.ag$a(this.ag$a));
        }
        return true;
    }

    public int valueOf(long j) {
        return this.toString - ((int) (j - (ah$b() * this.extraCallback)));
    }

    public boolean ag$a(long j) {
        return this.HaptikSDK$b != C.TIME_UNSET && j > 0 && SystemClock.elapsedRealtime() - this.HaptikSDK$b >= 200;
    }

    public void values(long j) {
        this.ICustomTabsCallback$Stub = ah$b();
        this.asInterface = SystemClock.elapsedRealtime() * 1000;
        this.HaptikSDK$a = j;
    }

    public boolean ah$a(long j) {
        return j > ah$b() || invoke();
    }

    public boolean ah$a() {
        HaptikSDK$c();
        if (this.asInterface == C.TIME_UNSET) {
            ((incrementOperationCount) FingerprintManagerCompat.toString(this.ah$a)).ah$b();
            return true;
        }
        return false;
    }

    public void valueOf() {
        HaptikSDK$c();
        this.values = null;
        this.ah$a = null;
    }

    private void HaptikSDK$b() {
        long HaptikSDK$a = HaptikSDK$a();
        if (HaptikSDK$a == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.HaptikSDK$e >= 30000) {
            long[] jArr = this.onMessageChannelReady;
            int i = this.ak;
            jArr[i] = HaptikSDK$a - nanoTime;
            this.ak = (i + 1) % 10;
            int i2 = this.ICustomTabsCallback;
            if (i2 < 10) {
                this.ICustomTabsCallback = i2 + 1;
            }
            this.HaptikSDK$e = nanoTime;
            this.onPostMessage = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.ICustomTabsCallback;
                if (i3 >= i4) {
                    break;
                }
                this.onPostMessage += this.onMessageChannelReady[i3] / i4;
                i3++;
            }
        }
        if (this.aj$a) {
            return;
        }
        ag$a(nanoTime, HaptikSDK$a);
        HaptikSDK$c(nanoTime);
    }

    private void ag$a(long j, long j2) {
        incrementOperationCount incrementoperationcount = (incrementOperationCount) FingerprintManagerCompat.toString(this.ah$a);
        if (incrementoperationcount.ag$a(j)) {
            long ag$a = incrementoperationcount.ag$a();
            long ah$a = incrementoperationcount.ah$a();
            if (Math.abs(ag$a - j) > 5000000) {
                this.isLogoutPending.ah$a(ah$a, ag$a, j, j2);
                incrementoperationcount.invoke();
            } else if (Math.abs(HaptikSDK$a(ah$a) - j2) > 5000000) {
                this.isLogoutPending.valueOf(ah$a, ag$a, j, j2);
                incrementoperationcount.invoke();
            } else {
                incrementoperationcount.values();
            }
        }
    }

    private void HaptikSDK$c(long j) {
        Method method;
        if (!this.HaptikSDK$c || (method = this.ah$b) == null || j - this.HaptikWebView < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) getElevationDegrees.ah$a((Integer) method.invoke(FingerprintManagerCompat.toString(this.values), new Object[0]))).intValue() * 1000) - this.ag$a;
            this.a = intValue;
            long max = Math.max(intValue, 0L);
            this.a = max;
            if (max > 5000000) {
                this.isLogoutPending.ah$a(max);
                this.a = 0L;
            }
        } catch (Exception unused) {
            this.ah$b = null;
        }
        this.HaptikWebView = j;
    }

    private long HaptikSDK$a(long j) {
        return (j * 1000000) / this.ak$a;
    }

    private void HaptikSDK$c() {
        this.onPostMessage = 0L;
        this.ICustomTabsCallback = 0;
        this.ak = 0;
        this.HaptikSDK$e = 0L;
        this.onXdkEvent = 0L;
        this.onRelationshipValidationResult = 0L;
        this.ak$b = false;
    }

    private boolean invoke() {
        return this.aj$a && ((AudioTrack) FingerprintManagerCompat.toString(this.values)).getPlayState() == 2 && ah$b() == 0;
    }

    private static boolean ah$a(int i) {
        return getElevationDegrees.HaptikSDK$b < 23 && (i == 5 || i == 6);
    }

    private long HaptikSDK$a() {
        return HaptikSDK$a(ah$b());
    }

    private long ah$b() {
        AudioTrack audioTrack = (AudioTrack) FingerprintManagerCompat.toString(this.values);
        if (this.asInterface != C.TIME_UNSET) {
            return Math.min(this.HaptikSDK$a, this.ICustomTabsCallback$Stub + ((((SystemClock.elapsedRealtime() * 1000) - this.asInterface) * this.ak$a) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.aj$a) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.extraCallbackWithResult = this.getInitSettings;
            }
            playbackHeadPosition += this.extraCallbackWithResult;
        }
        if (getElevationDegrees.HaptikSDK$b <= 29) {
            if (playbackHeadPosition == 0 && this.getInitSettings > 0 && playState == 3) {
                if (this.HaptikSDK$b == C.TIME_UNSET) {
                    this.HaptikSDK$b = SystemClock.elapsedRealtime();
                }
                return this.getInitSettings;
            }
            this.HaptikSDK$b = C.TIME_UNSET;
        }
        if (this.getInitSettings > playbackHeadPosition) {
            this.onNavigationEvent++;
        }
        this.getInitSettings = playbackHeadPosition;
        return playbackHeadPosition + (this.onNavigationEvent << 32);
    }
}
