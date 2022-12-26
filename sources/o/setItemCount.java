package o;

import android.os.Bundle;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class setItemCount {
    public static String valueOf(Bundle bundle) {
        return bundle != null ? bundle.getString("wzrk_acct_id", "") : "";
    }

    public static ArrayList<String> valueOf() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (PushConstants.PushType pushType : PushConstants.PushType.values()) {
            arrayList.add(pushType.name());
        }
        return arrayList;
    }

    public static PushConstants.PushType[] ah$a(ArrayList<String> arrayList) {
        PushConstants.PushType[] pushTypeArr = new PushConstants.PushType[0];
        if (arrayList != null && !arrayList.isEmpty()) {
            pushTypeArr = new PushConstants.PushType[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                pushTypeArr[i] = PushConstants.PushType.valueOf(arrayList.get(i));
            }
        }
        return pushTypeArr;
    }
}
