package com.sendbird.android.shadow.com.google.gson;

import com.sendbird.android.shadow.com.google.gson.reflect.TypeToken;
/* loaded from: classes5.dex */
public interface TypeAdapterFactory {
    <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken);
}
