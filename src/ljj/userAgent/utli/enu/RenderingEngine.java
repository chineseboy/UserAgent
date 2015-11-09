package ljj.userAgent.utli.enu;

/**
 * Created by lijunjie on 2015/10/26.
 */
public enum RenderingEngine {

    TRIDENT("Trident"),

    WORD("Microsoft Office Word"),

    GECKO("Gecko"),

    WEBKIT("WebKit"),

    PRESTO("Presto"),

    MOZILLA("Mozilla"),

    KHTML("KHTML"),

    OTHER("Other");

    String name;

    private RenderingEngine(String name) { this.name = name;
    }

}
