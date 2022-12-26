package o;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import java.util.List;
import o.CheckBoxPreference;
/* loaded from: classes7.dex */
public abstract class onBindViewHolder {
    public abstract QosTier HaptikSDK$a();

    public abstract long HaptikSDK$c();

    public abstract Integer ag$a();

    public abstract String ah$a();

    public abstract long invoke();

    public abstract ClientInfo valueOf();

    public abstract List<getDialogLayoutResource> values();

    public static toString HaptikSDK$b() {
        return new CheckBoxPreference.valueOf();
    }

    /* loaded from: classes7.dex */
    public static abstract class toString {
        public abstract toString ah$a(QosTier qosTier);

        public abstract toString toString(List<getDialogLayoutResource> list);

        public abstract toString valueOf(long j);

        abstract toString valueOf(Integer num);

        public abstract onBindViewHolder valueOf();

        public abstract toString values(long j);

        public abstract toString values(ClientInfo clientInfo);

        abstract toString values(String str);

        public toString toString(int i) {
            return valueOf(Integer.valueOf(i));
        }

        public toString ah$a(String str) {
            return values(str);
        }
    }
}
