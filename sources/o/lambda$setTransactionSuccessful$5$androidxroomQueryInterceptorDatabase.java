package o;

import com.nimbusds.jose.shaded.json.parser.FakeContainerFactory;
import java.io.IOException;
/* renamed from: o.lambda$setTransactionSuccessful$5$androidx-room-QueryInterceptorDatabase  reason: invalid class name */
/* loaded from: classes7.dex */
public class lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase {
    public static QueryInterceptorDatabase$$ExternalSyntheticLambda0 toString = QueryInterceptorDatabase$$ExternalSyntheticLambda0.ah$a;
    private static final FakeContainerFactory values = new FakeContainerFactory();
    public static QueryInterceptorDatabase$$ExternalSyntheticLambda7 ag$a = new QueryInterceptorDatabase$$ExternalSyntheticLambda7();

    public static void valueOf(Object obj, Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) throws IOException {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        QueryInterceptorDatabase$$ExternalSyntheticLambda5<Object> values2 = ag$a.values(cls);
        if (values2 == null) {
            if (cls.isArray()) {
                values2 = QueryInterceptorDatabase$$ExternalSyntheticLambda7.HaptikSDK$c;
            } else {
                values2 = ag$a.valueOf(obj.getClass());
                if (values2 == null) {
                    values2 = QueryInterceptorDatabase$$ExternalSyntheticLambda7.ah$b;
                }
            }
            ag$a.ah$a(values2, cls);
        }
        values2.toString(obj, appendable, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    public static String valueOf(String str) {
        return toString(str, toString);
    }

    public static String toString(String str, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        queryInterceptorDatabase$$ExternalSyntheticLambda0.ah$a(str, sb);
        return sb.toString();
    }

    public static void ag$a(String str, Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        if (str == null) {
            return;
        }
        queryInterceptorDatabase$$ExternalSyntheticLambda0.ah$a(str, appendable);
    }
}
