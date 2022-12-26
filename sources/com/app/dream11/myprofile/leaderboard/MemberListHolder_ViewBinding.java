package com.app.dream11.myprofile.leaderboard;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.Unbinder;
import com.app.dream11.ui.CircularImageView;
import com.app.dream11.ui.CustomTextView;
import com.app.dream11Pro.R;
import o.MediaControllerCompat;
import o.dispatchMediaButtonEvent;
/* loaded from: classes6.dex */
public class MemberListHolder_ViewBinding implements Unbinder {
    private View valueOf;
    private MemberListHolder values;

    public MemberListHolder_ViewBinding(final MemberListHolder memberListHolder, View view) {
        this.values = memberListHolder;
        memberListHolder.avatarImg = (CircularImageView) MediaControllerCompat.Callback.ag$a(view, R.id.res_0x7f0a0601, "field 'avatarImg'", CircularImageView.class);
        View valueOf = MediaControllerCompat.Callback.valueOf(view, R.id.profileImage, "field 'relImg' and method 'onClick'");
        memberListHolder.relImg = (RelativeLayout) MediaControllerCompat.Callback.toString(valueOf, R.id.profileImage, "field 'relImg'", RelativeLayout.class);
        this.valueOf = valueOf;
        valueOf.setOnClickListener(new dispatchMediaButtonEvent() { // from class: com.app.dream11.myprofile.leaderboard.MemberListHolder_ViewBinding.4
            @Override // o.dispatchMediaButtonEvent
            public void ag$a(View view2) {
                memberListHolder.onClick(view2);
            }
        });
        memberListHolder.teamName = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.teamName, "field 'teamName'", CustomTextView.class);
        memberListHolder.points = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.points, "field 'points'", CustomTextView.class);
        memberListHolder.rank = (CustomTextView) MediaControllerCompat.Callback.ag$a(view, R.id.rank, "field 'rank'", CustomTextView.class);
        memberListHolder.rankFlag = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.rankFlag, "field 'rankFlag'", ImageView.class);
        memberListHolder.mainRel = (RelativeLayout) MediaControllerCompat.Callback.ag$a(view, R.id.mainRel, "field 'mainRel'", RelativeLayout.class);
        memberListHolder.crown = (ImageView) MediaControllerCompat.Callback.ag$a(view, R.id.crown, "field 'crown'", ImageView.class);
    }
}
