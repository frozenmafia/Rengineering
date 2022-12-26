package org.apache.http.pool;

import java.io.IOException;
/* loaded from: classes8.dex */
public interface ConnFactory<T, C> {
    C create(T t) throws IOException;
}
