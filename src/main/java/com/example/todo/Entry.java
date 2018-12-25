package com.example.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String owner;
    private double latitude;
    private double longitude;
    private Date created;
    private Date lastUpdated;
    private String status;

    public Entry() {
    }

    public Entry( String description, String owner ) {
        this.description = description;
        this.owner = owner;
    }

    public Entry(String description) {
        this.description = description;

        this.created     = new Date();
        this.lastUpdated = created;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        if (Double.compare(entry.getLatitude(), getLatitude()) != 0) return false;
        if (Double.compare(entry.getLongitude(), getLongitude()) != 0) return false;
        if (getDescription() != null ? !getDescription().equals(entry.getDescription()) : entry.getDescription() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(entry.getOwner()) : entry.getOwner() != null) return false;
        if (getCreated() != null ? !getCreated().equals(entry.getCreated()) : entry.getCreated() != null) return false;
        if (getLastUpdated() != null ? !getLastUpdated().equals(entry.getLastUpdated()) : entry.getLastUpdated() != null)
            return false;
        return !(getStatus() != null ? !getStatus().equals(entry.getStatus()) : entry.getStatus() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getDescription() != null ? getDescription().hashCode() : 0;
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        temp = Double.doubleToLongBits(getLatitude());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLongitude());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getLastUpdated() != null ? getLastUpdated().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Entry{");
        sb.append("created=").append(created);
        sb.append(", description='").append(description).append('\'');
        sb.append(", owner='").append(owner).append('\'');
        sb.append(", latitude=").append(latitude);
        sb.append(", longitude=").append(longitude);
        sb.append(", lastUpdated=").append(lastUpdated);
        sb.append(", status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
