package o;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.viewModels;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class getIcon {
    static JsonReader.values ag$a = JsonReader.values.toString("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<viewModels.Cdefault<T>> ag$a(JsonReader jsonReader, ensureClassLoader ensureclassloader, float f, IResultReceiver<T> iResultReceiver, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.HaptikWebView() == JsonReader.Token.STRING) {
            ensureclassloader.toString("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.values();
        while (jsonReader.HaptikSDK$a()) {
            if (jsonReader.valueOf(ag$a) == 0) {
                if (jsonReader.HaptikWebView() == JsonReader.Token.BEGIN_ARRAY) {
                    jsonReader.valueOf();
                    if (jsonReader.HaptikWebView() == JsonReader.Token.NUMBER) {
                        arrayList.add(getName.valueOf(jsonReader, ensureclassloader, f, iResultReceiver, false, z));
                    } else {
                        while (jsonReader.HaptikSDK$a()) {
                            arrayList.add(getName.valueOf(jsonReader, ensureclassloader, f, iResultReceiver, true, z));
                        }
                    }
                    jsonReader.ah$a();
                } else {
                    arrayList.add(getName.valueOf(jsonReader, ensureclassloader, f, iResultReceiver, false, z));
                }
            } else {
                jsonReader.getSignupData();
            }
        }
        jsonReader.ag$a();
        ag$a(arrayList);
        return arrayList;
    }

    public static <T> void ag$a(List<? extends viewModels.Cdefault<T>> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            viewModels.Cdefault<T> cdefault = list.get(i2);
            i2++;
            viewModels.Cdefault<T> cdefault2 = list.get(i2);
            cdefault.valueOf = Float.valueOf(cdefault2.HaptikSDK$c);
            if (cdefault.values == null && cdefault2.HaptikSDK$a != null) {
                cdefault.values = cdefault2.HaptikSDK$a;
                if (cdefault instanceof getRccTransportControlFlagsFromActions) {
                    ((getRccTransportControlFlagsFromActions) cdefault).ag$a();
                }
            }
        }
        viewModels.Cdefault<T> cdefault3 = list.get(i);
        if ((cdefault3.HaptikSDK$a == null || cdefault3.values == null) && list.size() > 1) {
            list.remove(cdefault3);
        }
    }
}
