package o;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.MimeTypes;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FontsContractCompat$ag$a {
    private final boolean ag$a;
    private Handler ah$a;
    private final Spatializer valueOf;
    private Spatializer.OnSpatializerStateChangedListener values;

    public static FontsContractCompat$ag$a valueOf(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return new FontsContractCompat$ag$a(audioManager.getSpatializer());
    }

    private FontsContractCompat$ag$a(Spatializer spatializer) {
        this.valueOf = spatializer;
        this.ag$a = spatializer.getImmersiveAudioLevel() != 0;
    }

    public void ag$a(final FontsContractCompat fontsContractCompat, Looper looper) {
        if (this.values == null && this.ah$a == null) {
            this.values = new Spatializer.OnSpatializerStateChangedListener() { // from class: o.FontsContractCompat$ag$a.2
            };
            Handler handler = new Handler(looper);
            this.ah$a = handler;
            Spatializer spatializer = this.valueOf;
            handler.getClass();
            spatializer.addOnSpatializerStateChangedListener(new untagSocket(handler), this.values);
        }
    }

    public boolean valueOf() {
        return this.ag$a;
    }

    public boolean ag$a() {
        return this.valueOf.isAvailable();
    }

    public boolean values() {
        return this.valueOf.isEnabled();
    }

    public boolean toString(setTargetDensity settargetdensity, createFromIcon createfromicon) {
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(getElevationDegrees.ag$a((MimeTypes.AUDIO_E_AC3_JOC.equals(createfromicon.onNavigationEvent) && createfromicon.toString == 16) ? 12 : createfromicon.toString));
        if (createfromicon.onMessageChannelReady != -1) {
            channelMask.setSampleRate(createfromicon.onMessageChannelReady);
        }
        return this.valueOf.canBeSpatialized(settargetdensity.valueOf().valueOf, channelMask.build());
    }

    public void ah$a() {
        Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.values;
        if (onSpatializerStateChangedListener == null || this.ah$a == null) {
            return;
        }
        this.valueOf.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
        ((Handler) getElevationDegrees.ah$a(this.ah$a)).removeCallbacksAndMessages(null);
        this.ah$a = null;
        this.values = null;
    }
}
