package com.nimbusds.jose.shaded.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda0;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda7;
import o.lambda$endTransaction$4$androidxroomQueryInterceptorDatabase;
import o.lambda$query$8$androidxroomQueryInterceptorDatabase;
import o.lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase;
/* loaded from: classes7.dex */
public class JSONArray extends ArrayList<Object> implements List<Object>, lambda$endTransaction$4$androidxroomQueryInterceptorDatabase, lambda$query$8$androidxroomQueryInterceptorDatabase {
    private static final long serialVersionUID = 9106884089231309568L;

    public static String toJSONString(List<? extends Object> list) {
        return toJSONString(list, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    public static String toJSONString(List<? extends Object> list, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        StringBuilder sb = new StringBuilder();
        try {
            writeJSONString(list, sb, queryInterceptorDatabase$$ExternalSyntheticLambda0);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void writeJSONString(Iterable<? extends Object> iterable, Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) throws IOException {
        if (iterable == null) {
            appendable.append("null");
        } else {
            QueryInterceptorDatabase$$ExternalSyntheticLambda7.toString.toString(iterable, appendable, queryInterceptorDatabase$$ExternalSyntheticLambda0);
        }
    }

    public static void writeJSONString(List<? extends Object> list, Appendable appendable) throws IOException {
        writeJSONString(list, appendable, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    public void merge(Object obj) {
        JSONObject.merge(this, obj);
    }

    @Override // o.lambda$query$6$androidxroomQueryInterceptorDatabase
    public String toJSONString() {
        return toJSONString(this, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    @Override // o.lambda$endTransaction$4$androidxroomQueryInterceptorDatabase
    public String toJSONString(QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        return toJSONString(this, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return toJSONString();
    }

    public String toString(QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) {
        return toJSONString(queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda1
    public void writeJSONString(Appendable appendable) throws IOException {
        writeJSONString(this, appendable, lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.toString);
    }

    @Override // o.lambda$query$8$androidxroomQueryInterceptorDatabase
    public void writeJSONString(Appendable appendable, QueryInterceptorDatabase$$ExternalSyntheticLambda0 queryInterceptorDatabase$$ExternalSyntheticLambda0) throws IOException {
        writeJSONString(this, appendable, queryInterceptorDatabase$$ExternalSyntheticLambda0);
    }
}
