package o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.provider.Settings;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class getInputStream {
    private final int ah$a;
    private final int[] toString;
    public static final getInputStream ag$a = new getInputStream(new int[]{2}, 8);
    private static final getInputStream values = new getInputStream(new int[]{2, 5, 6}, 8);
    private static final ImmutableMap<Integer, Integer> valueOf = new ImmutableMap.valueOf().toString(5, 6).toString(17, 6).toString(7, 6).toString(18, 6).toString(6, 8).toString(8, 8).toString(14, 8).ag$a();

    public static getInputStream toString(Context context) {
        return ah$a(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    static getInputStream ah$a(Context context, Intent intent) {
        if (valueOf() && Settings.Global.getInt(context.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
            return values;
        }
        if (getElevationDegrees.HaptikSDK$b >= 29 && (getElevationDegrees.ag$a(context) || getElevationDegrees.valueOf(context))) {
            return new getInputStream(getInputStream$ah$a.ah$a(), 8);
        }
        if (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) {
            return ag$a;
        }
        return new getInputStream(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
    }

    public getInputStream(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.toString = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.toString = new int[0];
        }
        this.ah$a = i;
    }

    public boolean ag$a(int i) {
        return Arrays.binarySearch(this.toString, i) >= 0;
    }

    public boolean ag$a(createFromIcon createfromicon) {
        return ah$a(createfromicon) != null;
    }

    public android.util.Pair<Integer, Integer> ah$a(createFromIcon createfromicon) {
        int valueOf2;
        int valueOf3 = getSignature.valueOf((String) FingerprintManagerCompat.toString(createfromicon.onNavigationEvent), createfromicon.invoke);
        if (valueOf.containsKey(Integer.valueOf(valueOf3))) {
            if (valueOf3 == 18 && !ag$a(18)) {
                valueOf3 = 6;
            } else if (valueOf3 == 8 && !ag$a(8)) {
                valueOf3 = 7;
            }
            if (ag$a(valueOf3)) {
                if (createfromicon.toString == -1 || valueOf3 == 18) {
                    valueOf2 = valueOf(valueOf3, createfromicon.onMessageChannelReady != -1 ? createfromicon.onMessageChannelReady : OpusUtil.SAMPLE_RATE);
                } else {
                    valueOf2 = createfromicon.toString;
                    if (valueOf2 > this.ah$a) {
                        return null;
                    }
                }
                int getinputstream = toString(valueOf2);
                if (getinputstream == 0) {
                    return null;
                }
                return android.util.Pair.create(Integer.valueOf(valueOf3), Integer.valueOf(getinputstream));
            }
            return null;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof getInputStream) {
            getInputStream getinputstream = (getInputStream) obj;
            return Arrays.equals(this.toString, getinputstream.toString) && this.ah$a == getinputstream.ah$a;
        }
        return false;
    }

    public int hashCode() {
        return this.ah$a + (Arrays.hashCode(this.toString) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.ah$a + ", supportedEncodings=" + Arrays.toString(this.toString) + "]";
    }

    private static boolean valueOf() {
        return getElevationDegrees.HaptikSDK$b >= 17 && ("Amazon".equals(getElevationDegrees.toString) || "Xiaomi".equals(getElevationDegrees.toString));
    }

    private static int valueOf(int i, int i2) {
        if (getElevationDegrees.HaptikSDK$b >= 29) {
            return getInputStream$ah$a.valueOf(i, i2);
        }
        return ((Integer) FingerprintManagerCompat.toString(valueOf.getOrDefault(Integer.valueOf(i), 0))).intValue();
    }

    private static int toString(int i) {
        if (getElevationDegrees.HaptikSDK$b <= 28) {
            if (i == 7) {
                i = 8;
            } else if (i == 3 || i == 4 || i == 5) {
                i = 6;
            }
        }
        if (getElevationDegrees.HaptikSDK$b <= 26 && "fugu".equals(getElevationDegrees.ah$a) && i == 1) {
            i = 2;
        }
        return getElevationDegrees.ag$a(i);
    }
}
