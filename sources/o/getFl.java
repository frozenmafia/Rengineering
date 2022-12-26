package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.app.dream11.model.FetchVerificationResponse;
import com.app.dream11.verification.BankFragment;
import com.app.dream11.verification.MobileFragment;
import com.app.dream11.verification.PanFragment;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class getFl extends getShortcutInfoSaverInstance {
    String ag$a;
    FetchVerificationResponse ah$a;
    public Context toString;
    boolean valueOf;
    ArrayList<String> values;

    @Override // androidx.fragment.app.FragmentStatePagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Parcelable saveState() {
        return null;
    }

    public getFl(ArrayList<String> arrayList, androidx.fragment.app.FragmentManager fragmentManager, Context context, FetchVerificationResponse fetchVerificationResponse, String str) {
        super(fragmentManager);
        this.values = new ArrayList<>();
        this.toString = null;
        this.ag$a = null;
        this.values = arrayList;
        this.toString = context;
        this.ah$a = fetchVerificationResponse;
        this.valueOf = this.valueOf;
        this.ag$a = str;
    }

    public androidx.fragment.app.Fragment ag$a() {
        PanFragment panFragment = new PanFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", this.ah$a);
        bundle.putString("callFrom", this.ag$a);
        panFragment.setArguments(bundle);
        return panFragment;
    }

    public androidx.fragment.app.Fragment values() {
        BankFragment bankFragment = new BankFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", this.ah$a);
        bundle.putString("callFrom", this.ag$a);
        bankFragment.setArguments(bundle);
        return bankFragment;
    }

    public androidx.fragment.app.Fragment valueOf() {
        MobileFragment mobileFragment = new MobileFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("data", this.ah$a);
        bundle.putString("callFrom", this.ag$a);
        mobileFragment.setArguments(bundle);
        return mobileFragment;
    }

    @Override // androidx.fragment.app.FragmentStatePagerAdapter
    public androidx.fragment.app.Fragment getItem(int i) {
        if (i == 1) {
            return ag$a();
        }
        if (i == 0) {
            return valueOf();
        }
        return values();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.values.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        return this.values.get(i).toString();
    }

    @Override // o.getShortcutInfoSaverInstance
    public String toString(int i) {
        return getPageTitle(i).toString();
    }
}
