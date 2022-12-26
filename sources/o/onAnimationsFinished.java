package o;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class onAnimationsFinished<T> {
    public Map<detachViewAt, onAnimationsFinished<T>> valueOf = new HashMap();
    public T values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toString(String str) {
        String str2 = str + "<value>: " + this.values + "\n";
        if (this.valueOf.isEmpty()) {
            return str2 + str + "<empty>";
        }
        for (Map.Entry<detachViewAt, onAnimationsFinished<T>> entry : this.valueOf.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(entry.getKey());
            sb.append(":\n");
            sb.append(entry.getValue().toString(str + "\t"));
            sb.append("\n");
            str2 = sb.toString();
        }
        return str2;
    }
}
