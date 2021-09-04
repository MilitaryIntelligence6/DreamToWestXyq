package cn.misection.dreamwest.sprite;

import android.graphics.Point;

/**
 * PlayerListener的适配器
 *
 * @author 龚德伟
 * @history 2008-6-15 龚德伟 新建
 */
public class PlayerAdapter implements PlayerListener {


//	protected Context context;
//	protected DataManager dataManager;
//	protected ScriptEngine scriptEngine;
//	protected Application application;
//	protected GameWindow window;
//	protected UIHelper helper;
//
//	public PlayerAdapter() {
//		application = ApplicationHelper.getApplication();
//		context = application.getContext();
//		dataManager = application.getDataManager();
//		scriptEngine = application.getScriptEngine();
//		window = context.getWindow();
//		helper = window.getHelper();
//	}
//
//    public void doAction(Object source, String actionId, Object[] args) {
//		application.doAction(source, actionId, args);
//	}
//
//	public void doAction(Object source, String actionId) {
//		application.doAction(source, actionId);
//	}
//
//	public Option doTalk(Player talker, String chat, Option[] options) {
//		return application.doTalk(talker, chat, options);
//	}
//
//	public void doTalk(Player p, String chat) {
//		application.doTalk(p, chat);
//	}

    @Override
    public void move(Player player, Point increment) {
    }

    @Override
    public void stepOver(Player player) {
    }

    @Override
    public void attack(PlayerEvent evt) {
    }

    @Override
    public void click(PlayerEvent evt) {
    }

    @Override
    public void detect(PlayerEvent evt) {
    }

    @Override
    public void give(PlayerEvent evt) {
    }

    @Override
    public void talk(PlayerEvent evt) {
    }

    @Override
    public void walk(PlayerEvent evt) {
    }
}