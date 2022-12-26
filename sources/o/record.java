package o;

import com.appsamurai.storyly.StorylyDataSource;
import com.appsamurai.storyly.StorylyView;
import com.appsamurai.storyly.analytics.StorylyEvent;
import java.util.List;
import o.PathParser;
/* loaded from: classes3.dex */
public interface record {
    void ag$a(StorylyView storylyView);

    void ag$a(StorylyView storylyView, StorylyEvent storylyEvent, PathParser.PathDataNode pathDataNode, addCommand addcommand, PathParser.ExtractFloatResult extractFloatResult);

    void ag$a(StorylyView storylyView, addCommand addcommand);

    void ah$a(StorylyView storylyView);

    void ah$a(StorylyView storylyView, String str);

    void valueOf(StorylyView storylyView, PathParser.PathDataNode pathDataNode, addCommand addcommand, PathParser.ExtractFloatResult extractFloatResult);

    void values(StorylyView storylyView, String str);

    void values(StorylyView storylyView, List<PathParser.PathDataNode> list, StorylyDataSource storylyDataSource);
}
