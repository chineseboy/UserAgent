package ljj.userAgent.utli.java;

/**
 * Created by lijunjie on 2015/10/26.
 */
public class Version {

    private String version;

    private String majorVersion;

    private String minorVersion;

    public Version(String version,String majorVersion,String minorVersion){
        this.version = version;
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
    }

    public String getVersion() {
        return this.version;
    }

    public String getMajorVersion() {
        return this.majorVersion;
    }

    public String getMinorVersion() {
        return this.minorVersion;
    }

    public String toString()
    {
        return this.version;
    }

    public int hashCode()
    {
        int prime = 31;
        int result = 1;
        result = 31 * result + (this.majorVersion == null ? 0 : this.majorVersion.hashCode());

        result = 31 * result + (this.minorVersion == null ? 0 : this.minorVersion.hashCode());

        result = 31 * result + (this.version == null ? 0 : this.version.hashCode());
        return result;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Version other = (Version)obj;
        if (this.majorVersion == null) {
            if (other.majorVersion != null)
                return false;
        } else if (!this.majorVersion.equals(other.majorVersion))
            return false;
        if (this.minorVersion == null) {
            if (other.minorVersion != null)
                return false;
        } else if (!this.minorVersion.equals(other.minorVersion))
            return false;
        if (this.version == null) {
            if (other.version != null)
                return false;
        } else if (!this.version.equals(other.version))
            return false;
        return true;
    }
}
