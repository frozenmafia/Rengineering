package com.google.firebase.database.core.operation;

import com.google.firebase.database.core.view.QueryParams;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class OperationSource {
    public static final OperationSource ag$a = new OperationSource(Source.User, null, false);
    public static final OperationSource toString = new OperationSource(Source.Server, null, false);
    private final Source ah$a;
    private final QueryParams valueOf;
    private final boolean values;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum Source {
        User,
        Server
    }

    public static OperationSource toString(QueryParams queryParams) {
        return new OperationSource(Source.Server, queryParams, true);
    }

    public OperationSource(Source source, QueryParams queryParams, boolean z) {
        this.ah$a = source;
        this.valueOf = queryParams;
        this.values = z;
        RecyclerView.ItemAnimator.AdapterChanges.ah$a(!z || ag$a());
    }

    public boolean values() {
        return this.ah$a == Source.User;
    }

    public boolean ag$a() {
        return this.ah$a == Source.Server;
    }

    public boolean ah$a() {
        return this.values;
    }

    public String toString() {
        return "OperationSource{source=" + this.ah$a + ", queryParams=" + this.valueOf + ", tagged=" + this.values + '}';
    }

    public QueryParams valueOf() {
        return this.valueOf;
    }
}
