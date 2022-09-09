package ru.plifis.job4j_mail_sender.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

//@Data
//@RequiredArgsConstructor
//@NoArgsConstructor
//@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PassportDto {
    @JsonProperty("Series")
    private Integer series;
    @JsonProperty("Number")
    private Integer number;
    @JsonProperty("Expired")
    private Timestamp expired;
    @JsonProperty("Surname")
    private String surname;
    @JsonProperty("Firstname")
    private String firstname;
    @JsonProperty("Address")
    private String address;

    public PassportDto() {
    }

    public PassportDto(Integer series, Integer number, Timestamp expired, String surname, String firstname, String address) {
        this.series = series;
        this.number = number;
        this.expired = expired;
        this.surname = surname;
        this.firstname = firstname;
        this.address = address;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Timestamp getExpired() {
        return expired;
    }

    public void setExpired(Timestamp expired) {
        this.expired = expired;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}