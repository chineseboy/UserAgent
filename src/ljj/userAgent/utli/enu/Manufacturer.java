package ljj.userAgent.utli.enu;

/**
 * Created by lijunjie on 2015/10/26.
 */
public enum Manufacturer {

    OTHER(1, "Other"),

    MICROSOFT(2, "Microsoft Corporation"),

    APPLE(3, "Apple Inc."),

    SUN(4, "Sun Microsystems, Inc."),

    SYMBIAN(5, "Symbian Ltd."),

    NOKIA(6, "Nokia Corporation"),

    BLACKBERRY(7, "Research In Motion Limited"),

    PALM(8, "Palm, Inc. "),

    SONY_ERICSSON(9, "Sony Ericsson Mobile Communications AB"),

    SONY(10, "Sony Computer Entertainment, Inc."),

    NINTENDO(11, "Nintendo"),

    OPERA(12, "Opera Software ASA"),

    MOZILLA(13, "Mozilla Foundation"),

    GOOGLE(15, "Google Inc."),

    COMPUSERVE(16, "CompuServe Interactive Services, Inc."),

    YAHOO(17, "Yahoo Inc."),

    AOL(18, "AOL LLC."),

    MMC(19, "Mail.com Media Corporation");

    private final byte id;

    private final String name;


    private Manufacturer(int id,String name){
        this.id = (byte)id;
        this.name = name;
    }

    public byte getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
