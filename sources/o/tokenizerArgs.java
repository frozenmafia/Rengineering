package o;

import android.os.Build;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
/* loaded from: classes5.dex */
class tokenizerArgs {
    private final unique values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tokenizerArgs(unique uniqueVar) {
        this.values = uniqueVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void ag$a() {
        try {
            this.values.valueOf("h5", Build.BOARD);
            this.values.valueOf("h6", Build.BOOTLOADER);
            this.values.valueOf("h7", Build.BRAND);
            this.values.valueOf("h8", Build.DEVICE);
            this.values.valueOf("h9", Build.DISPLAY);
            this.values.valueOf("i1", Build.HARDWARE);
            this.values.valueOf("i2", Build.HOST);
            this.values.valueOf("i3", Build.ID);
            this.values.valueOf("i4", Build.MANUFACTURER);
            this.values.valueOf("i5", Build.MODEL);
            this.values.valueOf("i6", Build.PRODUCT);
            this.values.valueOf("i7", Build.getRadioVersion());
            this.values.valueOf("i9", Build.TYPE);
            this.values.valueOf("j1", Build.TAGS);
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    this.values.valueOf("j2", new JSONArray(Build.SUPPORTED_ABIS));
                } catch (Exception e) {
                    IMultiInstanceInvalidationService.Default.toString("Exception in collectBuildAttributes ", e);
                    this.values.ag$a("j2", e.toString());
                }
            }
            this.values.valueOf("j3", Long.valueOf(Build.TIME));
            this.values.valueOf("j4", Integer.valueOf(Build.VERSION.SDK_INT));
            this.values.valueOf("j5", Build.VERSION.CODENAME);
        } catch (Exception e2) {
            this.values.ag$a("build", e2.toString());
        }
    }
}
