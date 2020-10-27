package com.moringaschool.mycloudtransports;

import android.os.Parcelable;

import java.io.Serializable;

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

public class Example   implements Serializable, Parcelable {
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
    public final static Parcelable.Creator<Example> CREATOR = new Creator<Example>() {


        @SuppressWarnings({
                "unchecked"
        })
        public Example createFromParcel(Parcel in) {
            return new Example(in);
        }

        public Example[] newArray(int size) {
            return (new Example[size]);
        }

    }
            ;
    private final static long serialVersionUID = 1672087483117134419L;

    protected Example(Parcel in) {
        this.requestTime = ((String) in.readValue((String.class.getClassLoader())));
        this.source = ((String) in.readValue((String.class.getClassLoader())));
        this.acknowledgements = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.member, (com.moringaschool.mycloudtransports.Member.class.getClassLoader()));
    }

    public Example() {
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public Example withRequestTime(String requestTime) {
        this.requestTime = requestTime;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Example withSource(String source) {
        this.source = source;
        return this;
    }

    public String getAcknowledgements() {
        return acknowledgements;
    }

    public void setAcknowledgements(String acknowledgements) {
        this.acknowledgements = acknowledgements;
    }

    public Example withAcknowledgements(String acknowledgements) {
        this.acknowledgements = acknowledgements;
        return this;
    }

    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }

    public Example withMember(List<Member> member) {
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
        if ((other instanceof Example) == false) {
            return false;
        }
        Example rhs = ((Example) other);
        return new EqualsBuilder().append(requestTime, rhs.requestTime).append(member, rhs.member).append(acknowledgements, rhs.acknowledgements).append(source, rhs.source).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(requestTime);
        dest.writeValue(source);
        dest.writeValue(acknowledgements);
        dest.writeList(member);
    }

    public int describeContents() {
        return 0;
    }


}
