package o;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.sendbird.android.constant.StringSet;
import java.io.IOException;
/* loaded from: classes.dex */
public class getCustomActions implements IResultReceiver<DocumentData> {
    public static final getCustomActions ah$a = new getCustomActions();
    private static final JsonReader.values ag$a = JsonReader.values.toString("t", "f", StringSet.s, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private getCustomActions() {
    }

    @Override // o.IResultReceiver
    /* renamed from: toString */
    public DocumentData ag$a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.values();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = 0.0f;
        int i = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (jsonReader.HaptikSDK$a()) {
            switch (jsonReader.valueOf(ag$a)) {
                case 0:
                    str = jsonReader.getInitSettings();
                    break;
                case 1:
                    str2 = jsonReader.getInitSettings();
                    break;
                case 2:
                    f2 = (float) jsonReader.ah$b();
                    break;
                case 3:
                    int HaptikSDK$c = jsonReader.HaptikSDK$c();
                    if (HaptikSDK$c > DocumentData.Justification.CENTER.ordinal() || HaptikSDK$c < 0) {
                        justification2 = DocumentData.Justification.CENTER;
                        break;
                    } else {
                        justification2 = DocumentData.Justification.values()[HaptikSDK$c];
                        break;
                    }
                case 4:
                    i = jsonReader.HaptikSDK$c();
                    break;
                case 5:
                    f3 = (float) jsonReader.ah$b();
                    break;
                case 6:
                    f4 = (float) jsonReader.ah$b();
                    break;
                case 7:
                    i2 = createCustomActionBuilder.ag$a(jsonReader);
                    break;
                case 8:
                    i3 = createCustomActionBuilder.ag$a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.ah$b();
                    break;
                case 10:
                    z = jsonReader.HaptikSDK$b();
                    break;
                default:
                    jsonReader.HaptikSDK$e();
                    jsonReader.getSignupData();
                    break;
            }
        }
        jsonReader.ag$a();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
