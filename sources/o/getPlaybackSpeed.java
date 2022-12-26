package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* loaded from: classes.dex */
public class getPlaybackSpeed {
    private sendExtras HaptikSDK$b;
    private sendExtras HaptikSDK$c;
    private sendExtras ah$a;
    private sendQueueTitle toString;
    private sendExtras valueOf;
    private static final JsonReader.values values = JsonReader.values.toString("ef");
    private static final JsonReader.values ag$a = JsonReader.values.toString("nm", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public getErrorCode values(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
        sendExtras sendextras;
        sendExtras sendextras2;
        sendExtras sendextras3;
        sendExtras sendextras4;
        while (jsonReader.HaptikSDK$a()) {
            if (jsonReader.valueOf(values) == 0) {
                jsonReader.valueOf();
                while (jsonReader.HaptikSDK$a()) {
                    ag$a(jsonReader, ensureclassloader);
                }
                jsonReader.ah$a();
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        sendQueueTitle sendqueuetitle = this.toString;
        if (sendqueuetitle == null || (sendextras = this.HaptikSDK$b) == null || (sendextras2 = this.ah$a) == null || (sendextras3 = this.valueOf) == null || (sendextras4 = this.HaptikSDK$c) == null) {
            return null;
        }
        return new getErrorCode(sendqueuetitle, sendextras, sendextras2, sendextras3, sendextras4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void ag$a(JsonReader jsonReader, ensureClassLoader ensureclassloader) throws IOException {
        char c;
        sendExtras valueOf;
        sendExtras valueOf2;
        jsonReader.values();
        String str = "";
        while (jsonReader.HaptikSDK$a()) {
            int valueOf3 = jsonReader.valueOf(ag$a);
            if (valueOf3 == 0) {
                str = jsonReader.getInitSettings();
            } else if (valueOf3 == 1) {
                str.hashCode();
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    valueOf2 = getCurrentPosition.valueOf(jsonReader, ensureclassloader, true);
                    this.valueOf = valueOf2;
                } else if (c == 1) {
                    this.HaptikSDK$b = getCurrentPosition.valueOf(jsonReader, ensureclassloader, false);
                } else if (c == 2) {
                    this.ah$a = getCurrentPosition.valueOf(jsonReader, ensureclassloader, false);
                } else if (c == 3) {
                    this.toString = getCurrentPosition.values(jsonReader, ensureclassloader);
                } else if (c == 4) {
                    valueOf = getCurrentPosition.valueOf(jsonReader, ensureclassloader, true);
                    this.HaptikSDK$c = valueOf;
                } else {
                    jsonReader.getSignupData();
                }
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        jsonReader.ag$a();
    }
}
