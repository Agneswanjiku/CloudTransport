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
//public class Station implements Serializable, Parcelable
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
//    private Coordinate coordinate;
//    @SerializedName("distance")
//    @Expose
//    private Object distance;
//    public final static Parcelable.Creator<Station> CREATOR = new Creator<Station>() {
//
//
//        @SuppressWarnings({
//            "unchecked"
//        })
//        public Station createFromParcel(Parcel in) {
//            return new Station(in);
//        }
//
//        public Station[] newArray(int size) {
//            return (new Station[size]);
//        }
//
//    }
//    ;
//    private final static long serialVersionUID = -291310749559742101L;
//
//    protected Station(Parcel in) {
//        this.id = ((String) in.readValue((String.class.getClassLoader())));
//        this.name = ((String) in.readValue((String.class.getClassLoader())));
//        this.score = ((Object) in.readValue((Object.class.getClassLoader())));
//        this.coordinate = ((Coordinate) in.readValue((Coordinate.class.getClassLoader())));
//        this.distance = ((Object) in.readValue((Object.class.getClassLoader())));
//    }
//
//    public Station() {
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
//    public Station withId(String id) {
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
//    public Station withName(String name) {
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
//    public Station withScore(Object score) {
//        this.score = score;
//        return this;
//    }
//
//    public Coordinate getCoordinate() {
//        return coordinate;
//    }
//
//    public void setCoordinate(Coordinate coordinate) {
//        this.coordinate = coordinate;
//    }
//
//    public Station withCoordinate(Coordinate coordinate) {
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
//    public Station withDistance(Object distance) {
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
//        if ((other instanceof Station) == false) {
//            return false;
//        }
//        Station rhs = ((Station) other);
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
