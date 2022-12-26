package o;

import com.app.dream11.model.FeatureAccountBalanceModel;
import com.app.dream11.model.MatchCentreBean;
@Deprecated
/* loaded from: classes.dex */
public class updateChildrenFromSolver {
    static updateChildrenFromSolver valueOf;
    private int ag$a;
    private MatchCentreBean ah$a = new MatchCentreBean();
    private FeatureAccountBalanceModel values;

    private updateChildrenFromSolver() {
    }

    public static updateChildrenFromSolver ah$a() {
        updateChildrenFromSolver updatechildrenfromsolver;
        synchronized (updateChildrenFromSolver.class) {
            if (valueOf == null) {
                valueOf = new updateChildrenFromSolver();
            }
            updatechildrenfromsolver = valueOf;
        }
        return updatechildrenfromsolver;
    }

    public MatchCentreBean ag$a() {
        return this.ah$a;
    }

    public void values(MatchCentreBean matchCentreBean) {
        this.ah$a = matchCentreBean;
    }

    public int values() {
        return this.ag$a;
    }

    public void ah$a(FeatureAccountBalanceModel featureAccountBalanceModel) {
        this.values = featureAccountBalanceModel;
    }
}
