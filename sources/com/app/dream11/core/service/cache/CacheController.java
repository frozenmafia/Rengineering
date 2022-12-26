package com.app.dream11.core.service.cache;

import com.app.dream11.dream11.DreamApplication;
import o.getUri;
/* loaded from: classes.dex */
public class CacheController {
    private final getUri valueOf = DreamApplication.valueOf().aj$a().ah$a();

    /* loaded from: classes.dex */
    public enum CACHE_ACTION {
        LEAGUE_JOIN,
        MY_ACCOUNT,
        DEPOSIT,
        WITHDRAW
    }

    public int toString(String str) {
        return this.valueOf.ag$a(str);
    }

    public void valueOf(CACHE_ACTION cache_action) {
        this.valueOf.toString("/profilelite");
    }

    public void values(String str, int i, String str2) {
        this.valueOf.valueOf(str, i, str2);
    }

    public void ag$a(String str) {
        this.valueOf.values(str);
    }

    public String ah$a() {
        return this.valueOf.valueOf();
    }
}
