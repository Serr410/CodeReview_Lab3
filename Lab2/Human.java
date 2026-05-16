package Lab2;

public class Human {
    private int height;
    private Name name;
    private Human father;

    public Human(String fname, int height, Human father){
        this.name = new Name(fname, father.name.sname, father.name.fname + "ович");
        this.setHeight((height));
        this.father = father;
    }
    public Human(String fname, String sname, String lname, int height){
        this.name = new Name(fname, sname, lname);
        this.setHeight((height));
        this.father = new Human("Null-human");
    }
    private Human(String fname){
        this.name = new Name(fname, "", "");
        this.height = -1;
    }
    public Human(){
        this.name = new Name();
        this.height = -1;
        this.father = new Human("Null-human");
    }
    public Human(String fname, int height){
        this.name = new Name(fname, "", "");
        this.setHeight(height);
    }
    public Human(String fname, String sname, int height, Human father){
        this.name = new Name(fname, sname, father.name.fname + "ович");
        this.setHeight((height));
        this.father = father;
    }

    public void setHeight(int height) {
        if (height < 50) {
            System.out.println("Error. Height impossible in " + this.name.toString());
        } else {
            this.height = height;
        }
    }

    @Override
    public String toString() {
        return (name.toString() + " " + height);
    }
}
