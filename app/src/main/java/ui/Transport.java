
package ui;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Transport {

    @SerializedName("request_time")
    @Expose
    private String requestTime;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("acknowledgements")
    @Expose
    private String acknowledgements;
    @SerializedName("member")
    @Expose
    private List<Member> member = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transport() {
    }

    /**
     * 
     * @param requestTime
     * @param member
     * @param acknowledgements
     * @param source
     */
    public Transport(String requestTime, String source, String acknowledgements, List<Member> member) {
        super();
        this.requestTime = requestTime;
        this.source = source;
        this.acknowledgements = acknowledgements;
        this.member = member;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getAcknowledgements() {
        return acknowledgements;
    }

    public void setAcknowledgements(String acknowledgements) {
        this.acknowledgements = acknowledgements;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

}
