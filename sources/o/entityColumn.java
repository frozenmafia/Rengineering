package o;

import com.nimbusds.jose.Header;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import java.util.Collections;
import java.util.Set;
/* loaded from: classes7.dex */
public class entityColumn {
    private Set<String> ag$a = Collections.emptySet();

    public Set<String> valueOf() {
        return Collections.singleton("b64");
    }

    public Set<String> values() {
        return Collections.unmodifiableSet(this.ag$a);
    }

    public void values(Set<String> set) {
        if (set == null) {
            this.ag$a = Collections.emptySet();
        } else {
            this.ag$a = set;
        }
    }

    public boolean ag$a(Header header) {
        if (header.getCriticalParams() == null) {
            return true;
        }
        for (String str : header.getCriticalParams()) {
            if (!valueOf().contains(str) && !values().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void ah$a(JWEHeader jWEHeader) throws JOSEException {
        if (!ag$a(jWEHeader)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }
}
