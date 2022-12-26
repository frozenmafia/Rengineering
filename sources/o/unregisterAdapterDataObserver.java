package o;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class unregisterAdapterDataObserver {
    private final List<String> toString = new ArrayList();
    private int values;

    private unregisterAdapterDataObserver(bindViewHolder bindviewholder) throws DatabaseException {
        this.values = 0;
        Iterator<detachViewAt> it = bindviewholder.iterator();
        while (it.hasNext()) {
            this.toString.add(it.next().valueOf());
        }
        this.values = Math.max(1, this.toString.size());
        for (int i = 0; i < this.toString.size(); i++) {
            this.values += ag$a((CharSequence) this.toString.get(i));
        }
        ah$a();
    }

    public static void values(bindViewHolder bindviewholder, Object obj) throws DatabaseException {
        new unregisterAdapterDataObserver(bindviewholder).ah$a(obj);
    }

    private void ah$a(Object obj) throws DatabaseException {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    ag$a(str);
                    ah$a(map.get(str));
                    values();
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                ag$a(Integer.toString(i));
                ah$a(list.get(i));
                values();
            }
        }
    }

    private void ag$a(String str) throws DatabaseException {
        if (this.toString.size() > 0) {
            this.values++;
        }
        this.toString.add(str);
        this.values += ag$a((CharSequence) str);
        ah$a();
    }

    private String values() {
        List<String> list;
        String remove = this.toString.remove(list.size() - 1);
        this.values -= ag$a((CharSequence) remove);
        if (this.toString.size() > 0) {
            this.values--;
        }
        return remove;
    }

    private void ah$a() throws DatabaseException {
        if (this.values > 768) {
            throw new DatabaseException("Data has a key path longer than 768 bytes (" + this.values + ").");
        } else if (this.toString.size() <= 32) {
        } else {
            throw new DatabaseException("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle " + valueOf());
        }
    }

    private String valueOf() {
        if (this.toString.size() == 0) {
            return "";
        }
        return "in path '" + values("/", this.toString) + "'";
    }

    private static String values(String str, List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(str);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    private static int ag$a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }
}
