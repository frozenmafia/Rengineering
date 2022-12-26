package o;

import com.nimbusds.jose.util.Base64;
import java.security.cert.X509Certificate;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes7.dex */
public class RawQuery {
    public static List<Base64> toString(List<Object> list) throws java.text.ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new java.text.ParseException("The X.509 certificate at position " + i + " must not be null", 0);
            } else if (!(obj instanceof String)) {
                throw new java.text.ParseException("The X.509 certificate at position " + i + " must be encoded as a Base64 string", 0);
            } else {
                linkedList.add(new Base64((String) obj));
            }
        }
        return linkedList;
    }

    public static List<X509Certificate> valueOf(List<Base64> list) throws java.text.ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                X509Certificate valueOf = associateBy.valueOf(list.get(i).decode());
                if (valueOf == null) {
                    throw new java.text.ParseException("Invalid X.509 certificate at position " + i, 0);
                }
                linkedList.add(valueOf);
            }
        }
        return linkedList;
    }
}
