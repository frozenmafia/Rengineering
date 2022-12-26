package o;

import com.nimbusds.jose.shaded.json.JSONArray;
import com.nimbusds.jose.shaded.json.JSONObject;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes7.dex */
public interface QueryInterceptorDatabase$$ExternalSyntheticLambda2 {
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda2 ag$a = new QueryInterceptorDatabase$$ExternalSyntheticLambda2() { // from class: o.QueryInterceptorDatabase$$ExternalSyntheticLambda2.3
        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
        public Map<String, Object> valueOf() {
            return new JSONObject();
        }

        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
        public List<Object> values() {
            return new JSONArray();
        }
    };
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda2 values = new QueryInterceptorDatabase$$ExternalSyntheticLambda2() { // from class: o.QueryInterceptorDatabase$$ExternalSyntheticLambda2.4
        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
        public Map<String, Object> valueOf() {
            return new LinkedHashMap();
        }

        @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda2
        public List<Object> values() {
            return new JSONArray();
        }
    };

    Map<String, Object> valueOf();

    List<Object> values();
}
