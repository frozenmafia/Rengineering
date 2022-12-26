package com.app.dream11.playerpoints;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.app.dream11.dream11.BaseFragment;
import com.app.dream11.model.PlayerScoreCard;
import com.app.dream11Pro.R;
/* loaded from: classes3.dex */
public class PreviewPlayerStatsFragment extends BaseFragment {
    private PlayerScoreCard ah$a;
    private ViewDataBinding toString;
    private View valueOf;

    public static PreviewPlayerStatsFragment ag$a(PlayerScoreCard playerScoreCard) {
        PreviewPlayerStatsFragment previewPlayerStatsFragment = new PreviewPlayerStatsFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("playerObject", playerScoreCard);
        previewPlayerStatsFragment.setArguments(bundle);
        return previewPlayerStatsFragment;
    }

    @Override // com.app.dream11.dream11.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.ah$a = (PlayerScoreCard) getArguments().getSerializable("playerObject");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.toString == null) {
            ViewDataBinding inflate = DataBindingUtil.inflate(getLayoutInflater(), R.layout.res_0x7f0d03f1, null, false);
            this.toString = inflate;
            this.valueOf = inflate.getRoot();
        }
        this.toString.setVariable(263, this.ah$a);
        return this.valueOf;
    }
}
