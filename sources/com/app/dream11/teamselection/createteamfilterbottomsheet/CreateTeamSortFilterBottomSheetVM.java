package com.app.dream11.teamselection.createteamfilterbottomsheet;

import androidx.databinding.library.baseAdapters.BR;
import com.app.dream11.teamselection.createteamfilterbottomsheet.CreateTeamSortFilterBottomSheetVM;
import com.app.dream11Pro.R;
import java.io.Serializable;
import java.util.ArrayList;
import o.enableHomeButtonByDefault;
import o.getAlwaysExpand;
import o.m;
import o.runAnimators;
import o.setBot;
/* loaded from: classes3.dex */
public final class CreateTeamSortFilterBottomSheetVM implements Serializable {
    private final m<setBot> itemBinding;
    private ArrayList<setBot> list;
    private final enableHomeButtonByDefault resourceProvider;

    public CreateTeamSortFilterBottomSheetVM(enableHomeButtonByDefault enablehomebuttonbydefault) {
        runAnimators.ag$a(enablehomebuttonbydefault, "resourceProvider");
        this.resourceProvider = enablehomebuttonbydefault;
        this.list = new ArrayList<>();
        m<setBot> mVar = m.toString(new getAlwaysExpand() { // from class: o.setImportant
            @Override // o.getAlwaysExpand
            public final void onItemBind(m mVar2, int i, Object obj) {
                CreateTeamSortFilterBottomSheetVM.m1079itemBinding$lambda0(CreateTeamSortFilterBottomSheetVM.this, mVar2, i, (setBot) obj);
            }
        });
        runAnimators.ah$a(mVar, "of<CreateTeamSortFilterB…)\n            }\n        }");
        this.itemBinding = mVar;
    }

    public final enableHomeButtonByDefault getResourceProvider() {
        return this.resourceProvider;
    }

    public final ArrayList<setBot> getList() {
        return this.list;
    }

    public final void setList(ArrayList<setBot> arrayList) {
        runAnimators.ag$a(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final m<setBot> getItemBinding() {
        return this.itemBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: itemBinding$lambda-0  reason: not valid java name */
    public static final void m1079itemBinding$lambda0(CreateTeamSortFilterBottomSheetVM createTeamSortFilterBottomSheetVM, m mVar, int i, setBot setbot) {
        runAnimators.ag$a(createTeamSortFilterBottomSheetVM, "this$0");
        runAnimators.ag$a(mVar, "itemBinding");
        if (setbot.ah$b()) {
            mVar.ah$a(263, R.layout.res_0x7f0d0092);
            return;
        }
        mVar.ah$a(263, R.layout.res_0x7f0d0093);
        boolean z = true;
        mVar.values(BR.showSeparator, Boolean.valueOf((i == createTeamSortFilterBottomSheetVM.list.size() - 1 || i == 0) ? false : false));
    }
}
