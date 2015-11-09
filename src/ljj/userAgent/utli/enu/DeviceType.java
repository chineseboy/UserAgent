package ljj.userAgent.utli.enu;

/**
 * Created by lijunjie on 2015/10/26.
 */
public enum DeviceType {
    COMPUTER("Computer"),

    MOBILE("Mobile"),

    TABLET("Tablet"),

    GAME_CONSOLE("Game console"),

    DMR("Digital media receiver"),

    UNKNOWN("Unknown");

    String name;

    private DeviceType(String name) { this.name = name; }

    public String getName()
    {
        return this.name;
    }
}
