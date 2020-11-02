//
//package com.moringaschool.mycloudtransports;
//
//import java.io.Serializable;
//import android.os.Parcel;
//import android.os.Parcelable;
//import android.os.Parcelable.Creator;
//import com.google.gson.annotations.Expose;
//import com.google.gson.annotations.SerializedName;
//
//import org.apache.commons.lang.builder.HashCodeBuilder;
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//public class Location implements Serializable, Parcelable
//{
//
//    @SerializedName("id")
//    @Expose
//    private String id;
//    @SerializedName("name")
//    @Expose
//    private String name;
//    @SerializedName("score")
//    @Expose
//    private Object score;
//    @SerializedName("coordinate")
//    @Expose
//    private Coordinate_ coordinate;
//    @SerializedName("distance")
//    @Expose
//    private Object distance;
//    public final static Parcelable.Creator<Location> CREATOR = new Creator<Location>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Location createFromParcel(Parcel in) {
//            return new Location(in);
//        }
//
//        public Location[] newArray(int size) {
//            return (new Location[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = 142998449464721442L;
//
//    protected Location(Parcel in) {
//        this.id = ((String) in.readValue((String.class.getClassLoader())));
//        this.name = ((String) in.readValue((String.class.getClassLoader())));
//        this.score = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.coordinate = ((Coordinate_) in.readValue((Coordinate_.class.getClassLoader())));
//        this.distance = ((Object) in.readValue((Object.class.getClassLoader())));
//    }
//
//    public Location() {
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public Location withId(String id) {
//        this.id = id;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Location withName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public Object getScore() {
//        return score;
//    }
//
//    public void setScore(Object score) {
//        this.score = score;
//    }
//
//    public Location withScore(Object score) {
//        this.score = score;
//        return this;
//    }
//
//    public Coordinate_ getCoordinate() {
//        return coordinate;
//    }
//
//    public void setCoordinate(Coordinate_ coordinate) {
//        this.coordinate = coordinate;
//    }
//
//    public Location withCoordinate(Coordinate_ coordinate) {
//        this.coordinate = coordinate;
//        return this;
//    }
//
//    public Object getDistance() {
//        return distance;
//    }
//
//    public void setDistance(Object distance) {
//        this.distance = distance;
//    }
//
//    public Location withDistance(Object distance) {
//        this.distance = distance;
//        return this;
//    }
//
//    @Override
//    public String toString() {
//        return new ToStringBuilder(this).append("id", id).append("name", name).append("score", score).append("coordinate", coordinate).append("distance", distance).toString();
//    }
//
//    @Override
//    public int hashCode() {
//        return new HashCodeBuilder().append(name).append(score).append(id).append(coordinate).append(distance).toHashCode();
//    }
//
//    @Override
//    public boolean equals(Object other) {
//        if (other == this) {
//            return true;
//        }
//        if ((other instanceof Location) == false) {
//            return false;
//        }
//        Location rhs = ((Location) other);
//        return new EqualsBuilder().append(name, rhs.name).append(score, rhs.score).append(id, rhs.id).append(coordinate, rhs.coordinate).append(distance, rhs.distance).isEquals();
//    }
//
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeValue(id);
//        dest.writeValue(name);
//        dest.writeValue(score);
//        dest.writeValue(coordinate);
//        dest.writeValue(distance);
//    }
//
//    public int describeContents() {
//        return  0;
//    }
//
//}
