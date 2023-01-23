
//student management system
 class Student {
    String name;
    int id;
    int age;
    String address;

    public Student(String name, int id,int age,String adress){
        this.name = name;
        this.age =age;
        this.id = id;
        this.address = address;
        //constructor and we use this. to differentiate the parameter lis and current
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setaddress(String address){
        this.address= address;
    }
    public void setid(int id){
        this.id = id;

    }
    public String getName(){
        return this. name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;

    }
    public int getId(){
        return this.id;
    }

    public static void main(String[] args) {
        Student nina = new Student("nina",1122,20 ,"ethiopia");
        System.out.println(nina.getName());
        System.out.println(nina.getAge());
        System.out.println(nina.getAddress());
        System.out.println(nina.getId());
    }

}
