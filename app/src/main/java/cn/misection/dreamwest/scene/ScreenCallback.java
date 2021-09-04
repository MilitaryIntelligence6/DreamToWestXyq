package cn.misection.dreamwest.scene;

import cn.misection.dreamwest.ui.activity.MainActivity;

import org.loon.framework.android.game.core.graphics.Screen;

/**
 * Created by IntelliJ IDEA.
 * <p/>
 * User: gongdewei
 * Date: 12-3-20
 * Time: 上午12:03
 */
public interface ScreenCallback {
    void onExit(MainActivity activity, Screen screen);
}
