package djhdi.Dependency.beans;/* Author is:Deepak Singh Jangra as Administrator 
    created on 15-08-2020 13:20 */

import java.io.StringWriter;

public class FakeDataSource {
    private String user;
    private String password;
    private String url;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "FakeDataSource{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
