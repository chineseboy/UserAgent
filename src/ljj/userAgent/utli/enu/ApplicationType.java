package ljj.userAgent.utli.enu;

/**
 * Created by lijunjie on 2015/10/26.
 */
public enum ApplicationType {

    WEBMAIL("Webmail client"),
    UNKNOWN("unknown");

    private String name;

    private ApplicationType(String name){
       this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
