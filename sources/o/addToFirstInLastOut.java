package o;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.devsupport.StackTraceHelper;
import com.sendbird.android.constant.StringSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes6.dex */
public class addToFirstInLastOut {
    private static final Pattern ag$a = Pattern.compile("\\b((?:seg-\\d+(?:_\\d+)?|\\d+)\\.js)");

    public static String values(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(", stack:\n");
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString("methodName"));
            sb.append("@");
            sb.append(toString(map));
            if (map.hasKey(StackTraceHelper.LINE_NUMBER_KEY) && !map.isNull(StackTraceHelper.LINE_NUMBER_KEY) && map.getType(StackTraceHelper.LINE_NUMBER_KEY) == ReadableType.Number) {
                sb.append(map.getInt(StackTraceHelper.LINE_NUMBER_KEY));
            } else {
                sb.append(-1);
            }
            if (map.hasKey(StackTraceHelper.COLUMN_KEY) && !map.isNull(StackTraceHelper.COLUMN_KEY) && map.getType(StackTraceHelper.COLUMN_KEY) == ReadableType.Number) {
                sb.append(":");
                sb.append(map.getInt(StackTraceHelper.COLUMN_KEY));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static String toString(ReadableMap readableMap) {
        String string;
        if (!readableMap.hasKey(StringSet.file) || readableMap.isNull(StringSet.file) || readableMap.getType(StringSet.file) != ReadableType.String || (string = readableMap.getString(StringSet.file)) == null) {
            return "";
        }
        Matcher matcher = ag$a.matcher(string);
        if (matcher.find()) {
            return matcher.group(1) + ":";
        }
        return "";
    }
}
