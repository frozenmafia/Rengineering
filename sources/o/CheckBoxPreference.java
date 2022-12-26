package o;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import o.onBindViewHolder;
/* loaded from: classes7.dex */
final class CheckBoxPreference extends onBindViewHolder {
    private final long HaptikSDK$b;
    private final ClientInfo ag$a;
    private final Integer ah$a;
    private final long invoke;
    private final List<getDialogLayoutResource> toString;
    private final QosTier valueOf;
    private final String values;

    /* loaded from: classes7.dex */
    public abstract class Listener {
        public abstract long ag$a();

        static Listener toString(long j) {
            return new syncViewIfAccessibilityEnabled(j);
        }

        public static Listener ag$a(Reader reader) throws IOException {
            JsonReader jsonReader = new JsonReader(reader);
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                        if (jsonReader.peek() == JsonToken.STRING) {
                            return toString(Long.parseLong(jsonReader.nextString()));
                        }
                        return toString(jsonReader.nextLong());
                    }
                    jsonReader.skipValue();
                }
                throw new IOException("Response is missing nextRequestWaitMillis field.");
            } finally {
                jsonReader.close();
            }
        }
    }

    private CheckBoxPreference(long j, long j2, ClientInfo clientInfo, Integer num, String str, List<getDialogLayoutResource> list, QosTier qosTier) {
        this.HaptikSDK$b = j;
        this.invoke = j2;
        this.ag$a = clientInfo;
        this.ah$a = num;
        this.values = str;
        this.toString = list;
        this.valueOf = qosTier;
    }

    @Override // o.onBindViewHolder
    public long invoke() {
        return this.HaptikSDK$b;
    }

    @Override // o.onBindViewHolder
    public long HaptikSDK$c() {
        return this.invoke;
    }

    @Override // o.onBindViewHolder
    public ClientInfo valueOf() {
        return this.ag$a;
    }

    @Override // o.onBindViewHolder
    public Integer ag$a() {
        return this.ah$a;
    }

    @Override // o.onBindViewHolder
    public String ah$a() {
        return this.values;
    }

    @Override // o.onBindViewHolder
    public List<getDialogLayoutResource> values() {
        return this.toString;
    }

    @Override // o.onBindViewHolder
    public QosTier HaptikSDK$a() {
        return this.valueOf;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.HaptikSDK$b + ", requestUptimeMs=" + this.invoke + ", clientInfo=" + this.ag$a + ", logSource=" + this.ah$a + ", logSourceName=" + this.values + ", logEvents=" + this.toString + ", qosTier=" + this.valueOf + "}";
    }

    public boolean equals(Object obj) {
        ClientInfo clientInfo;
        Integer num;
        String str;
        List<getDialogLayoutResource> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof onBindViewHolder) {
            onBindViewHolder onbindviewholder = (onBindViewHolder) obj;
            if (this.HaptikSDK$b == onbindviewholder.invoke() && this.invoke == onbindviewholder.HaptikSDK$c() && ((clientInfo = this.ag$a) != null ? clientInfo.equals(onbindviewholder.valueOf()) : onbindviewholder.valueOf() == null) && ((num = this.ah$a) != null ? num.equals(onbindviewholder.ag$a()) : onbindviewholder.ag$a() == null) && ((str = this.values) != null ? str.equals(onbindviewholder.ah$a()) : onbindviewholder.ah$a() == null) && ((list = this.toString) != null ? list.equals(onbindviewholder.values()) : onbindviewholder.values() == null)) {
                QosTier qosTier = this.valueOf;
                if (qosTier == null) {
                    if (onbindviewholder.HaptikSDK$a() == null) {
                        return true;
                    }
                } else if (qosTier.equals(onbindviewholder.HaptikSDK$a())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j = this.HaptikSDK$b;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.invoke;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        ClientInfo clientInfo = this.ag$a;
        int hashCode = clientInfo == null ? 0 : clientInfo.hashCode();
        Integer num = this.ah$a;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.values;
        int hashCode3 = str == null ? 0 : str.hashCode();
        List<getDialogLayoutResource> list = this.toString;
        int hashCode4 = list == null ? 0 : list.hashCode();
        QosTier qosTier = this.valueOf;
        return ((((((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (qosTier != null ? qosTier.hashCode() : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class valueOf extends onBindViewHolder.toString {
        private Long HaptikSDK$a;
        private Long HaptikSDK$c;
        private ClientInfo ag$a;
        private List<getDialogLayoutResource> ah$a;
        private QosTier toString;
        private String valueOf;
        private Integer values;

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder.toString valueOf(long j) {
            this.HaptikSDK$c = Long.valueOf(j);
            return this;
        }

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder.toString values(long j) {
            this.HaptikSDK$a = Long.valueOf(j);
            return this;
        }

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder.toString values(ClientInfo clientInfo) {
            this.ag$a = clientInfo;
            return this;
        }

        @Override // o.onBindViewHolder.toString
        onBindViewHolder.toString valueOf(Integer num) {
            this.values = num;
            return this;
        }

        @Override // o.onBindViewHolder.toString
        onBindViewHolder.toString values(String str) {
            this.valueOf = str;
            return this;
        }

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder.toString toString(List<getDialogLayoutResource> list) {
            this.ah$a = list;
            return this;
        }

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder.toString ah$a(QosTier qosTier) {
            this.toString = qosTier;
            return this;
        }

        @Override // o.onBindViewHolder.toString
        public onBindViewHolder valueOf() {
            String str = "";
            if (this.HaptikSDK$c == null) {
                str = " requestTimeMs";
            }
            if (this.HaptikSDK$a == null) {
                str = str + " requestUptimeMs";
            }
            if (!str.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + str);
            }
            return new CheckBoxPreference(this.HaptikSDK$c.longValue(), this.HaptikSDK$a.longValue(), this.ag$a, this.values, this.valueOf, this.ah$a, this.toString);
        }
    }
}
