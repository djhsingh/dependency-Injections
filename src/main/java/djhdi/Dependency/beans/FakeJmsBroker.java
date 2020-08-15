package djhdi.Dependency.beans;/* Author is:Deepak Singh Jangra as Administrator 
    created on 15-08-2020 14:23 */

public class FakeJmsBroker {
    private String jmsuser;
    private String jmspassword;
    private String jmsurl;

    public String getJmsuser() {
        return jmsuser;
    }

    public void setJmsuser(String jmsuser) {
        this.jmsuser = jmsuser;
    }

    public String getJmspassword() {
        return jmspassword;
    }

    public void setJmspassword(String jmspassword) {
        this.jmspassword = jmspassword;
    }

    public String getJmsurl() {
        return jmsurl;
    }

    public void setJmsurl(String jmsurl) {
        this.jmsurl = jmsurl;
    }

    @Override
    public String toString() {
        return "FakeJmsBroker{" +
                "jmsuser='" + jmsuser + '\'' +
                ", jmspassword='" + jmspassword + '\'' +
                ", jmsurl='" + jmsurl + '\'' +
                '}';
    }
}
