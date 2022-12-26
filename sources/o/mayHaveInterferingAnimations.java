package o;

import o.FragmentStateAdapter;
/* loaded from: classes5.dex */
public interface mayHaveInterferingAnimations {
    public static final mayHaveInterferingAnimations$ah$a toString = mayHaveInterferingAnimations$ah$a.ah$a;

    String HaptikSDK$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    long HaptikSDK$b(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    int HaptikSDK$c(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    getCURRENT HaptikSDK$e();

    boolean ag$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    byte ah$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    void ah$a(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver);

    boolean getSignupData();

    short invoke(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    float toString(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    int toString(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver);

    <T> T toString(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i, scheduleGracePeriodEnd<T> schedulegraceperiodend, T t);

    char valueOf(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    double values(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i);

    int values(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver);

    <T> T values(FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i, scheduleGracePeriodEnd<T> schedulegraceperiodend, T t);

    /* loaded from: classes5.dex */
    public static final class valueOf {
        public static int ah$a(mayHaveInterferingAnimations mayhaveinterferinganimations, FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver) {
            runAnimators.ag$a(mayhaveinterferinganimations, "this");
            runAnimators.ag$a(dataSetChangeObserver, "descriptor");
            return -1;
        }

        public static boolean valueOf(mayHaveInterferingAnimations mayhaveinterferinganimations) {
            runAnimators.ag$a(mayhaveinterferinganimations, "this");
            return false;
        }

        public static /* synthetic */ Object valueOf(mayHaveInterferingAnimations mayhaveinterferinganimations, FragmentStateAdapter.DataSetChangeObserver dataSetChangeObserver, int i, scheduleGracePeriodEnd schedulegraceperiodend, Object obj, int i2, Object obj2) {
            if (obj2 == null) {
                if ((i2 & 8) != 0) {
                    obj = null;
                }
                return mayhaveinterferinganimations.values(dataSetChangeObserver, i, schedulegraceperiodend, obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
    }
}
