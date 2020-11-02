
package com.moringaschool.mycloudtransports;

import java.io.Serializable;
import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Transport implements Serializable, Parcelable
{

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
    public final static Parcelable.Creator<Transport> CREATOR = new Creator<Transport>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Transport createFromParcel(Parcel in) {
            return new Transport(in);
        }

        public Transport[] newArray(int size) {
            return (new Transport[size]);
        }

    }
    ;
    private final static long serialVersionUID = -2864353355056621422L;

    protected Transport(Parcel in) {
        this.requestTime = ((String) in.readValue((String.class.getClassLoader())));
        this.source = ((String) in.readValue((String.class.getClassLoader())));
        this.acknowledgements = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.member, (com.moringaschool.mycloudtransports.Member.class.getClassLoader()));
    }

    public Transport() {
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public Transport withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Transport withSource(String source) {
        this.source = source;
        return this;
    }

    public String getAcknowledgements() {
        return acknowledgements;
    }

    public void setAcknowledgements(String acknowledgements) {
        this.acknowledgements = acknowledgements;
    }

    public Transport withAcknowledgements(String acknowledgements) {
        this.acknowledgements = acknowledgements;
        return this;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public Transport withMember(List<Member> member) {
        this.member = member;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestTime", requestTime).append("source", source).append("acknowledgements", acknowledgements).append("member", member).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requestTime).append(member).append(acknowledgements).append(source).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transport) == false) {
            return false;
        }
        Transport rhs = ((Transport) other);
        return new EqualsBuilder().append(requestTime, rhs.requestTime).append(member, rhs.member).append(acknowledgements, rhs.acknowledgements).append(source, rhs.source).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(requestTime);
        dest.writeValue(source);
        dest.writeValue(acknowledgements);
        dest.writeList(member);
    }

    public int describeContents() {
        return  0;
    }

}
