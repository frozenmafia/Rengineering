package o;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class initLayout {
    private static final initLayout ag$a = new toString().ag$a();
    private final String valueOf;
    private final List<LogEventDropped> values;

    initLayout(String str, List<LogEventDropped> list) {
        this.valueOf = str;
        this.values = list;
    }

    public static toString ag$a() {
        return new toString();
    }

    public String ah$a() {
        return this.valueOf;
    }

    public List<LogEventDropped> valueOf() {
        return this.values;
    }

    /* loaded from: classes7.dex */
    public static final class toString {
        private String ag$a = "";
        private List<LogEventDropped> valueOf = new ArrayList();

        toString() {
        }

        public initLayout ag$a() {
            return new initLayout(this.ag$a, Collections.unmodifiableList(this.valueOf));
        }

        public toString ah$a(String str) {
            this.ag$a = str;
            return this;
        }

        public toString toString(List<LogEventDropped> list) {
            this.valueOf = list;
            return this;
        }
    }
}
