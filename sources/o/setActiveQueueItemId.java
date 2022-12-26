package o;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setActiveQueueItemId {
    private static final JsonReader.values toString = JsonReader.values.toString("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MergePaths toString(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.HaptikSDK$a()) {
            int valueOf = jsonReader.valueOf(toString);
            if (valueOf == 0) {
                str = jsonReader.getInitSettings();
            } else if (valueOf == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.HaptikSDK$c());
            } else if (valueOf == 2) {
                z = jsonReader.HaptikSDK$b();
            } else {
                jsonReader.HaptikSDK$e();
                jsonReader.getSignupData();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
