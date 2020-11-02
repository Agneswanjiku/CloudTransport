//
//package com.moringaschool.mycloudtransports;
//
//import java.io.Serializable;
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.os.Parcelable.Creator;
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//import org.apache.commons.lang.builder.EqualsBuilder;
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//public class From implements Serializable, Parcelable
//{
//
//    @SerializedName("station")
//    @Expose
//    private Station station;
//    @SerializedName("arrival")
//    @Expose
//    private Object arrival;
//    @SerializedName("arrivalTimestamp")
//    @Expose
//    private Object arrivalTimestamp;
//    @SerializedName("departure")
//    @Expose
//    private String departure;
//    @SerializedName("departureTimestamp")
//    @Expose
//    private Long departureTimestamp;
//    @SerializedName("delay")
//    @Expose
//    private Long delay;
//    @SerializedName("platform")
//    @Expose
//    private String platform;
//    @SerializedName("prognosis")
//    @Expose
//    private Prognosis prognosis;
//    @SerializedName("realtimeAvailability")
//    @Expose
//    private Object realtimeAvailability;
//    @SerializedName("location")
//    @Expose
//    private Location location;
//    public final static Parcelable.Creator<From> CREATOR = new Creator<From>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public From createFromParcel(Parcel in) {
//            return new From(in);
//        }
//
//        public From[] newArray(int size) {
//            return (new From[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -501444656000934137L;
//
//    protected From(Parcel in) {
//        this.station = ((Station) in.readValue((Station.class.getClassLoader())));
//        this.arrival = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.arrivalTimestamp = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.departure = ((String) in.readValue((String.class.getClassLoader())));
//        this.departureTimestamp = ((Long) in.readValue((Long.class.getClassLoader())));
//        this.delay = ((Long) in.readValue((Long.class.getClassLoader())));
//        this.platform = ((String) in.readValue((String.class.getClassLoader())));
//        this.prognosis = ((Prognosis) in.readValue((Prognosis.class.getClassLoader())));
//        this.realtimeAvailability = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.location = ((Location) in.readValue((Location.class.getClassLoader())));
//    }
//
//    public From() {
//    }
//
//    public Station getStation() {
//        return station;
//    }
//
//    public void setStation(Station station) {
//        this.station = station;
//    }
//
//    public From withStation(Station station) {
//        this.station = station;
//        return this;
//    }
//
//    public Object getArrival() {
//        return arrival;
//    }
//
//    public void setArrival(Object arrival) {
//        this.arrival = arrival;
//    }
//
//    public From withArrival(Object arrival) {
//        this.arrival = arrival;
//        return this;
//    }
//
//    public Object getArrivalTimestamp() {
//        return arrivalTimestamp;
//    }
//
//    public void setArrivalTimestamp(Object arrivalTimestamp) {
//        this.arrivalTimestamp = arrivalTimestamp;
//    }
//
//    public From withArrivalTimestamp(Object arrivalTimestamp) {
//        this.arrivalTimestamp = arrivalTimestamp;
//        return this;
//    }
//
//    public String getDeparture() {
//        return departure;
//    }
//
//    public void setDeparture(String departure) {
//        this.departure = departure;
//    }
//
//    public From withDeparture(String departure) {
//        this.departure = departure;
//        return this;
//    }
//
//    public Long getDepartureTimestamp() {
//        return departureTimestamp;
//    }
//
//    public void setDepartureTimestamp(Long departureTimestamp) {
//        this.departureTimestamp = departureTimestamp;
//    }
//
//    public From withDepartureTimestamp(Long departureTimestamp) {
//        this.departureTimestamp = departureTimestamp;
//        return this;
//    }
//
//    public Long getDelay() {
//        return delay;
//    }
//
//    public void setDelay(Long delay) {
//        this.delay = delay;
//    }
//
//    public From withDelay(Long delay) {
//        this.delay = delay;
//        return this;
//    }
//
//    public String getPlatform() {
//        return platform;
//    }
//
//    public void setPlatform(String platform) {
//        this.platform = platform;
//    }
//
//    public From withPlatform(String platform) {
//        this.platform = platform;
//        return this;
//    }
//
//    public Prognosis getPrognosis() {
//        return prognosis;
//    }
//
//    public void setPrognosis(Prognosis prognosis) {
//        this.prognosis = prognosis;
//    }
//
//    public From withPrognosis(Prognosis prognosis) {
//        this.prognosis = prognosis;
//        return this;
//    }
//
//    public Object getRealtimeAvailability() {
//        return realtimeAvailability;
//    }
//
//    public void setRealtimeAvailability(Object realtimeAvailability) {
//        this.realtimeAvailability = realtimeAvailability;
//    }
//
//    public From withRealtimeAvailability(Object realtimeAvailability) {
//        this.realtimeAvailability = realtimeAvailability;
//        return this;
//    }
//
//    public Location getLocation() {
//        return location;
//    }
//
//    public void setLocation(Location location) {
//        this.location = location;
//    }
//
//    public From withLocation(Location location) {
//        this.location = location;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("station", station).append("arrival", arrival).append("arrivalTimestamp", arrivalTimestamp).append("departure", departure).append("departureTimestamp", departureTimestamp).append("delay", delay).append("platform", platform).append("prognosis", prognosis).append("realtimeAvailability", realtimeAvailability).append("location", location).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(arrivalTimestamp).append(delay).append(arrival).append(departureTimestamp).append(station).append(location).append(departure).append(realtimeAvailability).append(prognosis).append(platform).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof From) == false) {
//            return false;
//        }
//        From rhs = ((From) other);
//        return new EqualsBuilder().append(arrivalTimestamp, rhs.arrivalTimestamp).append(delay, rhs.delay).append(arrival, rhs.arrival).append(departureTimestamp, rhs.departureTimestamp).append(station, rhs.station).append(location, rhs.location).append(departure, rhs.departure).append(realtimeAvailability, rhs.realtimeAvailability).append(prognosis, rhs.prognosis).append(platform, rhs.platform).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(station);
//        dest.writeValue(arrival);
//        dest.writeValue(arrivalTimestamp);
//        dest.writeValue(departure);
//        dest.writeValue(departureTimestamp);
//        dest.writeValue(delay);
//        dest.writeValue(platform);
//        dest.writeValue(prognosis);
//        dest.writeValue(realtimeAvailability);
//        dest.writeValue(location);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//}
