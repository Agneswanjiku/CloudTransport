
package com.moringaschool.mycloudtransports;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Member implements Serializable, Parcelable
{

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;
    @SerializedName("accuracy")
    @Expose
    private Long accuracy;
    @SerializedName("station_code")
    @Expose
    private String stationCode;
    @SerializedName("tiploc_code")
    @Expose
    private String tiplocCode;
    public final static Parcelable.Creator<Member> CREATOR = new Creator<Member>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Member createFromParcel(Parcel in) {
            return new Member(in);
        }

        public Member[] newArray(int size) {
            return (new Member[size]);
        }

    }
    ;
    private final static long serialVersionUID = 8137318818189364120L;

    protected Member(Parcel in) {
        this.type = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.latitude = ((Double) in.readValue((Double.class.getClassLoader())));
        this.longitude = ((Double) in.readValue((Double.class.getClassLoader())));
        this.accuracy = ((Long) in.readValue((Long.class.getClassLoader())));
        this.stationCode = ((String) in.readValue((String.class.getClassLoader())));
        this.tiplocCode = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Member() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Member withType(String type) {
        this.type = type;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member withName(String name) {
        this.name = name;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Member withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Member withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Long getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Long accuracy) {
        this.accuracy = accuracy;
    }

    public Member withAccuracy(Long accuracy) {
        this.accuracy = accuracy;
        return this;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public Member withStationCode(String stationCode) {
        this.stationCode = stationCode;
        return this;
    }

    public String getTiplocCode() {
        return tiplocCode;
    }

    public void setTiplocCode(String tiplocCode) {
        this.tiplocCode = tiplocCode;
    }

    public Member withTiplocCode(String tiplocCode) {
        this.tiplocCode = tiplocCode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("name", name).append("latitude", latitude).append("longitude", longitude).append("accuracy", accuracy).append("stationCode", stationCode).append("tiplocCode", tiplocCode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stationCode).append(latitude).append(name).append(tiplocCode).append(accuracy).append(type).append(longitude).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return new EqualsBuilder().append(stationCode, rhs.stationCode).append(latitude, rhs.latitude).append(name, rhs.name).append(tiplocCode, rhs.tiplocCode).append(accuracy, rhs.accuracy).append(type, rhs.type).append(longitude, rhs.longitude).isEquals();
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(type);
        dest.writeValue(name);
        dest.writeValue(latitude);
        dest.writeValue(longitude);
        dest.writeValue(accuracy);
        dest.writeValue(stationCode);
        dest.writeValue(tiplocCode);
    }

    public int describeContents() {
        return  0;
    }

}
