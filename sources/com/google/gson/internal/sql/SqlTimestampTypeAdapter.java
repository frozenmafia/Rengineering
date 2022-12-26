package com.google.gson.internal.sql;

import com.google.gson.Gson;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import o.StaggeredGridLayoutManager;
import o.invalidateSpanInfo;
import o.offsetFullSpansForAddition;
/* loaded from: classes5.dex */
public class SqlTimestampTypeAdapter extends StaggeredGridLayoutManager.LayoutParams<Timestamp> {
    public static final offsetFullSpansForAddition toString = new offsetFullSpansForAddition() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // o.offsetFullSpansForAddition
        public <T> StaggeredGridLayoutManager.LayoutParams<T> create(Gson gson, invalidateSpanInfo<T> invalidatespaninfo) {
            if (invalidatespaninfo.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.ag$a((Class) Date.class));
            }
            return null;
        }
    };
    private final StaggeredGridLayoutManager.LayoutParams<Date> values;

    private SqlTimestampTypeAdapter(StaggeredGridLayoutManager.LayoutParams<Date> layoutParams) {
        this.values = layoutParams;
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: toString */
    public Timestamp read(StaggeredGridLayoutManager.SavedState.AnonymousClass1 anonymousClass1) throws IOException {
        Date read = this.values.read(anonymousClass1);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // o.StaggeredGridLayoutManager.LayoutParams
    /* renamed from: ah$a */
    public void write(StaggeredGridLayoutManager.Span span, Timestamp timestamp) throws IOException {
        this.values.write(span, timestamp);
    }
}
