package cn.dy.pojo;

public class Users {
    private  int id;
    private  int phone;
    private  String uname;
    private  String email;
    private  String address;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", phone=" + phone +
                ", uname='" + uname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Users() {

    }

    public Users(int id, int phone, String uname, String email, String address) {

        this.id = id;
        this.phone = phone;
        this.uname = uname;
        this.email = email;
        this.address = address;
    }
}
