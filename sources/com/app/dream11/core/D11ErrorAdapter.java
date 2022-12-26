package com.app.dream11.core;

import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
/* loaded from: classes6.dex */
public class D11ErrorAdapter extends BaseAdapter {
    private State ag$a;
    private BaseAdapter ah$a;
    private int toString;

    /* loaded from: classes6.dex */
    enum State {
        NO_STATE,
        ERROR_STATE,
        HIDE_VIEW,
        SUCCESS
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        if (this.ag$a == State.SUCCESS) {
            return this.ah$a.valueOf(i);
        }
        if (this.ag$a == State.ERROR_STATE) {
            return this.toString;
        }
        return this.toString;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        if (this.ag$a == State.SUCCESS) {
            this.ah$a.values(baseAdapter$ag$a, i);
        }
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        if (this.ag$a == State.SUCCESS) {
            return this.ah$a.values();
        }
        return this.ag$a == State.ERROR_STATE ? 1 : 0;
    }
}
