package com.app.dream11.presenter.share;

import com.app.dream11.presenter.share.PrivateContestSharePresenter;
import java.util.List;
import o.runAnimators;
/* loaded from: classes3.dex */
public final class PrivateContestSharePresenter$ag$a {
    private final List<Object> toString;
    private final PrivateContestSharePresenter.Action values;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateContestSharePresenter$ag$a) {
            PrivateContestSharePresenter$ag$a privateContestSharePresenter$ag$a = (PrivateContestSharePresenter$ag$a) obj;
            return this.values == privateContestSharePresenter$ag$a.values && runAnimators.values(this.toString, privateContestSharePresenter$ag$a.toString);
        }
        return false;
    }

    public int hashCode() {
        return (this.values.hashCode() * 31) + this.toString.hashCode();
    }

    public String toString() {
        PrivateContestSharePresenter.Action action = this.values;
        List<Object> list = this.toString;
        return "ActionObject(action=" + action + ", params=" + list + ")";
    }

    public PrivateContestSharePresenter$ag$a(PrivateContestSharePresenter.Action action, List<? extends Object> list) {
        runAnimators.ag$a(action, "action");
        runAnimators.ag$a(list, "params");
        this.values = action;
        this.toString = list;
    }

    public final PrivateContestSharePresenter.Action valueOf() {
        return this.values;
    }

    public final List<Object> values() {
        return this.toString;
    }
}
