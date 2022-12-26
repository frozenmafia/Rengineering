package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class getPosition {
    private static final JsonReader.values ag$a = JsonReader.values.toString("ch", StringSet.size, "w", TtmlNode.TAG_STYLE, "fFamily", "data");
    private static final JsonReader.values valueOf = JsonReader.values.toString("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static onMetadataUpdate valueOf(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.values();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.HaptikSDK$a()) {
            int valueOf2 = jsonReader.valueOf(ag$a);
            if (valueOf2 == 0) {
                c = jsonReader.getInitSettings().charAt(0);
            } else if (valueOf2 == 1) {
                d = jsonReader.ah$b();
            } else if (valueOf2 == 2) {
                d2 = jsonReader.ah$b();
            } else if (valueOf2 == 3) {
                str = jsonReader.getInitSettings();
            } else if (valueOf2 == 4) {
                str2 = jsonReader.getInitSettings();
            } else if (valueOf2 == 5) {
                jsonReader.values();
                while (jsonReader.HaptikSDK$a()) {
                    if (jsonReader.valueOf(valueOf) == 0) {
                        jsonReader.valueOf();
                        while (jsonReader.HaptikSDK$a()) {
                            arrayList.add((createQueueItem) getLastPositionUpdateTime.ag$a(jsonReader, ensureclassloader));
                        }
                        jsonReader.ah$a();
                    } else {
                        jsonReader.HaptikSDK$e();
                        jsonReader.getSignupData();
                    }
                }
                jsonReader.ag$a();
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        jsonReader.ag$a();
        return new onMetadataUpdate(arrayList, c, d, d2, str, str2);
    }
}
