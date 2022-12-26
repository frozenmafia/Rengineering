package o;

import droidninja.filepicker.fragments.BaseFragment;
import o.MasterKey;
/* loaded from: classes5.dex */
public class keyExists {
    public static void valueOf(androidx.appcompat.app.AppCompatActivity appCompatActivity, int i, BaseFragment baseFragment) {
        androidx.fragment.app.FragmentTransaction beginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.setCustomAnimations(MasterKey.AnonymousClass1.values.slide_left_in, MasterKey.AnonymousClass1.values.slide_left_out);
        beginTransaction.add(i, baseFragment, baseFragment.getClass().getSimpleName());
        beginTransaction.commit();
    }
}
