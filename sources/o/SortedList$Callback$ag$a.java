package o;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import o.SortedList;
/* loaded from: classes5.dex */
public final class SortedList$Callback$ag$a extends GeneratedMessageLite.values<SortedList.Callback, SortedList$Callback$ag$a> implements SortedList.BatchedCallback {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ SortedList$Callback$ag$a(SortedList.Callback.AnonymousClass5 anonymousClass5) {
        this();
    }

    private SortedList$Callback$ag$a() {
        super(SortedList.Callback.valueOf());
    }

    public SortedList$Callback$ag$a toString(String str) {
        HaptikSDK$e();
        SortedList.Callback.values((SortedList.Callback) this.ag$a, str);
        return this;
    }

    public SortedList$Callback$ag$a ag$a(long j) {
        HaptikSDK$e();
        SortedList.Callback.values((SortedList.Callback) this.ag$a, j);
        return this;
    }

    public SortedList$Callback$ag$a ah$a(long j) {
        HaptikSDK$e();
        SortedList.Callback.valueOf((SortedList.Callback) this.ag$a, j);
        return this;
    }

    public SortedList$Callback$ag$a values(String str, long j) {
        str.getClass();
        HaptikSDK$e();
        SortedList.Callback.valueOf((SortedList.Callback) this.ag$a).put(str, Long.valueOf(j));
        return this;
    }

    public SortedList$Callback$ag$a valueOf(Map<String, Long> map) {
        HaptikSDK$e();
        SortedList.Callback.valueOf((SortedList.Callback) this.ag$a).putAll(map);
        return this;
    }

    public SortedList$Callback$ag$a ag$a(SortedList.Callback callback) {
        HaptikSDK$e();
        SortedList.Callback.ag$a((SortedList.Callback) this.ag$a, callback);
        return this;
    }

    public SortedList$Callback$ag$a values(Iterable<? extends SortedList.Callback> iterable) {
        HaptikSDK$e();
        SortedList.Callback.toString((SortedList.Callback) this.ag$a, iterable);
        return this;
    }

    public SortedList$Callback$ag$a ah$a(Map<String, String> map) {
        HaptikSDK$e();
        SortedList.Callback.toString((SortedList.Callback) this.ag$a).putAll(map);
        return this;
    }

    public SortedList$Callback$ag$a ag$a(throwIfInMutationOperation throwifinmutationoperation) {
        HaptikSDK$e();
        SortedList.Callback.valueOf((SortedList.Callback) this.ag$a, throwifinmutationoperation);
        return this;
    }

    public SortedList$Callback$ag$a ag$a(Iterable<? extends throwIfInMutationOperation> iterable) {
        HaptikSDK$e();
        SortedList.Callback.ag$a((SortedList.Callback) this.ag$a, iterable);
        return this;
    }
}
