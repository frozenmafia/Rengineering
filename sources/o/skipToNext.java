package o;

import android.content.Context;
import java.io.File;
/* loaded from: classes.dex */
public class skipToNext {
    private static int HaptikSDK$a = 0;
    private static String[] HaptikSDK$b = null;
    private static volatile ParcelableVolumeInfo HaptikSDK$c = null;
    private static toBundle ag$a = null;
    private static volatile PlaybackStateCompat ah$a = null;
    private static long[] ah$b = null;
    private static boolean invoke = false;
    private static int toString = 0;
    public static boolean valueOf = false;
    private static hashCode values;

    public static void values(String str) {
        if (invoke) {
            int i = HaptikSDK$a;
            if (i == 20) {
                toString++;
                return;
            }
            HaptikSDK$b[i] = str;
            ah$b[i] = System.nanoTime();
            androidx.core.os.TraceCompat.beginSection(str);
            HaptikSDK$a++;
        }
    }

    public static float ag$a(String str) {
        int i = toString;
        if (i > 0) {
            toString = i - 1;
            return 0.0f;
        } else if (invoke) {
            int i2 = HaptikSDK$a - 1;
            HaptikSDK$a = i2;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            }
            if (!str.equals(HaptikSDK$b[i2])) {
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + HaptikSDK$b[HaptikSDK$a] + ".");
            }
            androidx.core.os.TraceCompat.endSection();
            return ((float) (System.nanoTime() - ah$b[HaptikSDK$a])) / 1000000.0f;
        } else {
            return 0.0f;
        }
    }

    public static ParcelableVolumeInfo ah$a(Context context) {
        ParcelableVolumeInfo parcelableVolumeInfo = HaptikSDK$c;
        if (parcelableVolumeInfo == null) {
            synchronized (ParcelableVolumeInfo.class) {
                parcelableVolumeInfo = HaptikSDK$c;
                if (parcelableVolumeInfo == null) {
                    PlaybackStateCompat skiptonext = toString(context);
                    hashCode hashcode = values;
                    if (hashcode == null) {
                        hashcode = new getToken();
                    }
                    parcelableVolumeInfo = new ParcelableVolumeInfo(skiptonext, hashcode);
                    HaptikSDK$c = parcelableVolumeInfo;
                }
            }
        }
        return parcelableVolumeInfo;
    }

    public static PlaybackStateCompat toString(Context context) {
        final Context applicationContext = context.getApplicationContext();
        PlaybackStateCompat playbackStateCompat = ah$a;
        if (playbackStateCompat == null) {
            synchronized (PlaybackStateCompat.class) {
                playbackStateCompat = ah$a;
                if (playbackStateCompat == null) {
                    toBundle tobundle = ag$a;
                    if (tobundle == null) {
                        tobundle = new toBundle() { // from class: o.skipToNext.5
                            @Override // o.toBundle
                            public File ag$a() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    playbackStateCompat = new PlaybackStateCompat(tobundle);
                    ah$a = playbackStateCompat;
                }
            }
        }
        return playbackStateCompat;
    }
}
