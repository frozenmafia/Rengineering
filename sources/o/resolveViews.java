package o;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import o.IMultiInstanceInvalidationService;
/* loaded from: classes5.dex */
class resolveViews {
    private final Context ah$a;
    private final unique valueOf;

    private String ah$a(int i) {
        return i != 0 ? i != 1 ? "NORMAL" : "VIBRATE" : "SILENT";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public resolveViews(Context context, unique uniqueVar) {
        this.ah$a = context;
        this.valueOf = uniqueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void values() {
        try {
            ag$a("l2", "accelerometer_rotation", 0);
            ag$a("l3", "adb_enabled", 1);
            ag$a("l4", "airplane_mode_on", 1);
            ag$a("l5", "auto_time", 1);
            ag$a("l6", "auto_time_zone", 1);
            ag$a("l7", "bluetooth_on", 1);
            ag$a("l9", "device_provisioned", 1);
            ag$a("m1", "development_settings_enabled", 1);
            ag$a("m2", "dtmf_tone", 0);
            valueOf("m3", "end_button_behavior", 0, 0);
            toString("font_scale", 0);
            ag$a("m5", "haptic_feedback_enabled", 0);
            HaptikSDK$c();
            valueOf("n2", "screen_brightness", -1, 0);
            ag$a("n3", "screen_brightness_mode", 0);
            values("n4", "screen_off_timeout", -1L, 0);
            ag$a("n6", "sound_effects_enabled", 0);
            ah$a();
            ag$a("n8", "auto_caps", 0);
            ag$a("n9", "auto_punctuate", 0);
            ag$a("o1", "auto_replace", 0);
            ag$a("o2", "show_password", 0);
            valueOf();
            ag$a("o4", "vibrate_on", 0);
            values("o5", "tts_default_synth", 2);
            valueOf("o6", "tts_default_rate", 100, 2);
            valueOf("o7", "tts_default_pitch", 100, 2);
            ag$a();
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception Occurred in collectUserSettingsMeta: ", e);
        }
    }

    private void ag$a(String str, String str2, int i) {
        try {
            this.valueOf.valueOf(str, Boolean.valueOf(InvalidationLiveDataContainer.valueOf(this.ah$a, str2, 0, i) > 0));
        } catch (Exception e) {
            this.valueOf.ag$a(str, e.toString());
        }
    }

    private void ah$a() {
        try {
            boolean z = true;
            if (InvalidationLiveDataContainer.valueOf(this.ah$a, "stay_on_while_plugged_in", -1, 1) == 0) {
                z = false;
            }
            this.valueOf.valueOf("n7", Boolean.valueOf(z));
        } catch (Exception e) {
            this.valueOf.ag$a("n7", e.toString());
        }
    }

    private void valueOf(String str, String str2, int i, int i2) {
        try {
            this.valueOf.valueOf(str, Integer.valueOf(InvalidationLiveDataContainer.valueOf(this.ah$a, str2, i, i2)));
        } catch (Exception e) {
            this.valueOf.ag$a(str, e.toString());
        }
    }

    private void values(String str, String str2, long j, int i) {
        try {
            this.valueOf.valueOf(str, Long.valueOf(InvalidationLiveDataContainer.toString(this.ah$a, str2, j, i)));
        } catch (Exception e) {
            this.valueOf.ag$a(str, e.toString());
        }
    }

    private void values(String str, String str2, int i) {
        try {
            this.valueOf.valueOf(str, InvalidationLiveDataContainer.valueOf(this.ah$a, str2, "", i));
        } catch (Exception e) {
            this.valueOf.ag$a(str, e.toString());
        }
    }

    private void toString(String str, int i) {
        try {
            this.valueOf.valueOf("m4", Float.valueOf(InvalidationLiveDataContainer.valueOf(this.ah$a, str, 0.0f, i)));
        } catch (Exception e) {
            this.valueOf.ag$a("m4", e.toString());
        }
    }

    private void HaptikSDK$c() {
        try {
            this.valueOf.valueOf("n1", ah$a(InvalidationLiveDataContainer.valueOf(this.ah$a, "mode_ringer", 2, 1)));
        } catch (Exception e) {
            this.valueOf.ag$a("n1", e.toString());
        }
    }

    private void valueOf() {
        try {
            this.valueOf.valueOf("o3", Boolean.valueOf("24".equals(InvalidationLiveDataContainer.valueOf(this.ah$a, "time_12_24", "12", 0))));
        } catch (Exception e) {
            this.valueOf.ag$a("o3", e.toString());
        }
    }

    private void ag$a() {
        if (Build.VERSION.SDK_INT >= 23) {
            KeyguardManager keyguardManager = (KeyguardManager) this.ah$a.getSystemService("keyguard");
            if (keyguardManager != null) {
                this.valueOf.valueOf("q9", Boolean.valueOf(keyguardManager.isDeviceSecure()));
            } else {
                this.valueOf.valueOf("q9", "KeyguardManager is null");
            }
        }
    }
}
