package com.sendbird.android.shadow.okhttp3.internal.connection;

import com.sendbird.android.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;
/* loaded from: classes5.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public void failed(Route route) {
        synchronized (this) {
            this.failedRoutes.add(route);
        }
    }

    public void connected(Route route) {
        synchronized (this) {
            this.failedRoutes.remove(route);
        }
    }

    public boolean shouldPostpone(Route route) {
        boolean contains;
        synchronized (this) {
            contains = this.failedRoutes.contains(route);
        }
        return contains;
    }
}
