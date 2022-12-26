package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class getBufferedPosition {
    private static final JsonReader.values values = JsonReader.values.toString("ef");
    private static final JsonReader.values toString = JsonReader.values.toString("ty", "v");

    getBufferedPosition() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onVolumeChanged valueOf(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
        onVolumeChanged onvolumechanged = null;
        while (jsonReader.HaptikSDK$a()) {
            if (jsonReader.valueOf(values) == 0) {
                jsonReader.valueOf();
                while (jsonReader.HaptikSDK$a()) {
                    onVolumeChanged ag$a = ag$a(jsonReader, ensureclassloader);
                    if (ag$a != null) {
                        onvolumechanged = ag$a;
                    }
                }
                jsonReader.ah$a();
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        return onvolumechanged;
    }

    private static onVolumeChanged ag$a(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
        sendExtras valueOf;
        jsonReader.values();
        onVolumeChanged onvolumechanged = null;
        while (true) {
            boolean z = false;
            while (jsonReader.HaptikSDK$a()) {
                int valueOf2 = jsonReader.valueOf(toString);
                if (valueOf2 != 0) {
                    if (valueOf2 != 1) {
                        jsonReader.HaptikSDK$e();
                        jsonReader.getSignupData();
                    } else if (z) {
                        valueOf = getCurrentPosition.valueOf(jsonReader, ensureclassloader, true);
                        onvolumechanged = new onVolumeChanged(valueOf);
                    } else {
                        jsonReader.getSignupData();
                    }
                } else if (jsonReader.HaptikSDK$c() == 0) {
                    z = true;
                }
            }
            jsonReader.ag$a();
            return onvolumechanged;
        }
    }
}
