package o;

import com.app.dream11.core.service.graphql.api.ContestShareQuery;
import o.CoordinatorLayout;
/* loaded from: classes3.dex */
public final class getChildRect {
    private final String HaptikSDK$a;
    private final Integer HaptikSDK$b;
    private final Boolean HaptikSDK$c;
    private final String ag$a;
    private CoordinatorLayout.AnonymousClass1.valueOf ah$a;
    private String ah$b;
    private final String invoke;
    private final CoordinatorLayout.AnonymousClass1.values toString;
    private final ContestShareQuery.Data valueOf;
    private int values;

    public getChildRect(String str, ContestShareQuery.Data data, CoordinatorLayout.AnonymousClass1.valueOf valueof, CoordinatorLayout.AnonymousClass1.values valuesVar, Integer num, String str2, Boolean bool, String str3) {
        setAnimationMatrix setanimationmatrix;
        runAnimators.ag$a(data, "contestCard");
        runAnimators.ag$a(valueof, "buttonState");
        runAnimators.ag$a(valuesVar, "callBack");
        this.invoke = str;
        this.valueOf = data;
        this.ah$a = valueof;
        this.toString = valuesVar;
        this.HaptikSDK$b = num;
        this.ag$a = str2;
        this.HaptikSDK$c = bool;
        this.HaptikSDK$a = str3;
        this.ah$b = "";
        if (str2 == null) {
            setanimationmatrix = null;
        } else {
            toString(ag$a());
            ah$a(0);
            setanimationmatrix = setAnimationMatrix.ag$a;
        }
        if (setanimationmatrix == null) {
            String ah$b = ah$b();
            toString(ah$b != null ? ah$b : "");
            ah$a(1);
        }
    }

    public /* synthetic */ getChildRect(String str, ContestShareQuery.Data data, CoordinatorLayout.AnonymousClass1.valueOf valueof, CoordinatorLayout.AnonymousClass1.values valuesVar, Integer num, String str2, Boolean bool, String str3, int i, getTargetTypes gettargettypes) {
        this((i & 1) != 0 ? null : str, data, valueof, valuesVar, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : bool, (i & 128) != 0 ? null : str3);
    }

    public final String HaptikSDK$a() {
        return this.invoke;
    }

    public final ContestShareQuery.Data ah$a() {
        return this.valueOf;
    }

    public final void ag$a(CoordinatorLayout.AnonymousClass1.valueOf valueof) {
        runAnimators.ag$a(valueof, "<set-?>");
        this.ah$a = valueof;
    }

    public final CoordinatorLayout.AnonymousClass1.valueOf valueOf() {
        return this.ah$a;
    }

    public final CoordinatorLayout.AnonymousClass1.values values() {
        return this.toString;
    }

    public final Integer HaptikSDK$b() {
        return this.HaptikSDK$b;
    }

    public final Boolean HaptikSDK$e() {
        return this.HaptikSDK$c;
    }

    public final String ag$a() {
        return this.ag$a;
    }

    public final String ah$b() {
        return this.HaptikSDK$a;
    }

    public final String HaptikSDK$c() {
        return this.ah$b;
    }

    public final void toString(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$b = str;
    }

    public final void ah$a(int i) {
        this.values = i;
    }

    public final int invoke() {
        return this.values;
    }
}
