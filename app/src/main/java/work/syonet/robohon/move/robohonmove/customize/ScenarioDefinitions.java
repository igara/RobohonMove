package work.syonet.robohon.move.robohonmove.customize;

/**
 * シナリオファイルで使用する定数の定義クラス.<br>
 * <p/>
 * <p>
 * controlタグのtargetにはPackage名を設定すること<br>
 * scene、memory_p(長期記憶の変数名)、resolve variable(アプリ変数解決の変数名)、accostのwordはPackage名を含むこと<br>
 * </p>
 */
public class ScenarioDefinitions {

    /**
     * sceneタグを指定する文字列
     */
    public static final String TAG_SCENE = "scene";
    /**
     * accostタグを指定する文字列
     */
    public static final String TAG_ACCOST = "accost";
    /**
     * target属性を指定する文字列
     */
    public static final String ATTR_TARGET = "target";
    /**
     * function属性を指定する文字列
     */
    public static final String ATTR_FUNCTION = "function";
    /**
     * memory_pを指定するタグ
     */
    public static final String TAG_MEMORY_PERMANENT = "memory_p:";
    /**
     * function：アプリ終了を通知する.
     */
    public static final String FUNC_END_APP = "end_app";
    /**
     * function：プロジェクタ起動を通知する.
     */
    public static final String FUNC_START_PROJECTOR = "start_projector";
    /**
     * Package名.
     */
    protected static final String PACKAGE = "work.syonet.robohon.move.robohonmove";
    /**
     * シナリオ共通: controlタグで指定するターゲット名.
     */
    public static final String TARGET = PACKAGE;
    /**
     * scene名: アプリ共通シーン
     */
    public static final String SCENE_COMMON = PACKAGE + ".scene_common";
    /**
     * scene名: 特定シーン
     */
    public static final String SCENE01 = PACKAGE + ".scene01";
    /**
     * accost名：こんにちは発話実行.
     */
    public static final String ACC_HELLO = ScenarioDefinitions.PACKAGE + ".hello.say";
    /**
     * accost名：あいさつ実行.
     */
    public static final String ACC_GREETING = ScenarioDefinitions.PACKAGE + ".greeting.say";
    /**
     * accost名：願望実行.
     */
    public static final String ACC_HOPE = ScenarioDefinitions.PACKAGE + ".hope.say";
    /**
     * accost名：OK / NO実行.
     */
    public static final String ACC_OK_OR_NO = ScenarioDefinitions.PACKAGE + ".ok_or_no.t1";
    /**
     * accost名：アプリ終了発話実行.
     */
    public static final String ACC_END_APP = ScenarioDefinitions.PACKAGE + ".app_end.execute";
    /**
     * static クラスとして使用する.
     */
    private ScenarioDefinitions() {
    }
}
