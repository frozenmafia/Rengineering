package o;

import java.util.Arrays;
import org.apache.http.client.methods.HttpDelete;
/* loaded from: classes7.dex */
public abstract class getColorMode {
    static final java.util.logging.Logger ah$a = java.util.logging.Logger.getLogger(getColorMode.class.getName());
    private static final String[] valueOf;

    static {
        String[] strArr = {HttpDelete.METHOD_NAME, "GET", "POST", "PUT"};
        valueOf = strArr;
        Arrays.sort(strArr);
    }
}
