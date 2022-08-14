package other;

import java.util.Objects;

public class Address {
    private String address1;
    private String address2;
    private String landMark;
    private transient int  pinCode;
    private String city;
    private String state;

    public Address(){

    }

    public Address(String address1, String address2, String landMark, int pinCode, String city, String state) {
        this.address1 = address1;
        this.address2 = address2;
        this.landMark = landMark;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", landMark='" + landMark + '\'' +
                ", pinCode=" + pinCode +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return pinCode == address.pinCode && Objects.equals(address1, address.address1) &&
                Objects.equals(address2, address.address2) && Objects.equals(landMark, address.landMark) &&
                Objects.equals(city, address.city) && Objects.equals(state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address1, address2, landMark, pinCode, city, state);
    }

    public Address getDefaultAddress(){
        Address address = new Address();
        address.setAddress1("address1");
        address.setAddress2("address2");
        address.setLandMark("Default LandMark");
        address.setPinCode(123456);
        address.setCity("Nagpur");
        address.setState("MH");
        return address;
    }
}
