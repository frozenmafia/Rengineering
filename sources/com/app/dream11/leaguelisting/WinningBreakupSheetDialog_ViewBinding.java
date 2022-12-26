package com.app.dream11.leaguelisting;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11.ui.DreamRecyclerView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
/* loaded from: classes6.dex */
public class WinningBreakupSheetDialog_ViewBinding implements Unbinder {
    private WinningBreakupSheetDialog ah$a;

    public WinningBreakupSheetDialog_ViewBinding(WinningBreakupSheetDialog winningBreakupSheetDialog, View view) {
        this.ah$a = winningBreakupSheetDialog;
        winningBreakupSheetDialog.recycler_views = (DreamRecyclerView) MediaControllerCompat.Callback.ag$a(view, R.id.recycler_views, "field 'recycler_views'", DreamRecyclerView.class);
        winningBreakupSheetDialog.close = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0290, "field 'close'", CustomTextView.class);
        winningBreakupSheetDialog.maiView = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.maiView, "field 'maiView'", RelativeLayout.class);
        winningBreakupSheetDialog.more = (CardView) MediaControllerCompat.Callback.ag$a(view, R.id.more, "field 'more'", CardView.class);
    }
}
