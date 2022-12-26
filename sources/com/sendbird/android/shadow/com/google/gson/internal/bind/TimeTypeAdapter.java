package com.sendbird.android.shadow.com.google.gson.internal.bind;

import com.sendbird.android.shadow.com.google.gson.Gson;
import com.sendbird.android.shadow.com.google.gson.JsonSyntaxException;
import com.sendbird.android.shadow.com.google.gson.TypeAdapter;
import com.sendbird.android.shadow.com.google.gson.TypeAdapterFactory;
import com.sendbird.android.shadow.com.google.gson.reflect.TypeToken;
import com.sendbird.android.shadow.com.google.gson.stream.JsonReader;
import com.sendbird.android.shadow.com.google.gson.stream.JsonToken;
import com.sendbird.android.shadow.com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/* loaded from: classes5.dex */
public final class TimeTypeAdapter extends TypeAdapter<Time> {
    public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() { // from class: com.sendbird.android.shadow.com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.sendbird.android.shadow.com.google.gson.TypeAdapterFactory
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (typeToken.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat format = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.sendbird.android.shadow.com.google.gson.TypeAdapter
    public Time read(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Time(this.format.parse(jsonReader.nextString()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // com.sendbird.android.shadow.com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Time time) throws IOException {
        synchronized (this) {
            jsonWriter.value(time == null ? null : this.format.format((Date) time));
        }
    }
}
