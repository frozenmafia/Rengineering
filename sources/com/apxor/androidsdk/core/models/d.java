package com.apxor.androidsdk.core.models;

import com.apxor.androidsdk.core.Attributes;
import com.apxor.androidsdk.core.Constants;
import java.util.HashMap;
/* loaded from: classes6.dex */
public class d extends a {
    @Deprecated
    public d(String str, String str2, HashMap<String, String> hashMap) {
        super(str, str2, hashMap);
    }

    @Override // com.apxor.androidsdk.core.models.a, com.apxor.androidsdk.core.models.BaseApxorEvent
    public String getEventType() {
        return Constants.META_APP_EVENT;
    }

    public d(String str, String str2, Attributes attributes) {
        super(str, str2, attributes);
    }
}
