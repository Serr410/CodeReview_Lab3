package Lab2;

public class Name {
    String fname;
    String sname;
    private String lname;

    public Name(String fname, String sname, String lname) {
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
    }
    public Name() {
        this("Null", "Null", "Null");
    }

    public void setName(String fname, String sname, String lname) {
        this.fname = fname;
        this.sname = sname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        if (this.sname == "") {
            return (this.fname + " " + this.lname);
        }
        if (this.fname == "") {
            return (this.sname + " " + this.lname);
        }
        if (this.sname == "" && this.fname == "") {
            return this.lname;
        }
        return (this.sname + " " + this.fname + " " + this.lname);
    }
}

