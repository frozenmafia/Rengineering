package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public final class SqlDateTypeAdapter extends StaggeredGridLayoutManager.LayoutParams<Date> {
    public static final offsetFullSpansForAddition valueOf = new offsetFullSpansForAddition() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // o.offsetFullSpansForAddition
        public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
            if (invalidatespaninfo.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };
    private final DateFormat toString;

    private SqlDateTypeAdapter() {
        this.toString = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: valueOf */
    public Date read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        synchronized (this) {
            if (anonymousClass1.aj$a() == JsonToken.NULL) {
                anonymousClass1.HaptikSDK$e();
                return null;
            }
            try {
                return new Date(this.toString.parse(anonymousClass1.HaptikSDK$d()).getTime());
            } catch (ParseException e) {
                throw new JsonSyntaxException(e);
            }
        }
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: ag$a */
    public void write(StaggeredGridLayoutManager.Span span, Date date) throws IOException {
        synchronized (this) {
            span.values(date == null ? null : this.toString.format((java.util.Date) date));
        }
    }
}
