package o;

import android.content.Context;
import com.app.dream11.model.viewmodel.LeaderBoardViewItem;
import com.app.dream11.myprofile.leaderboard.MemberListHolder;
import com.dream11.androidhelpers.adapters.BaseAdapter;
import com.dream11.androidhelpers.adapters.BaseAdapter$ag$a;
import java.util.List;
/* loaded from: classes3.dex */
public class bottomToTop extends BaseAdapter {
    private valueOf ah$a;
    private List<LeaderBoardViewItem> toString;
    private Context valueOf;

    /* loaded from: classes3.dex */
    public interface valueOf {
        void ah$a(LeaderBoardViewItem leaderBoardViewItem);

        void values(LeaderBoardViewItem leaderBoardViewItem);
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int valueOf(int i) {
        return com.app.dream11Pro.R.layout.res_0x7f0d0355;
    }

    public bottomToTop(valueOf valueof) {
        this.ah$a = valueof;
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public void values(BaseAdapter$ag$a baseAdapter$ag$a, int i) {
        MemberListHolder memberListHolder = (MemberListHolder) baseAdapter$ag$a;
        memberListHolder.ag$a(this.ah$a);
        memberListHolder.toString(this.toString.get(i));
    }

    @Override // com.dream11.androidhelpers.adapters.BaseAdapter
    public int values() {
        List<LeaderBoardViewItem> list = this.toString;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void ah$a(List<LeaderBoardViewItem> list, Context context) {
        int values = values();
        this.toString = list;
        this.valueOf = context;
        ag$a(values, values());
    }
}
