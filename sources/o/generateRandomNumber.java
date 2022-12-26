package o;

import com.apollographql.apollo.api.ResponseField;
import java.util.Map;
/* loaded from: classes.dex */
public final class generateRandomNumber implements isEnabled<Map<String, Object>> {
    @Override // o.isEnabled
    /* renamed from: valueOf */
    public <T> T toString(Map<String, Object> map, ResponseField responseField) {
        return (T) map.get(responseField.HaptikSDK$b());
    }
}
