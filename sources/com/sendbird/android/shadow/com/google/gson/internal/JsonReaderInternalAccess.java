package com.sendbird.android.shadow.com.google.gson.internal;

import com.sendbird.android.shadow.com.google.gson.stream.JsonReader;
import java.io.IOException;
/* loaded from: classes5.dex */
public abstract class JsonReaderInternalAccess {
    public static JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
