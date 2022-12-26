package androidx.work;

import androidx.exifinterface.media.ExifInterface;
import androidx.work.Data;
import com.sendbird.android.constant.StringSet;
import kotlin.Pair;
import o.runAnimators;
/* loaded from: classes6.dex */
public final class DataKt {
    public static final Data workDataOf(Pair<String, ? extends Object>... pairArr) {
        runAnimators.ag$a(pairArr, "pairs");
        Data.Builder builder = new Data.Builder();
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<String, ? extends Object> pair = pairArr[i];
            i++;
            builder.put(pair.getFirst(), pair.getSecond());
        }
        Data build = builder.build();
        runAnimators.ah$a(build, "dataBuilder.build()");
        return build;
    }

    public static final /* synthetic */ <T> boolean hasKeyWithValueOfType(Data data, String str) {
        runAnimators.ag$a(data, "<this>");
        runAnimators.ag$a(str, StringSet.key);
        runAnimators.values(4, ExifInterface.GPS_DIRECTION_TRUE);
        return data.hasKeyWithValueOfType(str, Object.class);
    }
}
