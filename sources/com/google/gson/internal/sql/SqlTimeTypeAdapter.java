package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class SqlTimeTypeAdapter extends StaggeredGridLayoutManager.LayoutParams<Time> {
    public static final offsetFullSpansForAddition values = new offsetFullSpansForAddition() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // o.offsetFullSpansForAddition
        public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
            if (invalidatespaninfo.getRawType() == Time.class) {
                return new SqlTimeTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat toString;

    private SqlTimeTypeAdapter() {
        this.toString = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: ah$a */
    public Time read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        synchronized (this) {
            if (anonymousClass1.aj$a() == JsonToken.NULL) {
                anonymousClass1.HaptikSDK$e();
                return null;
            }
            try {
                return new Time(this.toString.parse(anonymousClass1.HaptikSDK$d()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: toString */
    public void write(StaggeredGridLayoutManager.Span span, Time time) throws IOException {
        synchronized (this) {
            span.values(time == null ? null : this.toString.format((Date) time));
        }
    }
}
